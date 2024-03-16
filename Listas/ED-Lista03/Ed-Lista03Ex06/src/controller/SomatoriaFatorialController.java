package controller;

public class SomatoriaFatorialController {

	public SomatoriaFatorialController() {
		super();
	}
	
	//Função recursiva para obter o fatorial de um número inteiro.
	public double Fatorial(int num) {
		//Condição de parada => Quando o número atual for igual a 1.
		if(num == 1) {
			return num;
		//Retorno é dado pela multiplicação do número atual pela chamada da função com o número decrescido em 1.
		}else {
			return num * Fatorial(num - 1);
		}
	}
	
	//Função recursiva para obter o resultado da somatória.
	public double Somatoria(int num) {
		//Condição de parada => Quando o número atual for igual a 1.
		if(num == 1) {
			return num;
		//Retorno é dado pela soma entre a divisão de 1 prla função fatorial com o número e a chamada da função com o número decrescido em 1.
		}else {
			return (1 / Fatorial(num)) + Somatoria(num - 1);
		}
		
	}

}
