package controller;

public class NumParesController {

	public NumParesController() {
		super();
	}
	
	public int NumPares(int[] vetor, int tamanho) {
		//Condi��o de parada => quando o tamanho for igual a zero (logo aponta para uma posi��o inexistente do vetor).
		if(tamanho == 0) {
			return 0;
		//Retorno � dado pela compara��o se o resto da divis�o entre o n�mero atual do vetor por dois � igual a zero,
		//Caso sim o retorno � a adi��o de 1 e a chamada da fun��o com o tamanho decrescido por um.
		}else if(vetor[tamanho - 1] % 2 == 0){
			return 1 + NumPares(vetor, tamanho - 1);
		//Caso n�o o retorno � a chamada da fun��o com o tamanho decrescido por um.
		}else {
			return NumPares(vetor, tamanho - 1);
		}
	}

}
