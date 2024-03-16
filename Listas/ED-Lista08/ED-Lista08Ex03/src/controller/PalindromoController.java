package controller;

import model.PilhaString;

public class PalindromoController {

	public PalindromoController() {
		super();
	}
	
	public String invertePalavra(String palavra) {
		PilhaString pilha = new PilhaString();
		String palavraInvertida = "";
		
		for(int i = 0; i < palavra.length(); i++) {
			 char letra = palavra.charAt(i);
			 pilha.push(String.valueOf(letra));
		}
		
		try {
			while(!pilha.isEmpty()) {
				palavraInvertida += pilha.pop();
			}
		} catch (Exception e) {
			
		}
		
		return palavraInvertida;
	}
	
	public boolean comparaPalavras(String palavra, String palavraInvertida) {
		if(palavra.equals(palavraInvertida)) {
			return true;
		}else {
			return false;
		}
	}

}
