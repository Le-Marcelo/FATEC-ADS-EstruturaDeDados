package view;

import controller.HashtableController;

public class Principal {

	public static void main(String[] args) {
		HashtableController ctrl = new HashtableController();
		
		for(int i = 0; i < 5; i++) {
			try {
				int num = (int) (Math.random() * 100);
				ctrl.inserir(num);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		try {
			ctrl.exibir();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
