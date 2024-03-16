package view;

import controller.FibonacciController;

public class Principal {

	public static void main(String[] args) {
		int num = 6;
		
		FibonacciController fc = new FibonacciController();
		
		//Controle da entrada de dados
		if(num >= 1 && num <= 20) {
			int resultado = fc.Fibonacci(num);
			System.out.println(resultado);
		}else {
			System.out.println("Insira um número entre 1 e 20");
		}

	}

}
