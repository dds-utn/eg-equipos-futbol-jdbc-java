package model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Jugador {

	private String nombre;

	public Jugador(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
}
