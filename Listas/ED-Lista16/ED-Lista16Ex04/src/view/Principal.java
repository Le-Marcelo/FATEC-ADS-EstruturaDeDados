package view;

import javax.swing.JOptionPane;

import controller.HashtableController;

public class Principal {

	public static void main(String[] args) {
		HashtableController ctrl = new HashtableController();
		
		int opcao = 0;
		
		//Pode ser comentado, apenas para testes
		try {
			ctrl.popularHashtable();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		do {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n"
																+ "1- Inserir departamento\n"
																+ "2- Consultar departamento\n"
																+ "3- Remover departamento\n"
																+ "9- Sair"));
			
			switch(opcao) {
				case 1:
					try {
						int andar = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do andar:"));
						String nome = JOptionPane.showInputDialog("Digite o nome do departamento:");
						String descricao = JOptionPane.showInputDialog("Digite uma breve descricao do departamento:");
						
						ctrl.inserir(andar, nome, descricao);
						break;
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
				
				case 2:
					try {
						int andar = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do andar:"));
						String nome = JOptionPane.showInputDialog("Digite o nome do departamento:");
						
						ctrl.consultar(andar, nome);
						break;
					}catch(Exception e){
						System.err.println(e.getMessage());
					}
					
				case 3:
					try {
						int andar = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do andar:"));
						String nome = JOptionPane.showInputDialog("Digite o nome do departamento:");
						
						ctrl.remover(andar, nome);
						break;
					}catch (Exception e) {
						System.err.println(e.getMessage());
					}
				
				case 9:
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida.");
					break;
					
			}
			
		}while(opcao != 9);

	}

}
