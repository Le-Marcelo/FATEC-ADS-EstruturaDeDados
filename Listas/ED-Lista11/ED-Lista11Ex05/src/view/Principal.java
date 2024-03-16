package view;

import controller.ParqueController;
import model.Fila;
import model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Fila<Pessoa> fila = new Fila<Pessoa>();
		ParqueController ctrl = new ParqueController();
		
		//Inserir pessoas na fila
		for(int i = 0; i < 30; i++) {
			String nome = "Pessoa" + i;
			int idade = (int) (Math.random() * 30 + 10);
			float altura = (float) (Math.random() * 0.65f + 1.35f);
			
			Pessoa pessoa = new Pessoa(nome, idade, altura);
			fila.insert(pessoa);
		}
		
		ctrl.brinquedo(fila);
	}

}
