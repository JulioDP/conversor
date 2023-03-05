package com.moneda.conversor;

public enum TiposMonedas {
	
	PESO_MXN(1),
	DOLAR(0.055641842),
	EURO(0.052270255),
	DOLAR_CAMADIENCE(0.075698657),
	YEN(7.5566262),
	RUBLO(4.212093),
	WON(72.146901),
	LIBRA(0.046229473);
	
	private double value;
	
	private TiposMonedas(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
}
