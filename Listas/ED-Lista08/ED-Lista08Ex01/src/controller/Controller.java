package controller;

import model.PilhaInt;

public class Controller {

	public Controller() {
		super();
	}
	
	public void pilhaVetor(int[] vetor) {
		PilhaInt pilha = new PilhaInt();
		
		try {
			for(int i : vetor) {
				if(i >= 0) {
					pilha.push(i);
				}else {
					int soma = pilha.pop() + pilha.pop();
					pilha.push(i);
					pilha.push(soma);
				}
			}
			
			System.out.println(pilha.size());
		} catch (Exception e) {
			
		}
	}

}
