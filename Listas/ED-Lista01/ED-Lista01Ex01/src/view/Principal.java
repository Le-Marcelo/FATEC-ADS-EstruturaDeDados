package view;

import controller.CalculoController;

public class Principal {

	public static void main(String[] args) {
		int n = 5;
		
		CalculoController cc = new CalculoController();
		int resultado = cc.calculo(n);
		System.out.println(resultado);

	}

}
