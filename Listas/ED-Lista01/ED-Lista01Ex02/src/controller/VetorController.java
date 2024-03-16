package controller;

public class VetorController {

	public VetorController() {
		super();
;	}
	
	public int menorDoVetor(int[] vetor, int tamanho) {
		//Condição de parada => Quando o tamanho(posição do vetor) for igual a zero.
		if (tamanho == 0) {		
			return vetor[tamanho];
		} else {
			int aux = menorDoVetor(vetor, tamanho - 1);
			
			//Retorno é dado pela comparação entre o número em questão e o número anterior do vetor, o número que retornará será o menor entre os dois.
			if (vetor[tamanho] > aux) {	
				return aux;
			} else {
				return vetor[tamanho];
			}
		}
	}
}