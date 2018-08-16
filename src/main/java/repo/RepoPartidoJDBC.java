package repo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import model.Equipo;
import model.Formacion;
import model.Partido;

public class RepoPartidoJDBC implements RepoPartido {

	private BasicDataSource dataSource;

	public RepoPartidoJDBC(BasicDataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	public Partido getPartido(Equipo local, Equipo visitante) {
		Partido partido = getPartidoEnLaDb(local, visitante);
		
		cargarJugadores(partido.getLocal());
		cargarJugadores(partido.getVisitante());
		
		return partido;
	}

	private Partido getPartidoEnLaDb(Equipo local, Equipo visitante) {
		ResultSetHandler<Partido> handler = (rs) -> {
			if (!rs.next()) {
	            return null;
	        }
			
			Partido partido = new Partido();
			partido.setLocal(cargarFormacion(rs, "loc"));
			partido.setVisitante(cargarFormacion(rs, "vis"));
			return partido;
		};
		
		return doQuery(
			"select * "
			+ "from partidos p "
			+ "inner join formacion for_loc on p.formacion_local_id = for_loc.formacion_id "
			+ "inner join formacion for_vis on p.formacion_visitante_id = for_vis.formacion_id "
			+ "inner join equipos eq_loc on for_loc.equipo_id = eq_loc.equipo_id "
			+ "inner join equipos eq_vis on for_vis.equipo_id = eq_vis.equipo_id "
			+ "where eq_loc.equipo_id = " + local.getId() + " "
					+ "and "
					+ "eq_vis.equipo_id = " + visitante.getId(), handler);
	}

	private Formacion cargarFormacion(ResultSet rs, String prefix) throws SQLException {
		Equipo equipo = new Equipo(
				rs.getInt("eq_" + prefix + ".equipo_id"), 
				rs.getString("eq_" + prefix + ".nombre"));
		
		return new Formacion(
				rs.getInt("for_" + prefix + ".formacion_id"), 
				equipo, 
				rs.getInt("for_" + prefix + ".goles"));
	}

	private void cargarJugadores(Formacion formacion) {
		ResultSetHandler<Void> handler = (rs) -> {
			while(rs.next()) {
				formacion.agregarJugador(rs.getString("j.nombre"));			
			}
			return null;
		};
		
		String sql =
				"select * "
				+ "from formacion f "
				+ "inner join formacion_jugador fj on f.formacion_id = fj.formacion_id "
				+ "inner join jugadores j on fj.jugador_id = j.jugador_id "
				+ "where f.formacion_id = " + formacion.getId();

		
		doQuery(sql , handler);
	}

	private <T> T doQuery(String sql, ResultSetHandler<T> handler) {
		try {
			QueryRunner run = new QueryRunner(this.dataSource);
				return run.query(sql, handler);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
