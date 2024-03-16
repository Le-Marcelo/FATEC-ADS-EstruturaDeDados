package controller;

import model.Lista;

public class HashTableController {

	@SuppressWarnings("unchecked")
	Lista<Integer>[] hashtable = new Lista[100];
	
	public HashTableController() {
		for(int i = 0; i < hashtable.length; i++) {
			hashtable[i] = new Lista<Integer>();
		}
	}
	
	public void inserir(int num) throws Exception{
		int hash = hash(num);
		
		hashtable[hash].addLast(num); 
	}
	
	public void exibir() throws Exception{
		for(int i = 0; i < hashtable.length; i++) {	//Percorrer todos vetores
			if(!hashtable[i].isEmpty()) {
				StringBuffer buffer = new StringBuffer();
				buffer.append("Hash " + i + ": ");
				for(int j = 0; j < hashtable[i].size(); j++) {	//Percorrer todos os itens dos vetores
					buffer.append(hashtable[i].get(j) + " -> ");
				}
				
				buffer.append("NULL");
				System.out.println(buffer.toString());
			}
		}
	}
	
	public int hash(int num) {
		int posicao = (int) (100 * (((Math.sqrt(7) - 1) / 2 * num ) % 1));
		return posicao;
	}

}
