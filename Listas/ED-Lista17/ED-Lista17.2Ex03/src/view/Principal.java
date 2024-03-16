package view;

import arvoreChar.ArvoreChar;

public class Principal {
    public static void main(String[] args) {
        ArvoreChar arvore = new ArvoreChar();
        char[] vetor = {'k','d','m','b','f','l','t','c','p','z','r'};

        for(char i : vetor){
            arvore.insert(i);
        }

        try {
            arvore.remove('m');
            arvore.prefixSearch();
            System.out.println();
            arvore.infixSearch();
            System.out.println();
            arvore.postfixSearch();
            System.out.println();
            arvore.search('r');
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
