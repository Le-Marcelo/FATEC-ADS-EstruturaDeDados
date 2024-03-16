package controller;

import model.Cliente;
import model.Fila;

public class OperacaoController {

	public OperacaoController() {
		super();
	}

	public void caixa(Fila<Cliente> fila) {
		try {
			while(!fila.isEmpty()) {
				Cliente cliente = fila.remove();
				float valorTotal = cliente.quantidadePecas * cliente.valorPecas;
				String nome = cliente.nome;
				
				System.out.println(String.format("Cliente: %s - Valor da compra: R$%.2f", nome, valorTotal));
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			
		}
	}
}
