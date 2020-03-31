package com.barbaro.chilaquilandia.modelos;

import java.util.List;

public class OrdenChilaquil {
	
	// Declaracion de atributos
	private String tama�o;
	private String salsa;
	private String consistencia;
	private List<String> toppings;
	private List<String> extras;
	private String tipoHuevo;
	private String bebida;
	private String tama�oBebida;
	
	// Constructor
	public OrdenChilaquil() {
		
	}

	public OrdenChilaquil(String tama�o, String salsa, String consistencia,
			List<String> toppings, List<String> extras, String tipoHuevo,
			String bebida, String tama�oBebida) {
		super();
		this.tama�o = tama�o;
		this.salsa = salsa;
		this.consistencia = consistencia;
		this.toppings = toppings;
		this.extras = extras;
		this.tipoHuevo = tipoHuevo;
		this.bebida = bebida;
		this.tama�oBebida = tama�oBebida;
	}
	
	// Getters y setters
	public String getTama�o() {
		return tama�o;
	}
	
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public String getSalsa() {
		return salsa;
	}

	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}

	public String getConsistencia() {
		return consistencia;
	}

	public void setConsistencia(String consistencia) {
		this.consistencia = consistencia;
	}

	public List<String> getToppings() {
		return toppings;
	}

	public void setToppings(List<String> toppings) {
		this.toppings = toppings;
	}

	public List<String> getExtras() {
		return extras;
	}

	public void setExtras(List<String> extras) {
		this.extras = extras;
	}

	public String getTipoHuevo() {
		return tipoHuevo;
	}

	public void setTipoHuevo(String tipoHuevo) {
		this.tipoHuevo = tipoHuevo;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public String getTama�oBebida() {
		return tama�oBebida;
	}

	public void setTama�oBebida(String tama�oBebida) {
		this.tama�oBebida = tama�oBebida;
	}
	
}
