package controller;

import model.Lista;
import object.Musica;

public class PlayerController {

	public PlayerController() {
		super();
	}
	
	public void adicionaMusica(Lista<Musica> lista, String musica) {
		try {
			String[] dados = musica.split(";");
			Musica novaMusica = new Musica(dados[0], dados[1], Integer.parseInt(dados[2]));
			lista.addLast(novaMusica);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			
		}
	}
	
	public void removeMusica(Lista<Musica> lista, int posicao) throws Exception{
		if(lista.isEmpty()) {
			throw new Exception("A lista está vazia.");
		}
		
		lista.remove(posicao);
	}
	
	public void executaPlaylist(Lista<Musica> lista) {
		try {
			for(int i = 0; i < lista.size(); i++) {
				Musica musica = lista.get(i);
				System.out.println(String.format("[Música: %s - Artista: %s - Duração: %ds]", musica.nome, musica.nomeArtista, musica.duracao));
				Thread.sleep(musica.duracao * 1000);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			
		}
	}
}
