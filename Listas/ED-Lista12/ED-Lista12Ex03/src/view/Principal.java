package view;

import controller.ListaController;
import model.Lista;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {3, 5, 18, 12, 9, 7, 6, 2, 13, 4, 16};
		int tamanho = vetor.length;
		
		Lista<Integer> lista = new Lista<Integer>();
		ListaController ctrl = new ListaController();
		
		for(int i = 0; i < tamanho; i++) {
			try {
				lista.add(vetor[i], i);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
		}
		
		ctrl.exibirLista(lista);
		Lista<Integer> listaInvertida = ctrl.inverterLista(lista);
		ctrl.exibirLista(listaInvertida);

	}

}
