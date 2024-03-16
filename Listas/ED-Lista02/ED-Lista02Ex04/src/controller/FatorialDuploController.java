package controller;

public class FatorialDuploController {

	public FatorialDuploController() {
		super();
	}
	
	public int FatorialDuplo(int num) {
		//Condição de parada => Quando o número for igual a um
		if(num == 1) {
			return 1;
		//Retorno é dado pela comparação se o resto da divisão entre o número atual do vetor por dois é diferente de zero,
		//Caso sim o retorno é a multiplicação do número atual pela chamada da função com o número decrescido em um.
		}else if(num % 2 != 0){
			return num * FatorialDuplo(num - 1);
		//Caso não o retorno é a chamada da função com o número decrescido em um.
		}else {
			return FatorialDuplo(num - 1);
		}
	}

}
