package view;

import controller.OperacaoController;
import model.Cliente;
import model.Fila;

public class Principal {

	public static void main(String[] args) {
		
		//Inicializar nova fila de clientes
		Fila<Cliente> fila = new Fila<>();
		
		//Inserir clientes na fila
		for(int i = 0; i < 20; i++) {
			String nome = "Cliente" + i;
			int qntPecas = (int) (Math.random() * 30 + 20);
			float valorPecas = (float) (Math.random() * 95 + 5);
			
			Cliente cliente = new Cliente(nome, qntPecas, valorPecas);
			fila.insert(cliente);
			
		}
		
		OperacaoController ctrl = new OperacaoController();
		
		ctrl.caixa(fila);
	}

}
