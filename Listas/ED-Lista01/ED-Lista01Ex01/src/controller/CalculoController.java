package controller;

public class CalculoController {

	public CalculoController() {
		super();
	}
	
	public int calculo(int n) {
		//Condição de parada => Quando N (O número em questão) for zero.
		if (n == 0) {	
			return 0;
		}else {
			//Retorno é dado pelo valor atual de N somado a chamada da função com o valor de N reduzido em 1.
			return n + calculo(n - 1); 
		}
	}

}
