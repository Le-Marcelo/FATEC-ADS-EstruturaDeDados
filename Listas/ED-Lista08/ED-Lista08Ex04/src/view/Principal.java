package view;

import javax.swing.JOptionPane;

import controller.NPRController;
import model.PilhaInt;

public class Principal {

	public static void main(String[] args) {
		NPRController ctrl = new NPRController();
		PilhaInt pilha = new PilhaInt();
		
		int opcao, num;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n"
																+ "1- Adicionar um número\n"
																+ "2- Fazer uma operação\n"
																+ "9- Sair"));
			
			switch (opcao) {
				case 1:
					num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
					ctrl.insereValor(pilha, num);
					break;
					
				case 2:
					String op = JOptionPane.showInputDialog("Digite uma operação (+, -, * ou /)");
					try {
						num = ctrl.npr(pilha, op);
						JOptionPane.showMessageDialog(null, "Resultado atual: " + num);
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
					break;
					
				case 9:
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida");
					break;
			}
		}while(opcao != 9);
	}

}
