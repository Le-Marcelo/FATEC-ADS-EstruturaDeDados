package controller;

import model.Lista;

public class HashtableController {

	@SuppressWarnings("unchecked")
	Lista<Integer>[] hashtable = new Lista[2];
	
	public HashtableController() {
		hashtable[0] = new Lista<Integer>();
		hashtable[1] = new Lista<Integer>();
	}

	public void inserir(int num) throws Exception{
		int hash = hash(num);
		hashtable[hash].addLast(num);
	}
	
	public void exibir() throws Exception {
		for(int i = 0; i < hashtable.length; i++) {
			StringBuffer buffer = new StringBuffer();
			if(i == 0) {
				buffer.append("Pares: ");
			}else {
				buffer.append("Impares: ");
			}
			
			for(int j = 0; j < hashtable[i].size(); j++) {
				buffer.append(hashtable[i].get(j) + " -> ");
			}
			
			buffer.append("NULL");
			System.out.println(buffer.toString());
		}
	}
	
	public int hash(int num) {
		int hash = num % 2;
		return hash;
	}
}
