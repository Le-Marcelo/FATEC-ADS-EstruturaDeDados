package view;

import controller.OrdenacaoController;
import model.Lista;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {10, 5, 8, 1, 9, 2, 4, 7, 3, 6};
		
		Lista<Integer> lista = new Lista<Integer>();
		OrdenacaoController ctrl = new OrdenacaoController();
		
		try {
			//Adicionar números na lista
			for(int i : vetor) {
				lista.addLast(i);
				
			}
			
			ctrl.ordenar(lista);
			
			for(int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
				
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			
		}

	}

}
