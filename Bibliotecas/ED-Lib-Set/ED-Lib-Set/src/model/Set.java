package model;

public class Set<Tipo> {
	
No<Tipo> primeiro = null;
	
	public boolean isEmpty() {
		if(primeiro == null) {
			return true;
			
		}else {
			return false;
		}
	}
	
	private boolean contains(Tipo valor) throws Exception{
		for(int i = 0; i < size(); i++) {
			if(valor == get(i)) {
				return true;
			}
		}
		
		return false;
	}
	
	public int size() {
		int contador = 0;
		
		if(!isEmpty()) {
			No<Tipo> auxiliar = primeiro;
			
			while(auxiliar != null) {
				contador++;
				auxiliar = auxiliar.proximo;
				
			}
			
		}
		
		return contador;
	}
	
	private No<Tipo> getNo(int posicao) throws Exception{
		if(isEmpty()) {
			throw new Exception("Lista Vazia");
			
		}
		
		int tamanho = size();
		
		if(posicao < 0 || posicao > tamanho - 1) {
			throw new Exception("Posi��o Inv�lida");
			
		}
		
		No<Tipo> auxiliar = primeiro;
		int contador = 0;
		
		while(contador < posicao) {
			auxiliar = auxiliar.proximo;
			contador++;
			
		}
		
		return auxiliar;
		
	}
	
	public void addFirst(Tipo valor) throws Exception{
		if(contains(valor)) {
			throw new Exception("O valor já está na lista");
		}
		
		No<Tipo> elemento = new No<>();
		elemento.dado = valor;
		elemento.proximo = primeiro;
		primeiro = elemento;
		
	}
	
	public void addLast(Tipo valor) throws Exception{
		if(contains(valor)) {
			throw new Exception("O valor já está na lista");
		}
		
		int tamanho = size();
		
		if(isEmpty()) {
			addFirst(valor);
			
		}else {
			No<Tipo> elemento = new No<>();
			elemento.dado = valor;
			elemento.proximo = null;
			No<Tipo> ultimo = getNo(tamanho - 1);
			ultimo.proximo = elemento;
		
		}
	}
	
	public void add(Tipo valor, int posicao) throws Exception{
		if(contains(valor)) {
			throw new Exception("O valor já está na lista");
		}
		
		int tamanho = size();
		
		if(posicao < 0 || posicao > tamanho) {
			throw new Exception("Posi��o Inv�lida");
			
		}
		
		if(posicao == 0) {
			addFirst(valor);
			
		}else if(posicao == tamanho) {
			addLast(valor);
			
		}else {
			No<Tipo> elemento = new No<>();
			elemento.dado = valor;
			No<Tipo> anterior = getNo(posicao - 1);
			elemento.proximo = anterior.proximo;
			anterior.proximo = elemento;
			
		}
	}
	
	public void removeFirst() throws Exception{
		if(isEmpty()) {
			throw new Exception("Lista Vazia");
			
		}
		
		primeiro = primeiro.proximo;
	}
	
	public void removeLast() throws Exception{
		if(isEmpty()) {
			throw new Exception("Lista Vazia");
			
		}
		
		int tamanho = size();
		
		if(tamanho == 1) {
			removeFirst();
			
		} else {
			No<Tipo> penultimo = getNo(tamanho - 2);
			penultimo.proximo = null;
			
		}
	}
	
	public void remove(int posicao) throws Exception{
		int tamanho = size();
		
		if(posicao < 0 || posicao > tamanho - 1) {
			throw new Exception("Posi��o Inv�lida");
			
		}
		
		if(isEmpty()) {
			throw new Exception("Lista Vazia");
			
		}
		
		if(posicao == 0) {
			removeFirst();
			
		}else if(posicao == tamanho - 1) {
			removeLast();
			
		}else {
			No<Tipo> anterior = getNo(posicao - 1);
			No<Tipo> atual = getNo(posicao);
			anterior.proximo = atual.proximo;
			
		}
	}

	public Tipo get(int posicao) throws Exception{
		if(isEmpty()) {
			throw new Exception("Lista Vazia");
			
		}
		
		int tamanho = size();
		
		if(posicao < 0 || posicao > tamanho - 1) {
			throw new Exception("Posi��o Inv�lida");
			
		}
		
		int contador = 0;
		No<Tipo> auxiliar = primeiro;
		
		while(contador < posicao) {
			auxiliar = auxiliar.proximo;
			contador++;
			
		}
		
		return auxiliar.dado;
	}
}