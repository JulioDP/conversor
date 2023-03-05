package com.moneda.conversor;

public class Temperatura extends Unidad implements Convertible {
	
	private TiposTemperatura temperatura;
	
	
	

	public Temperatura() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Temperatura(double valor, double cantidad, String tipoConversion) {
		super(valor, cantidad, tipoConversion);
		// TODO Auto-generated constructor stub
	}




	public Temperatura(double valor, double cantidad) {
		super(valor, cantidad);
		// TODO Auto-generated constructor stub
	}




	@Override
	public void convertir(Unidad tem, String tipoConversion) {
		// TODO Auto-generated method stub
		switch(tipoConversion){
		case "De Celsius a Kelvin":
			tem.setCantidad(getValor()+2073.15);
			break;
			
		case "De Kelvin a Celsius":
			tem.setCantidad(getValor()-2073.15);
			break;
		case "De Celsius a Fahrenheit":
			tem.setCantidad(getValor()*1.8 + 32);
			break;
		case "De Fahrenheit a Celsius":
			tem.setCantidad((getValor()-32)/1.8);
			break;
		case "De Kelvin a Fahrenheit":
			tem.setCantidad(1.8*(getValor()-273.15) + 32);
			break;
		case "De Fahrenheit a Kelvin":
			tem.setCantidad((getValor() -32)/1.8 + 273.15);
			break;
			
			
		}
	}
	

}
