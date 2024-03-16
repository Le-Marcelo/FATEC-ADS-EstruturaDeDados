package view;

import javax.swing.JOptionPane;

import controller.FatController;

public class Principal {

	public static void main(String[] args) {
		int num;
		
		FatController ctrl = new FatController();
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero de 0 a 10: "));
			if (num < 0 || num > 10) {
				System.err.println("N�mero digitado fora do padr�o.");
			}
		}while(num < 0 || num > 10);

		int resultado = ctrl.fatorial(num);
		
		System.out.println("O resultado do fatorial de " + num + " � " + resultado);
	}

}
