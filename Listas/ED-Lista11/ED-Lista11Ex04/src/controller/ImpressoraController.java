package controller;

import model.Fila;

public class ImpressoraController {

	public ImpressoraController() {
		super();
	}
	
	public void insereDocumento(Fila<String> f, String documento) {
		f.insert(documento);
	}
	
	public void imprime(Fila<String> f) throws Exception{
		if(f.isEmpty()) {
			throw new Exception("Sem documentos na fila de impressão.");
		}
		
		String documento = f.remove();
		String[] dados = documento.split(";");
			
		System.out.println(String.format("[#PC: %s - Arquivo: %s]", dados[0], dados[1]));
		Thread.sleep((long) (Math.random() * 1000 + 1000));
		
	}

}
