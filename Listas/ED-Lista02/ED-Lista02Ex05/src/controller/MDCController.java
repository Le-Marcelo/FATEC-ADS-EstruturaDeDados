package controller;

public class MDCController {

	public MDCController() {
		super();
	}
	
	public int MDC(int x, int y) {
		//Condição de parada => Quando X for igual a Y.
		if(x == y) {
			return x;
		//Retorno é dado pela comparação se X é maior que Y.
		//Caso sim retornar a chamada da função com X decrescido do valor de Y.
		}else if(x > y){
			return MDC(x - y, y);
		//Caso não retornar a chamada da função com Y no lugar de X e vice-versa.
		}else {
			return MDC(y, x);
		}
	}

}
