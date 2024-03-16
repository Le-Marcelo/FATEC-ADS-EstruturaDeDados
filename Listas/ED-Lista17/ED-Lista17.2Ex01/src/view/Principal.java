package view;

import arvoreInt.ArvoreInt;

public class Principal {
    
    public static void main(String[] args) {
        ArvoreInt arvore = new ArvoreInt();
        int[] vetor = {30,15,60,10,20,40,80};

        for(int i : vetor) {
			arvore.insert(i);
		}
		
		try {
			arvore.prefixSearch();
			System.out.println(" -> Pré-Ordem");
			arvore.infixSearch();
			System.out.println(" -> Em Ordem (Crescente)");
			arvore.postfixSearch();
			System.out.println(" -> Pós-Ordem");
			
			arvore.remove(60);
			arvore.infixSearch();
			System.out.println(" -> Em Ordem (Sem o 60)");
            
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
    }

}
