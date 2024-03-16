package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		ConverteController ctrl = new ConverteController();
		int num;
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor decimal inteiro de 0 a 1000:"));
			
			if(num < 0 || num > 1000) {
				System.err.println("N�mero inv�lido");
			}
		} while (num < 0 && num > 1000);
		
		String resultado = ctrl.decToBin(num);
		System.out.println("O n�mero " + num + " em b�nario � " + resultado);

	}

}
