package controller;

public class NegativosController {

	public NegativosController() {
		super();
	}
	
	public int QuantidadeNegativos(int[] vetor, int tamanho ) {
//		Condição de parada => Quando o vetor não possuir mais posições 
		if (tamanho == 0) {
			return 0;
//		Retorno é dado pela verificação se o número atual é negativo ou não, retornando 1 caso sim e 0 caso não.
		}else if(vetor[tamanho - 1] < 0){
			return 1 + QuantidadeNegativos(vetor, tamanho - 1);
		}else {
			return 0 + QuantidadeNegativos(vetor, tamanho - 1);
		}
	}
}
