package controller;

import javax.swing.JOptionPane;

import model.Departamento;
import model.Lista;

public class HashtableController {

	@SuppressWarnings("unchecked")
	Lista<Departamento>[] hashtable = new Lista[4];
	
	public HashtableController() {
		for(int i = 0; i < hashtable.length; i++) {
			hashtable[i] = new Lista<Departamento>();
		}
	}
	
	public void inserir(int andar, String nome, String descricao) throws Exception {
		Departamento departamento = new Departamento(andar, nome, descricao);
		int hash = hash(departamento.andar);
		hashtable[hash].addLast(departamento);
	}
	
	public void consultar(int andar, String nome) throws Exception {
		int hash =  hash(andar);
		boolean foiAchado = false;
		for(int i = 0; i < hashtable[hash].size(); i++) {
			Departamento departamento = hashtable[hash].get(i);
			if(departamento.nome.equals(nome)) {
				String resultado = String.format("[ %dº Andar - Nome: %s - Descricao: %s ]", departamento.andar, departamento.nome, departamento.descricao);
				JOptionPane.showMessageDialog(null, resultado);
				foiAchado = true;
				break;
			}
		}
		if(!foiAchado) {
			JOptionPane.showMessageDialog(null, "Departamento não encontrado.");
		}
	}
	
	public void remover(int andar, String nome) throws Exception {
		int hash =  hash(andar);
		boolean foiAchado = false;
		for(int i = 0; i < hashtable[hash].size(); i++) {
			Departamento departamento = hashtable[hash].get(i);
			if(departamento.nome.equals(nome)) {
				hashtable[hash].remove(i);
				JOptionPane.showMessageDialog(null, "Departamento removido.");
				foiAchado = true;
				break;
			}
		}
		if(!foiAchado) {
			JOptionPane.showMessageDialog(null, "Departamento não encontrado.");
		}
	}
	
	public void popularHashtable() throws Exception {
		inserir(0, "celulares e smartphones", "Artigos para telefonia móvel");
		inserir(0, "tv e vídeo", "Artigos para televisores");	
		inserir(0, "consoles e games", "Artigos para video games");	
		inserir(0, "áudio", "Artigos de som");	
		inserir(0, "telefonia fixa", "Artigos para telefonia");	
		inserir(0, "informática", "Computadores e laptops corporativos");	
		inserir(0, "acessórios e periféricos", "Hardwares");	
		inserir(0, "pc gamer", "Computadores e laptops gamers");	
		
		inserir(1, "eletrodomésticos", "Artigos Eletrodomésticos");	
		inserir(1, "eletroportáteis", "Artigos Eletroportáteis");	
		inserir(1, "ar e ventilação", "Ventiladores e Ar condicionado");	
		inserir(1, "móveis e decoração", "Móveis");	
		inserir(1, "casa e construção", "Materiais para construção");	
		inserir(1, "cama, mesa e banho", "Artigos para cama, mesa e banho");
		
		inserir(2, "livros", "Livraria");
		inserir(2, "instrumentos musicais", "Instrumentos músicas e acessórios");
		inserir(2, "música", "Discos");
		inserir(2, "filmes e séries", "DVD e Blu-ray");

		inserir(3, "mercado", "Itens de supermercado");
		inserir(3, "automotivo", "Peças e acessórios para automóveis");
		inserir(3, "brinquedos", "Itens infantis");
		inserir(3, "bebês", "Itens para a primeira infância");
		inserir(3, "gift cards", "Cartões presente");
		inserir(3, "pet shop", "Comida e acessórios para pet");
		inserir(3, "papelaria", "Itens de papelaria");
		
	}
	
	private int hash(int valor) {
		int hash = valor % 4;
		return hash;
	}
	
}
