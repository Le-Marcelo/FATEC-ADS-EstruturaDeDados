package view;

import javax.swing.JOptionPane;

import controller.TelefoneController;
import model.Fila;

public class Principal {

	public static void main(String[] args) {
		int opcao = 0;
		
		TelefoneController ctrl = new TelefoneController();
		Fila<String> fila = new Fila<String>();
		
		do {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu Chamadas\n"
																+ "1- Inserir Ligação\n"
																+ "2- Consultar Ligações\n"
																+ "9- Sair"));
			
			switch(opcao) {
				case 1:
					String numero = JOptionPane.showInputDialog("Insira o número desejado: ");
					ctrl.insereLigacao(fila, numero);
					break;
				
				case 2:
					try {
						ctrl.consultaLigacoes(fila);
						
					} catch (Exception e) {
						System.err.println(e.getMessage());
						
					}
					break;
					
				case 9:
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente!");
			}
			
			
		}while (opcao != 9);

	}

}
