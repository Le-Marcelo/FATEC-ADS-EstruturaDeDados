package view;

import javax.swing.JOptionPane;

import controller.HistoricoController;
import model.PilhaString;

public class Principal {

	public static void main(String[] args) {
		PilhaString pilha = new PilhaString();
		HistoricoController ctrl = new HistoricoController();
		
		int opcao;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n"
																	+ "1- Inserir novo endereço\n"
																	+ "2- Remover último endereço\n"
																	+ "3- Ver último endereço\n"
																	+ "9- Sair"));
			
			switch(opcao) {
				case 1:
					String endereco = JOptionPane.showInputDialog("Digite o endereço: ");
					try {
						ctrl.inserirEndereço(pilha, endereco);
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
					break;
					
				case 2:
					try {
						ctrl.removerEndereco(pilha);
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
					break;
					
				case 3:
					try {
						String top = ctrl.consultarEndereco(pilha);
						JOptionPane.showMessageDialog(null, "O último endereço é " + top);
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
