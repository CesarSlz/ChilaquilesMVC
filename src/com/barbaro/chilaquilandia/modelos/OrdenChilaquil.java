package com.barbaro.chilaquilandia.modelos;

import java.util.List;

public class OrdenChilaquil {
	
	// Declaracion de atributos
	private String tamaņo;
	private String salsa;
	private String consistencia;
	private List<String> toppings;
	private List<String> extras;
	private String tipoHuevo;
	private String bebida;
	private String tamaņoBebida;
	
	// Constructor
	public OrdenChilaquil() {
		
	}

	public OrdenChilaquil(String tamaņo, String salsa, String consistencia,
			List<String> toppings, List<String> extras, String tipoHuevo,
			String bebida, String tamaņoBebida) {
		super();
		this.tamaņo = tamaņo;
		this.salsa = salsa;
		this.consistencia = consistencia;
		this.toppings = toppings;
		this.extras = extras;
		this.tipoHuevo = tipoHuevo;
		this.bebida = bebida;
		this.tamaņoBebida = tamaņoBebida;
	}
	
	// Getters y setters
	public String getTamaņo() {
		return tamaņo;
	}
	
	public void setTamaņo(String tamaņo) {
		this.tamaņo = tamaņo;
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

	public String getTamaņoBebida() {
		return tamaņoBebida;
	}

	public void setTamaņoBebida(String tamaņoBebida) {
		this.tamaņoBebida = tamaņoBebida;
	}
	
}
