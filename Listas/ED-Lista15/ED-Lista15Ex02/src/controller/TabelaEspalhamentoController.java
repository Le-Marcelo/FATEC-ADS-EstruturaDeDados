package controller;

import model.Lista;
import model.Morador;

public class TabelaEspalhamentoController {

	@SuppressWarnings("unchecked")
	Lista<Morador>[] hashTable = new Lista[10];
	
	public TabelaEspalhamentoController() {
		for(int i = 0; i < hashTable.length; i++) {
			hashTable[i] = new Lista<Morador>();
		}
	}
	
	public void cadastrarMorador(int numApartamento, String nome, String modeloCarro, String corCarro, String placaCarro) throws Exception{
		Morador morador = new Morador(numApartamento, nome, modeloCarro, corCarro, placaCarro);
		
		int hashValue = hash(numApartamento);
		hashTable[hashValue - 1].addLast(morador);
	}
	
	public void consultarMorador(int numApartamento, String placaCarro) throws Exception{
		for(int i = 0; i < hashTable[hash(numApartamento)].size(); i++) {
			Morador morador = hashTable[hash(numApartamento)].get(i);
			
			if(morador.placaCarro.equals(placaCarro)) {
				String resultado = String.format("[Apto: %s - Nome: %s - Modelo: %s - Cor: %s - Placa: %s]", morador.numApartamento, morador.nome, morador.modeloCarro, morador.corCarro, morador.placaCarro);
				System.out.println(resultado);
				break;
			}
		}
	}
	
	public void excluirMorador(int numApartamento, String placaCarro) throws Exception{
		for(int i = 0; i < hashTable[hash(numApartamento)].size(); i++) {
			Morador morador = hashTable[hash(numApartamento)].get(i);
			
			if(morador.placaCarro.equals(placaCarro)) {
				hashTable[hash(numApartamento)].remove(i);
				break;
			}
		}
	}
	
	public void listarAndar(int andar) throws Exception{
		for(int i = 0; i < hashTable[andar - 1].size(); i++) {
			Morador morador = hashTable[andar - 1].get(i);
			System.out.println(String.format("[Apto. - %s \tNome: %s]", morador.numApartamento, morador.nome));
		}
	}
	
	//Hash baseado no nº do apartamento
	private int hash(int valor) {
		int hash = valor / 100;
		return hash;
	}
}
