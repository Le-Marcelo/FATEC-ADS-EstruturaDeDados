package controller;

public class MDCController {

	public MDCController() {
		super();
	}
	
	public int MDC(int x, int y) {
		//Condi��o de parada => Quando X for igual a Y.
		if(x == y) {
			return x;
		//Retorno � dado pela compara��o se X � maior que Y.
		//Caso sim retornar a chamada da fun��o com X decrescido do valor de Y.
		}else if(x > y){
			return MDC(x - y, y);
		//Caso n�o retornar a chamada da fun��o com Y no lugar de X e vice-versa.
		}else {
			return MDC(y, x);
		}
	}

}
