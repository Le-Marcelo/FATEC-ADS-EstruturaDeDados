package controller;

public class MultiplicacaoController {

	public MultiplicacaoController() {
		super();
	}
	
	public int Multiplicacao(int numA, int numB) {
		//Condição de parada => Quando o número B for igual a um retornar o valor do número A.
		if(numB == 1) {
			return numA;
		}else {
			//Retorno é dado pela soma do valor do número A e a chamada da função com o número B decrescido de um.
			return numA + Multiplicacao(numA, numB - 1);
		}
	}

}
