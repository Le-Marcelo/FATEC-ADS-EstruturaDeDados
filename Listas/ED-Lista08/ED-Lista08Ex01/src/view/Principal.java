package view;

import controller.Controller;

public class Principal {

	public static void main(String[] args) {
		Controller ctrl = new Controller();
		int[] vetor = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		ctrl.pilhaVetor(vetor);

	}

}
