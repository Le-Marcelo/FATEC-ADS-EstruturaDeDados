package controller;

public class MultiplicacaoController {

	public MultiplicacaoController() {
		super();
	}
	
	public int Multiplicacao(int numA, int numB) {
		//Condi��o de parada => Quando o n�mero B for igual a um retornar o valor do n�mero A.
		if(numB == 1) {
			return numA;
		}else {
			//Retorno � dado pela soma do valor do n�mero A e a chamada da fun��o com o n�mero B decrescido de um.
			return numA + Multiplicacao(numA, numB - 1);
		}
	}

}
