package controller;

import model.Fila;
import model.Processo;

public class EscalonadorController {

	public EscalonadorController() {
		super();
	}
	
	public void escalonador(Fila<Processo> fila){
		try {
			while (!fila.isEmpty()) {
				Processo processo = fila.remove();
				processo.qtdRetornos--;
				
				if (processo.qtdRetornos > 1) {
					fila.insert(processo);
				} 
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			
		}
		
	}

}
