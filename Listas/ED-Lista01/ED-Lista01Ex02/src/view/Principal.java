package view;

import controller.VetorController;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {7, 2, 9, 3, 6};
		int tamanho = vetor.length - 1;
		
		VetorController vc = new VetorController();
		int menorNumero = vc.menorDoVetor(vetor, tamanho);
		System.out.println(menorNumero);

	}

}
