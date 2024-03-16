package view;

import java.io.IOException;

import controller.ModificacaoCadastroController;

public class Principal {

	public static void main(String[] args) {
		ModificacaoCadastroController ctrl = new ModificacaoCadastroController();
		
		try {
			ctrl.novoCadastro(41, 60, 8000.00);
			ctrl.novoCadastro(31, 40, 5000.00);
			ctrl.novoCadastro(21, 30, 3000.00);
		} catch (IOException e) {
			System.err.println(e.getStackTrace());
		} catch (Exception e) {
			System.err.println(e.getStackTrace());
		}

	}

}
