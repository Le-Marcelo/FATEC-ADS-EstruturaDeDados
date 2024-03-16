package view;

import controller.QuantDigitosController;

public class Principal {

	public static void main(String[] args) {
		int num = 12345;
		
		QuantDigitosController qdc = new QuantDigitosController();
		
		int resultado = qdc.QuantDigitos(num);
		System.out.println(resultado);

	}

}
