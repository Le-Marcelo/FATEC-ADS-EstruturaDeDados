package controller;

public class InverterNumeroController {

	public InverterNumeroController() {
		super();
	}
	
	public String InverterNumero(String texto, int tamanho) {
		//Condição de parada => Quando o tamanho do texto for igual a 0.
		if(tamanho == 0) {
			return "";
		//Retorno é dado pela concatenação da função substring pegando apenas o ultimo caracter com a chamada da própria função com o tamanho decrescido em 1.
		}else {
			return texto.substring(tamanho - 1, tamanho) + InverterNumero(texto, tamanho - 1);
		}
	}

}
