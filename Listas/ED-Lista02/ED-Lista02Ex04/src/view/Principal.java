package view;

import controller.FatorialDuploController;

public class Principal {

	public static void main(String[] args) {
		int fatorial = 3;
		
		FatorialDuploController fd = new FatorialDuploController();
		
		//Teste para garantir que o n�mero inserido � �mpar.
		if(fatorial % 2 != 0) {
			int resultado = fd.FatorialDuplo(fatorial);
			System.out.println(resultado);
		}else {
			System.out.println("Insira um n�mero �mpar.");
		}

	}

}
