package view;

import javax.swing.JOptionPane;

import controller.HashtableController;

public class Principal {

	public static void main(String[] args) {
		HashtableController ctrl = new HashtableController();
		int opcao = 0;
		
		do {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n"
																+ "1- Inserir conta\n"
																+ "2- Consultar conta\n"
																+ "3- Remover conta\n"
																+ "9- Sair"));
			
			switch(opcao) {
				case 1:
					try {
						int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: "));
						String nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
						float saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo da conta: "));
						
						ctrl.inserir(numero, nome, saldo);
						break;
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
					
				case 2:
					try {
						int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: "));
						
						ctrl.consultar(numero);
						break;
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
					
				case 3:
					try {
						int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: "));
						
						ctrl.remover(numero);
						break;
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
					
				case 9:
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida.");
			}
			
		}while(opcao != 9);

	}

}
