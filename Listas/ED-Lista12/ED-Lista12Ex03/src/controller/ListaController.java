package controller;

import model.Lista;
import model.Pilha;

public class ListaController {

	public ListaController() {
		super();
	}
	
	public Lista<Integer> inverterLista(Lista<Integer> lista) {
		Pilha<Integer> pilha = new Pilha<>();
		
		try {
			while(!lista.isEmpty()) {
				pilha.push(lista.get(0));
				lista.removeFirst();
				
			}
			
			boolean primeiraVez = true;
			while(!pilha.isEmpty()) {
				if(primeiraVez) {
					lista.addFirst(pilha.pop());
					primeiraVez = false;
					
				}else {
					lista.addLast(pilha.pop());
					
				}
				
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			
		}
		
		return lista;
	}
	
	public void exibirLista(Lista<Integer> lista) {
		int tamanho = lista.size();
		
		try {
			StringBuffer buffer = new StringBuffer();
			buffer.append("[ ");
			
			for(int i = 0; i < tamanho; i++) {
				buffer.append(lista.get(i) + " ");
				
			}
			
			buffer.append("]");
			System.out.println(buffer.toString());
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
