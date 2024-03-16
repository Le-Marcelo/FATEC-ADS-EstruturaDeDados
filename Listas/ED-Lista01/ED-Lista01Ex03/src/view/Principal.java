package view;

import controller.PotenciaController;

public class Principal {

	public static void main(String[] args) {
		int base = 2, expoente = 5;
		
		PotenciaController pc = new PotenciaController();
		int potencia = pc.Potencia(base, expoente);
		System.out.println(potencia);
	}

}
