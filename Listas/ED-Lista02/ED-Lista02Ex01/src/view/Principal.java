package view;

import controller.MultiplicacaoController;

public class Principal {

	public static void main(String[] args) {
		int numA = 3, numB = 4;
		
		MultiplicacaoController mc = new MultiplicacaoController();
		
		int resultado = mc.Multiplicacao(numA, numB);
		System.out.println(resultado);

	}

}
