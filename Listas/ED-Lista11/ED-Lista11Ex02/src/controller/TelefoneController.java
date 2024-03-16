package controller;

import model.Fila;

public class TelefoneController {

	public TelefoneController() {
		super();
	}
	
	public void insereLigacao(Fila<String> f, String numeroTelefone) {
		f.insert(numeroTelefone);
	}
	
	public void consultaLigacoes(Fila<String> f) throws Exception{
		if(f.isEmpty()) {
			throw new Exception("Sem ligações no histórico");
		}
		
		System.out.println("Chamadas Perdidas");
		while(!f.isEmpty()) {
			String numero = f.remove();
			System.out.println(numero);
		}
	}

}
