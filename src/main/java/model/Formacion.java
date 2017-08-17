package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Formacion {

	private int id;
	private Equipo equipo;
	private List<Jugador> jugadores;
	int goles;

	public Formacion(int id, Equipo equipo, int goles) {
		super();
		this.id = id;
		this.equipo = equipo;
		this.goles = goles;
		this.jugadores = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public int getGoles() {
		return goles;
	}

	public Optional<Equipo> ganador(Formacion formacionContraria) {
		if (goles == formacionContraria.goles) {
			return Optional.empty();
		} else if (goles > formacionContraria.goles) {
			return Optional.of(equipo);
		} else {
			return Optional.of(formacionContraria.getEquipo());
		}
	}

	public void agregarJugador(String nombre) {
		jugadores.add(new Jugador(nombre));
	}

}
