package com.moneda.conversor;

public abstract class Unidad implements Convertible {
	private double valor;
	private double cantidad;
	private String tipoConversion;
	
	public Unidad() {
	
	}
	
	
	public Unidad(double valor, double cantidad) {
		this.valor = valor;
		this.cantidad = cantidad;
	}
	

	public Unidad(double valor, double cantidad, String tipoConversion) {
		this.valor = valor;
		this.cantidad = cantidad;
		this.tipoConversion = tipoConversion;
	}


	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getTipoConversion() {
		return tipoConversion;
	}
	
	public void setTipoConversion(String tipoConversion) {
		this.tipoConversion = tipoConversion;
	}	
}
