package view;

import controller.MaioresController;
import model.Lista;

public class Principal {

	public static void main(String[] args) {
		Lista<Integer> lista = new Lista<Integer>();
		MaioresController ctrl = new MaioresController();
		int[] vetorLista = {3,5,8,12,9,7,6,2,3,7,16};
		
		try {
			//Preencher vetor
			for(int i : vetorLista) {
				lista.addLast(i);
			}
			
			ctrl.maioresDoisNumeros(lista);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			
		}
	}

}
