package view;
import arvoreInt.ArvoreInt;

public class Principal {
    
    public static void main(String[] args) {
        ArvoreInt arvore = new ArvoreInt();
        int[] vetor = {12, 4, 16, 2, 8, 6};

        for(int i : vetor){
            arvore.insert(i);
        }

        try {
            arvore.search(6);
            arvore.remove(12);
            arvore.postfixSearch();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
