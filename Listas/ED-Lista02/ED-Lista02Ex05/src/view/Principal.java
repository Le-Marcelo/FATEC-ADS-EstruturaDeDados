package view;

import controller.MDCController;

public class Principal {

	public static void main(String[] args) {
		int x = 20, y = 24;
		
		MDCController mdc = new MDCController();
		
		int resultado = mdc.MDC(x, y);
		System.out.println(resultado);

	}

}
