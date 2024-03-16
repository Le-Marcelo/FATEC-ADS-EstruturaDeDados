package view;

import javax.swing.JOptionPane;

import controller.PalindromoController;

public class Principal {

	public static void main(String[] args) {
		PalindromoController ctrl = new PalindromoController();
		String palavra = JOptionPane.showInputDialog("Digite um texto:");
		String palavraInvertida = ctrl.invertePalavra(palavra);
		boolean palindromo = ctrl.comparaPalavras(palavra, palavraInvertida);
		
		if(palindromo) {
			System.out.println("Esse texto é um palíndromo");
		}else {
			System.out.println("Esse texto não é um palíndromo");
		}

	}

}
