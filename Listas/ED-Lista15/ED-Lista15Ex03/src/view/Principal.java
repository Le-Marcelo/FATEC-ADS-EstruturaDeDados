package view;

import controller.ChocolateController;

public class Principal {

	public static void main(String[] args) {
		ChocolateController ctrl = new ChocolateController();
		
		try {
			ctrl.registrar(50);
			ctrl.registrar(100);
			ctrl.registrar(150);
			ctrl.registrar(200);
			ctrl.registrar(260);
			
			ctrl.consultar(100);
			ctrl.consultar(200);
			
			ctrl.excluir(200);
			
			ctrl.listarTodos();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
