package controller;

import model.PilhaInt;

public class FatController {

	public FatController() {
		super();
	}
	
	public int fatorial(int valor) {
		PilhaInt pilha = new PilhaInt();
		int resultado = 0;
		
		if(valor != 0) {
			//Preenchendo a pilha com (valor, valor - 1, valor - 2, ... 1)
			for(int i = valor; i > 0; i--) {
				pilha.push(i);
			}
			
			try {
				while(pilha.size() > 1) {
					pilha.push(pilha.pop() * pilha.pop());
				}
				
				resultado = pilha.top();
			} catch (Exception e) {
				String erro = e.getMessage();
				System.err.println(erro);
			}
		}
		
		return resultado;
	}
}
