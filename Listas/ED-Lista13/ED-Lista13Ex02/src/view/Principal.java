package view;

import controller.UniaoInterseccaoController;
import model.Lista;

public class Principal {

	public static void main(String[] args) {
		int[] vetorA = {3, 5, 8, 12, 9, 7, 16};
		int[] vetorB = {9, 6, 2, 3, 7};
		
		Lista<Integer> listaA = new Lista<Integer>();
		Lista<Integer> listaB = new Lista<Integer>();
		
		try {
			for(int i : vetorA) {
				listaA.addLast(i);
			}
			
			for(int i : vetorB) {
				listaB.addLast(i);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		UniaoInterseccaoController ctrl = new UniaoInterseccaoController();
		
		try {
			Lista<Integer> listaI = ctrl.interseccao(listaA, listaB);
			Lista<Integer> listaU = ctrl.uniao(listaA, listaB);
			
			System.out.println("Lista I:");
			for(int i = 0; i < listaI.size(); i++) {
				System.out.println(listaI.get(i));
			}
			
			System.out.println("Lista U:");
			for(int i = 0; i < listaU.size(); i++) {
				System.out.println(listaU.get(i));
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			
		}

	}

}
