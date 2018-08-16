

import model.Equipo;
import model.Partido;
import repo.DatasourceFactory;
import repo.RepoPartido;
import repo.RepoPartidoJDBC;

public class Runner {
	private static final String DB = "jugadores";

	public static void main(String[] args) {
		
		Equipo local = new Equipo(1, null);
		Equipo visitante = new Equipo(2, null);
		Partido partido = repo.getPartido(local, visitante);
		System.out.println(partido);
		RepoPartido repo = new RepoPartidoJDBC(DatasourceFactory.createDatasource(DB));
	}
}
