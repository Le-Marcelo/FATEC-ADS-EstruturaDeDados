package controller;

public class QuantDigitosController {

	public QuantDigitosController() {
		super();
	}
	
	public int QuantDigitos(int num) {
		//Condição de parada => Quando a divisão do número por 10 for igual a 0.
		if(num / 10 == 0) {
			return 1;
		}else {
			//Retorno se da pela adição de 1 a chamada da função com o número divido por 10.
			return 1 + QuantDigitos(num / 10);
		}
	}

}
