package controller;

import model.Fila;
import model.Pessoa;

public class ParqueController {

	public ParqueController() {
		super();
	}
	
	public void brinquedo(Fila<Pessoa> fila) {
		try {
			while(!fila.isEmpty()) {
				Pessoa pessoa = fila.remove();
				String resposta = "";
				
				if(pessoa.altura <= 1.60f) {
					resposta = " não entrou no brinquedo pois não possui a altura necessária.";
					
				}else if(pessoa.idade <= 16) {
					resposta = " não entrou no brinquedo pois não possui a idade necessária.";
					
				}else {
					resposta = " entrou no brinquedo.";
					
				}
				
				System.out.println(pessoa.nome + resposta);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			
		}
	}

}
