package view;

import arvoreInt.ArvoreInt;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {7, 8, 3, 4, 2, 1, 6, 5};
		
		ArvoreInt arvore = new ArvoreInt();
		
		for(int i : vetor) {
			arvore.insert(i);
		}
		
		try {
			
			arvore.remove(7);
			arvore.remove(6);
			
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
