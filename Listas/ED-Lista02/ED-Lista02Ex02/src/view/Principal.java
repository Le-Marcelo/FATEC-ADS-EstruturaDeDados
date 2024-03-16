package view;

import controller.RestoController;

public class Principal {

	public static void main(String[] args) {
		int dividendo = 21, divisor = 5;
		
		RestoController rc = new RestoController();
		
		int resultado = rc.Resto(dividendo, divisor);
		System.out.println(resultado);

	}

}
