package controller;

public class ConverterBinarioController {

	public ConverterBinarioController() {
		super();
	}
	
	public String ConverterBinario(int num) {
		//Condição de parada => Quando o número for menor ou igual a 1.
		if(num <= 1) {
			return String.valueOf(num % 2);
		//Retorno é dado pela concatenação da chamada da função com o número dividido por 2 com a função valuOf do resto da divisão do número por 2.
		}else {
			return  ConverterBinario(num / 2) + String.valueOf(num % 2);
		}
	}

}
