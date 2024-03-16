package view;

import arvoreChar.ArvoreChar;

public class Principal {

	public static void main(String[] args) {
		char[] vetor = {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};
		
		ArvoreChar arvore = new ArvoreChar();
		
		for(char i : vetor) {
			arvore.insert(i);
		}
		
		try {
			
			arvore.remove('F');
			arvore.remove('U');
			
			System.out.print("Atravessamento pre: ");
			arvore.prefixSearch();
			System.out.print("\nAtravessamento in: ");
			arvore.infixSearch();
			System.out.print("\nAtravessamento pos: ");
			arvore.postfixSearch();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
