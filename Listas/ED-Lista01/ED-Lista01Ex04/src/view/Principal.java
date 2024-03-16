package view;

import controller.NegativosController;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = { -1, 0, -2, 4 , 17, -5};
		
		NegativosController nc = new NegativosController();
		int qntNegativos = nc.QuantidadeNegativos(vetor, vetor.length);
		System.out.println(qntNegativos);
	}

}
