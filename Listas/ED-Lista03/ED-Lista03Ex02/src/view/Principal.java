package view;

import controller.ContarNumerosController;

public class Principal {

	public static void main(String[] args) {
		int num = 213524, digito = 2;

		ContarNumerosController cn = new ContarNumerosController();
		
		//Controle de entrada de dados.
		if(num >= 10 && num <= 999999 && digito >= 0 && digito <= 9) {
			int resultado = cn.ContarNumeros(num, digito);
			System.out.println(resultado);
		}else {
			System.out.println("Insira um número entre 10 e 999999 e um dígito entre 0 a 9");
		}
	}

}
