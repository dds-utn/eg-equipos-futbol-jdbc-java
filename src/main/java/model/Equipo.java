package model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Equipo {
	private int id;
	private String name;

	public Equipo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

}
