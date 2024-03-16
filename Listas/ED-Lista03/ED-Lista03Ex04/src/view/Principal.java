package view;

import controller.ConverterBinarioController;

public class Principal {

	public static void main(String[] args) {
		int num = 0;
		
		ConverterBinarioController cb = new ConverterBinarioController();
		
		//Controle da entrada de dados
		if(num <= 2000 && num >= 0) {
			String resultado = cb.ConverterBinario(num);
			System.out.println(resultado);
		}else {
			System.out.println("Insira um número inteiro até 2000");
		}
	}

}
