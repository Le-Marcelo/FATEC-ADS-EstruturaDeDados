package controller;

import model.Lista;

public class HashtableController {

	@SuppressWarnings("unchecked")
	Lista<Integer>[] hashTable = new Lista[5];
	
	public HashtableController() {
		for(int i = 0; i < hashTable.length; i++) {
			hashTable[i] = new Lista<Integer>();
		}
	}
	
	@SuppressWarnings("unchecked")
	private Lista<Integer>[] inicializarHashTableAntiga() throws Exception {
		Lista<Integer>[] hashTableAntiga = new Lista[10];
		int lista0[] = {0, 12, 647, 158, 136, 467};
		int lista1[] = {156, 600, 551};
		int lista2[] = {263, 414, 882, 945, 914, 953, 629};
		int lista3[] = {884, 795, 194, 513};
		int lista4[] = {591, 847, 66, 337, 979};
		int lista5[] = {768, 53};
		int lista6[] = {114, 803, 90, 339, 550};
		int lista7[] = {574, 977, 216, 99, 617, 88};
		int lista8[] = {142, 148, 227, 939, 585, 338, 206};
		int lista9[] = {569, 708, 844};
		
		int[] vetorListas[] = {lista0, lista1, lista2, lista3, lista4, lista5, lista6, lista7, lista8, lista9};
		
		for(int i = 0; i < hashTableAntiga.length; i++) {
			hashTableAntiga[i] = new Lista<Integer>();
			for(int j = 0; j < vetorListas[i].length; j++) {
				hashTableAntiga[i].addLast(vetorListas[i][j]);
			}
		}
		
		return hashTableAntiga;
		
	}
	
	public void rehash() throws Exception {
		Lista<Integer>[] hashTableAntiga = inicializarHashTableAntiga();
		
		for(int i = 0; i < hashTableAntiga.length; i++) {
			for(int j = 0; j < hashTableAntiga[i].size(); j++) {
				int valor = hashTableAntiga[i].get(j);
				int hash = hash(valor);
				hashTable[hash].addLast(valor);
			}
		}
	}

	public void exibirHashTable() throws Exception {
		for(int i = 0; i < hashTable.length; i++) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(i + " - [ ");
			
			for(int j = 0; j < hashTable[i].size(); j++) {
				int valor = hashTable[i].get(j);
				buffer.append(valor + " -> ");
			}
			
			buffer.append("NULL ]");
			System.out.println(buffer.toString());
		}
	}
	
	private int hash(int valor) {
		int hash = valor % 5;
		return hash;
	}

}
