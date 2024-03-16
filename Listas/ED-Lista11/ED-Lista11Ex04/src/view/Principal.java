package view;

import javax.swing.JOptionPane;

import controller.ImpressoraController;
import model.Fila;

public class Principal {

	public static void main(String[] args) {
		ImpressoraController ctrl = new ImpressoraController();
		Fila<String> fila = new Fila<String>();
		
		int opcao = 0;

		do {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu Impressão\n"
																+ "1- Inserir documento\n"
																+ "2- Imprimir\n"
																+ "9- Sair"));
			
			switch (opcao) {
				case 1: 
					String documento = JOptionPane.showInputDialog("Digite o nome do documento no formato:\n"
																+ "ID_PC;Nome_Arquivo");
					
					if(documento.contains(";") && !documento.contains(" ")) {
						ctrl.insereDocumento(fila, documento);
						
					}else {
						JOptionPane.showMessageDialog(null, "Formato inválido, tente novamente!");
					}
					break;
					
				case 2:
					try {
						ctrl.imprime(fila);
						
					} catch (Exception e) {
						System.err.println(e.getMessage());
						
					}
					break;
					
				case 9:
					break;
				
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente!");
					break;
			}
			
		}while(opcao != 9);
	}

}
