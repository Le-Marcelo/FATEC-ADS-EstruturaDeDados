package controller;

import javax.swing.JOptionPane;

import model.Conta;
import model.Lista;

public class HashtableController {

	@SuppressWarnings("unchecked")
	Lista<Conta>[] hashtable = new Lista[2]; 
	
	public HashtableController() {
		hashtable[0] = new Lista<Conta>();
		hashtable[1] = new Lista<Conta>();
	}
	
	public void inserir(int numero, String nome, float saldo) throws Exception{
		if(numero > 9999) {
			throw new Exception("Número de conta inválido");
		}else {
			int hash = hash(numero);
			
			Conta conta = new Conta(numero, nome, saldo);
			
			hashtable[hash].addLast(conta);
		}
	}
	
	public void consultar(int numero) throws Exception {
		if(numero > 9999) {
			throw new Exception("Número de conta inválido");
		}else {
			int hash = hash(numero);
			boolean foiAchado = false;
			
			for(int i = 0; i < hashtable[hash].size(); i++) {
				Conta conta = hashtable[hash].get(i);
				if(conta.numero == numero) {
					String resultado = String.format("[ Numero %d - Nome do cliente: %s - Saldo: R$%.2f", conta.numero, conta.nomeCliente, conta.saldo);
					JOptionPane.showMessageDialog(null, resultado);
					foiAchado = true;
					break;
				}
			}
			
			if(!foiAchado) {
				throw new Exception("Conta não encontrada.");
			}
		}
	}
	
	public void remover(int numero) throws Exception {
		if(numero > 9999) {
			throw new Exception("Número de conta inválido");
		}else {
			int hash = hash(numero);
			boolean foiAchado = false;
			
			for(int i = 0; i < hashtable[hash].size(); i++) {
				Conta conta = hashtable[hash].get(i);
				if(conta.numero == numero) {
					hashtable[hash].remove(i);
					JOptionPane.showMessageDialog(null, "Conta removida.");
					foiAchado = true;
					break;
				}
			}
			
			if(!foiAchado) {
				throw new Exception("Conta não encontrada.");
			}
		}
	}
	
	private int hash(int valor) {
		int hash = valor % 2;
		return hash;
	}

}
