package controller;

public class RestoController {

	public RestoController() {
		super();
	}
	
	public int Resto(int dividendo, int divisor) {
		//Condição de parada => Quando a subtração do dividendo pelo divisor for menor ou igual a zero.
		if(dividendo - divisor <= 0) {
			return dividendo;
		}else {
			//Retorno é dado pela chamada da função com o valor da subtração entre o dividendo pelo divisor.
			return Resto(dividendo - divisor, divisor);
		}
		
	}
}
