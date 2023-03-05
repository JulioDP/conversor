package com.moneda.conversor;

import javax.swing.JOptionPane;

public class Moneda extends Unidad implements Convertible{
	
	private TiposMonedas tipoMoneda;
	

	

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


	@Override
	public void convertir(Moneda moneda, String tipoConversion) {
		// TODO Auto-generated method stub
		switch(tipoConversion){
		case "De Peso MXN a Dolar":
			tipoMoneda = TiposMonedas.DOLAR;
			this.setCantidad(moneda.getValor()*tipoMoneda.getValue());
			break;
		case "De Peso MXN a Euro":
			tipoMoneda = TiposMonedas.EURO;
			this.setCantidad(moneda.getValor()*tipoMoneda.getValue());
			break;
		case "De Peso MXN a Libras Esterlinas":
			tipoMoneda = TiposMonedas.LIBRA;
			this.setCantidad(moneda.getValor()*tipoMoneda.getValue());
			break;
		case "Peso MXN a Yen":
			tipoMoneda = TiposMonedas.YEN;
			this.setCantidad(moneda.getValor()*tipoMoneda.getValue());
			break;
		case "Peso MXN a Won":
			tipoMoneda = TiposMonedas.WON;
			this.setCantidad(moneda.getValor()*tipoMoneda.getValue());
			break;
		}
		
	}

	public TiposMonedas getTipoMoneda() {
		return tipoMoneda;
	}

	public void setTipoMoneda(TiposMonedas tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}

	

	
	
}
