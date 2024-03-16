package controller;

import model.Lista;

public class MaioresController {

	public MaioresController() {
		super();
	}
	
	//essa função considera apenas números positivos
	public void maioresDoisNumeros(Lista<Integer> lista) throws Exception{
		int n1 = 0, n2 = 0;
		for(int i = 0; i < lista.size(); i++) {
			int aux = lista.get(i);
			
			if(aux > n1) {
				n2 = n1;
				n1 = aux;
			}else if(aux > n2) {
				n2 = aux;
			}
		}
		
		System.out.println(String.format("Os maiores itens na lista são: %d e %d", n1, n2));
	}

}
