package controller;

public class RestoController {

	public RestoController() {
		super();
	}
	
	public int Resto(int dividendo, int divisor) {
		//Condi��o de parada => Quando a subtra��o do dividendo pelo divisor for menor ou igual a zero.
		if(dividendo - divisor <= 0) {
			return dividendo;
		}else {
			//Retorno � dado pela chamada da fun��o com o valor da subtra��o entre o dividendo pelo divisor.
			return Resto(dividendo - divisor, divisor);
		}
		
	}
}
