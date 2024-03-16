package view;

import javax.swing.JOptionPane;

import controller.TabelaEspalhamentoController;

public class Principal {

	public static void main(String[] args) {
		TabelaEspalhamentoController ctrl = new TabelaEspalhamentoController();
		int opcao = 0;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu\n"
																+ "1- Cadastrar Morador\n"
																+ "2- Consultar Morador\n"
																+ "3- Excluir Morador\n"
																+ "4- Listar Moradores\n"
																+ "9- Sair"));
			
			switch(opcao) {
				case 1:
					try {
						int numApartamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do apartamento:"));
						String nome = JOptionPane.showInputDialog("Digite o nome do morador:");
						String modeloCarro = JOptionPane.showInputDialog("Digite o modelo do carro:");
						String corCarro = JOptionPane.showInputDialog("Digite a cor do carro:");
						String placaCarro = JOptionPane.showInputDialog("Digite a placa do carro:");
						ctrl.cadastrarMorador(numApartamento, nome, modeloCarro, corCarro, placaCarro);
					
					} catch (Exception e) {
						System.err.println(e.getMessage());
					
					}
					break;
					
				case 2:
					try {
						int numApartamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do apartamento:"));
						String placaCarro = JOptionPane.showInputDialog("Digite a placa do carro:");
						ctrl.consultarMorador(numApartamento, placaCarro);
						
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
					
					break;
				
				case 3:
					try {
						int numApartamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do apartamento:"));
						String placaCarro = JOptionPane.showInputDialog("Digite a placa do carro:");
						ctrl.excluirMorador(numApartamento, placaCarro);
						
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
					
					break;
					
				case 4:
					try {
						int andar = Integer.parseInt(JOptionPane.showInputDialog("Digite o andar desejado:"));
						ctrl.listarAndar(andar);
						
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
					
					break;
					
				case 9:
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida");
			}
		}while(opcao != 9);
	}

}
