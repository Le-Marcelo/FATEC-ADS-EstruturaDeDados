package controller;

import model.PilhaString;

public class HistoricoController {

	public HistoricoController() {
		super();
	}
	
	public void inserirEndereço(PilhaString pilha, String endereco) throws Exception{
		if(endereco.contains("http://www.") && endereco.contains(".com")) {
			pilha.push(endereco);
		}else {
			throw new Exception("Endereço inválido");
		}
	}
	
	public void removerEndereco(PilhaString pilha) throws Exception{
		if(!pilha.isEmpty()) {
			pilha.pop();
			if(pilha.isEmpty()) {
				throw new Exception("Histórico está vazio agora");
			}
			
		}else {
			throw new Exception("Impossivel remover pois o histórico está vazio");
		}
	}
	
	public String consultarEndereco(PilhaString pilha) throws Exception{
		if(!pilha.isEmpty()) {
			String endereco = pilha.top();
			if(pilha.size() == 1) {
				throw new Exception("Esse é o último endereço");
			}
			return endereco;
			
		}else {
			throw new Exception("Impossivel consultar pois o histórico está vazio");
		}
	}

}
