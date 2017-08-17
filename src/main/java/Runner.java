

import model.Equipo;
import model.Partido;
import repo.RepoPartidoJDBC;

public class Runner {
	private static final String DB = "jugadores";

	public static void main(String[] args) {
		RepoPartidoJDBC repo = new RepoPartidoJDBC(DB);
		
		Equipo local = new Equipo(1, null);
		Equipo visitante = new Equipo(2, null);
		Partido partido = repo.getPartido(local, visitante);
		System.out.println(partido);
	}
}
