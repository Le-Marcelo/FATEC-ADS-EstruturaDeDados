package model;

public class Fila<Tipo> {

	No<Tipo> inicio;
	No<Tipo> fim;
	
	public Fila() {
		inicio = null;
		fim = null;
	}
	
	public boolean isEmpty() {
		if(inicio == null && fim == null) {
			return true;
			
		}else{
			return false;
			
		}
	}
	
	public void insert(Tipo valor) {
		No<Tipo> elemento = new No<>();
		elemento.dado = valor;
		elemento.proximo = null;
		
		if(isEmpty()) {
			inicio = elemento;
			fim = inicio;
			
		}else {
			fim.proximo = elemento;
			fim = elemento;
			
		}
	}
	
	public Tipo remove() throws Exception{
		if(isEmpty()) {
			throw new Exception("Não há elementos na fila");
		}
		
		Tipo valor = inicio.dado;
		
		if(inicio == fim && inicio != null) {
			inicio = null;
			fim = inicio;
			
		}else {
			inicio = inicio.proximo;
		}
		
		return valor;
	}
	
	public void list() throws Exception{
		if(isEmpty()) {
			new Exception("Não há elementos na fila");
			
		}
		
		No<Tipo> auxiliar = inicio;
		
		while(auxiliar != null) {
			System.out.println(auxiliar.dado);
			auxiliar = auxiliar.proximo;
		}
	}
	
	public int size() {
		int contador = 0;
		
		if(!isEmpty()) {
			No<Tipo> auxiliar = inicio;
			
			while(auxiliar != null) {
				contador++;
				auxiliar = auxiliar.proximo;
				
			}
		}
		
		return contador;
	}
}
