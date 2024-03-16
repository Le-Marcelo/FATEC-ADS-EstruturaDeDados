package controller;

public class FibonacciController {

	public FibonacciController() {
		super();
	}
	
	public int Fibonacci(int posicao) {
		//Condição de parada => Quando a posição atual for 1 ou 2.
		if(posicao == 1 || posicao == 2) {
			return 1;
		//Retorno é dado pela soma de duas chamadas da função com uma tendo a posição decrescida por 1 e a outra por 2 respectivamente.
		}else {
			return Fibonacci(posicao - 1) + Fibonacci(posicao - 2);
		}
	}

}
