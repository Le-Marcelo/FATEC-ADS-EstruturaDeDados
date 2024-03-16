package controller;

import model.BarraDeChocolate;
import model.Lista;

public class ChocolateController {

	@SuppressWarnings("unchecked")
	Lista<BarraDeChocolate>[] hashtable = new Lista[5];
	
	public ChocolateController() {
		for(int i = 0; i < hashtable.length; i++) {
			hashtable[i] = new Lista<BarraDeChocolate>();
		}
	}
	
	public void registrar(int volume) throws Exception{
		BarraDeChocolate barra = new BarraDeChocolate(volume);
		hashtable[hash(volume)].addLast(barra);
	}
	
	public void excluir(int volume) throws Exception{
		int hash = hash(volume);
		boolean foiRemovido = false;
		
		for(int i = 0; i < hashtable[hash].size(); i++) {
			if(hashtable[hash].get(i).volume == volume) {
				hashtable[hash].remove(i);
				foiRemovido = true;
				break;
			}
		}
		
		if(!foiRemovido) {
			throw new Exception("Barra não encontrada.");
		}
	}
	
	public void consultar(int volume) throws Exception{
		int hash = hash(volume);
		boolean foiEncontrado = false;
		
		for(int i = 0; i < hashtable[hash].size(); i++) {
			if(hashtable[hash].get(i).volume == volume) {
				StringBuffer resultado = new StringBuffer();
				resultado.append(String.format("[Barra de %scm³, tem aproximadamente ", volume));
				
				switch(hash) {
					case 0:
						resultado.append("60g e são para fazer bombons]");
						break;
					case 1:
						resultado.append("115g e são para fazer pavês]");
						break;
					case 2:
						resultado.append("160g e são para fazer brigadeiros]");
						break;
					case 3:
						resultado.append("215g e são para fazer bolos]");
						break;
					case 4:
						resultado.append("280g e são para fazer ovos de páscoa]");
						break;
				}
				
				System.out.println(resultado);
				foiEncontrado = true;
				break;
			}
		}
		
		if(!foiEncontrado) {
			throw new Exception("Barra não encontrada.");
		}
	}
	
	public void listarTodos() throws Exception{
		for(int i = 0; i < hashtable.length; i++) {
			for(int j = 0; j < hashtable[i].size(); j++) {
				StringBuffer resultado = new StringBuffer();
				resultado.append(String.format("[Barra de %scm³, tem aproximadamente ", hashtable[i].get(j).volume));
				
				switch(i) {
					case 0:
						resultado.append("60g e são para fazer bombons]");
						break;
					case 1:
						resultado.append("115g e são para fazer pavês]");
						break;
					case 2:
						resultado.append("160g e são para fazer brigadeiros]");
						break;
					case 3:
						resultado.append("215g e são para fazer bolos]");
						break;
					case 4:
						resultado.append("280g e são para fazer ovos de páscoa]");
						break;
				}
				
				System.out.println(resultado);
			}
		}
	}
	
	public int hash(int valor) {
		int hash = 0;
		if(valor >= 50 && valor <= 60) {
			hash = 0;
		}else if(valor >= 100 && valor <= 110) {
			hash = 1;
		}else if(valor >= 150 && valor <= 165) {
			hash = 2;
		}else if(valor >= 200 && valor <= 220) {
			hash = 3;
		}else if(valor >= 260 && valor <= 280) {
			hash = 4;
		}
		return hash;
	}

}
