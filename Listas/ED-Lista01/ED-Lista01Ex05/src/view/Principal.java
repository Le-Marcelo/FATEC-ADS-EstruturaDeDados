package view;

import controller.CalculoController;

public class Principal {

	public static void main(String[] args) {
		int n = 5;
		
		CalculoController cc = new CalculoController();
		double resultado = cc.CalculoSerie(n);
		System.out.println(String.format("%.3f", resultado));

	}

}
