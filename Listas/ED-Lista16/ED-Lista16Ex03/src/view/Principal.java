package view;

import controller.HashtableController;

public class Principal {

	public static void main(String[] args) {
		HashtableController ctrl = new HashtableController();
		
		try {
			ctrl.rehash();
			ctrl.exibirHashTable();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
