package controller;

import model.Lista;

public class UniaoInterseccaoController {

	public UniaoInterseccaoController() {
		super();
	}
	
	public Lista<Integer> interseccao(Lista<Integer> listaA, Lista<Integer> listaB) throws Exception{
		Lista<Integer> listaI = new Lista<Integer>();
		
		for(int i = 0; i < listaA.size(); i++) {
			for(int j = 0; j < listaB.size(); j++) {
				if(listaA.get(i) == listaB.get(j)) {
					listaI.addLast(listaA.get(i));
				}
			}
		}
		
		return listaI;
	}
	
	public Lista<Integer> uniao(Lista<Integer> listaA, Lista<Integer> listaB) throws Exception {
		Lista<Integer> listaU = listaA;
		
		for(int i = 0; i < listaB.size(); i++) {
			boolean repetido = false;
			for(int j = 0; j < listaU.size(); j++) {
				if(listaB.get(i) == listaU.get(j)) {
					repetido = true;
					break;
				}
			}
			if(!repetido) {
				listaU.addLast(listaB.get(i));
			}
		}
		
		return listaU;
		
	}

}
