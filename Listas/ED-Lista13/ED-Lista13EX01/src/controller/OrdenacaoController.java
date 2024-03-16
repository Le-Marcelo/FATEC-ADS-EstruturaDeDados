package controller;

import model.Lista;
import model.Pilha;

public class OrdenacaoController {

	public OrdenacaoController() {
		super();
	}
	
	public void ordenar(Lista<Integer> lista) {
		try {
			Pilha<Integer> pilha = new Pilha<Integer>();
			while(!lista.isEmpty()){
				pilha.push(lista.get(lista.size() - 1));
				lista.removeLast();
			}
			
			while(!pilha.isEmpty()) {
				int valor = pilha.pop();
				
				if(lista.isEmpty() || valor < lista.get(0)) {
					lista.addFirst(valor);
					
				}else if(valor > lista.get(lista.size() - 1)){
					lista.addLast(valor);
					
				}else {
					for(int i = 1; i < lista.size(); i++) {
						if(valor < lista.get(i) && valor > lista.get(i - 1)) {
							lista.add(valor, i);
							break;
						}
					}
				}
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			
		}
	}
	
	
}
