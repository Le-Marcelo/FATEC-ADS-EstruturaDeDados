package view;

import controller.InverterNumeroController;

public class Principal {

	public static void main(String[] args) {
		String texto = "Teste";
		
		InverterNumeroController in = new InverterNumeroController();
		
		String resultado = in.InverterNumero(texto, texto.length());
		System.out.println(resultado);

	}

}
