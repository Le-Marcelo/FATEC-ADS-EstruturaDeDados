package controller;

import model.PilhaInt;

public class ConverteController {

	public ConverteController() {
		super();
	}
	
	public String decToBin(int decimal) {
		PilhaInt pilha = new PilhaInt();
		String resultado = "";
		
		do {
			int bin = decimal % 2;
			decimal = decimal / 2;
			pilha.push(bin);
		} while(decimal != 0);
		
		try {
			while(!pilha.isEmpty()) {
				resultado += pilha.pop();
			}
		} catch (Exception e) {
			
		}
		return resultado;
	}

}
