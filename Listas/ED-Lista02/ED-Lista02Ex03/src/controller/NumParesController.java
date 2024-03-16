package controller;

public class NumParesController {

	public NumParesController() {
		super();
	}
	
	public int NumPares(int[] vetor, int tamanho) {
		//Condição de parada => quando o tamanho for igual a zero (logo aponta para uma posição inexistente do vetor).
		if(tamanho == 0) {
			return 0;
		//Retorno é dado pela comparação se o resto da divisão entre o número atual do vetor por dois é igual a zero,
		//Caso sim o retorno é a adição de 1 e a chamada da função com o tamanho decrescido por um.
		}else if(vetor[tamanho - 1] % 2 == 0){
			return 1 + NumPares(vetor, tamanho - 1);
		//Caso não o retorno é a chamada da função com o tamanho decrescido por um.
		}else {
			return NumPares(vetor, tamanho - 1);
		}
	}

}
