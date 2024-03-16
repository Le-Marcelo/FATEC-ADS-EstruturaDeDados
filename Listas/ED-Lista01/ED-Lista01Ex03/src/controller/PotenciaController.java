package controller;

public class PotenciaController {

	public PotenciaController() {
		super();
	}
	
	public int Potencia(int base, int expoente) {
		//Condição de parada => Quando o expoente for igual a 1 logo deve retornar o valor da base.
		if(expoente == 1) { 
			return base;
		}else {
			//Retorno é dado pela multiplicação da base pela chamada da própria função diminuindo em um o valor do expoente.
			return base * Potencia(base, expoente - 1);
		}
	}

}
