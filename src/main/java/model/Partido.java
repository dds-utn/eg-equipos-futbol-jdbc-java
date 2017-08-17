package model;

import org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle;
import org.apache.commons.lang3.builder.RecursiveToStringStyle;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Partido {

	private Formacion local;
	private Formacion visitante;

	public Formacion getLocal() {
		return local;
	}

	public Formacion getVisitante() {
		return visitante;
	}

	public void setLocal(Formacion local) {
		this.local = local;
	}

	public void setVisitante(Formacion visitante) {
		this.visitante = visitante;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, new MultilineRecursiveToStringStyle());
	}

}
