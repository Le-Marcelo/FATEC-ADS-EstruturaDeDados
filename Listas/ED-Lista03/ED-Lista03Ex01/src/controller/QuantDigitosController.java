package controller;

public class QuantDigitosController {

	public QuantDigitosController() {
		super();
	}
	
	public int QuantDigitos(int num) {
		//Condi��o de parada => Quando a divis�o do n�mero por 10 for igual a 0.
		if(num / 10 == 0) {
			return 1;
		}else {
			//Retorno se da pela adi��o de 1 a chamada da fun��o com o n�mero divido por 10.
			return 1 + QuantDigitos(num / 10);
		}
	}

}
