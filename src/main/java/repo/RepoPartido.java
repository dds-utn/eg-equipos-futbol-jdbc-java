package repo;

import model.Equipo;
import model.Partido;

public interface RepoPartido {

	Partido getPartido(Equipo local, Equipo visitante);

}