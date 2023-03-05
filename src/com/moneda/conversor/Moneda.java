package com.moneda.conversor;

public class Moneda extends Unidad implements Convertible{
	
	private String moneda;
	

	public Moneda() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moneda(double valor, double cantidad, String tipoConversion) {
		super(valor, cantidad, tipoConversion);
		// TODO Auto-generated constructor stub
	}

	public Moneda(double valor, double cantidad) {
		super(valor, cantidad);
		// TODO Auto-generated constructor stub
	}
	
	
	public Moneda(double valor, double cantidad, String tipoConversion, String moneda) {
		super(valor, cantidad, tipoConversion);
		// TODO Auto-generated constructor stub
		this.moneda = moneda;
	}

	@Override
	public void convertir(Moneda moneda, String tipoConversion) {
		// TODO Auto-generated method stub
		
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
	
	
	
	
	
}
