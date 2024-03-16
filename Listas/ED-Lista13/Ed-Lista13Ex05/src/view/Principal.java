package view;

import javax.swing.JOptionPane;

import controller.PlayerController;
import model.Lista;
import object.Musica;

public class Principal {

	public static void main(String[] args) {
		PlayerController ctrl = new PlayerController();
		Lista<Musica> lista = new Lista<Musica>();
		
		int opcao = 0;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Vitufy\n"
															+ "1- Adicionar música\n"
															+ "2- Remover música\n"
															+ "3- Escutar playlist\n"
															+ "9- Sair"));
			
			switch (opcao) {
				case 1: 
					StringBuffer buffer = new StringBuffer();
					buffer.append(JOptionPane.showInputDialog("Digite o nome da música:") + ";");
					buffer.append(JOptionPane.showInputDialog("Digite o nome da artista:") + ";");
					buffer.append(JOptionPane.showInputDialog("Digite a duração da música:"));
					
					ctrl.adicionaMusica(lista, buffer.toString());
					break;
					
				case 2:
					try {
						int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da música na playlist:"));
						
						ctrl.removeMusica(lista, posicao - 1);
						
					} catch (Exception e) {
						System.err.println(e.getMessage());
						
					}
					break;
					
				case 3:
					ctrl.executaPlaylist(lista);
					break;
					
				case 9:
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente!");
				}
		}while(opcao != 9);
	}

}
