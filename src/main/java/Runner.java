

import model.Equipo;
import model.Partido;
import repo.DatasourceFactory;
import repo.RepoPartido;
import repo.RepoPartidoJDBC;

public class Runner {
	private static final String DB = "jugadores";

	public static void main(String[] args) {
		
		RepoPartido repo = new RepoPartidoJDBC(DatasourceFactory.createDatasource(DB));
		
		Equipo local = new Equipo(1, "boca");
		Equipo visitante = new Equipo(2, "independiente");
		System.out.println(repo.getPartido(local, visitante));
		System.out.println(repo.getPartido(local, visitante));

	}
}
