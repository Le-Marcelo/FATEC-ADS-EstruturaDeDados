package view;

import arvoreInt.ArvoreInt;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {33, 15, 41, 38, 47, 34, 49, 43};
		
		ArvoreInt arvore = new ArvoreInt();
		
		for(int i : vetor) {
			arvore.insert(i);
		}
		
		try {
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
