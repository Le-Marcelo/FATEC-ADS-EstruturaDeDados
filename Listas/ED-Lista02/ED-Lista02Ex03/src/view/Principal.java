package view;

import controller.NumParesController;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int tamanho = vetor.length;
		
		NumParesController np = new NumParesController();
		
		int resultado = np.NumPares(vetor, tamanho);
		System.out.println(resultado);

	}

}
