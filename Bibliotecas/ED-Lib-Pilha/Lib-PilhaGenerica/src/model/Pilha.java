package model;

public class Pilha<Tipo> {

	No<Tipo> topo;

	public Pilha() {
		topo = null;

	}

	//Fun��o que faz o "Push": Inserindo dados novos na pilha referenciando o elemento anterior e se tornando o topo
	public void push(Tipo valor) {
		No<Tipo> elemento = new No<>();
		elemento.dado = valor;
		elemento.proximo = topo;
		topo = elemento;
	}

	//Fun��o para conferir se a pilha est� vazia
	public boolean isEmpty() {
		if(topo == null) {
			return true;

		}else {
			return false;

		}
	}

	//Fun��o que faz o "Pop": Removendo o topo, designando o pr�ximo dado como novo topo e retorna o dado que foi removido
	public Tipo pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Pilha vazia");
		}

		Tipo valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}

	//Fun��o "Top": Retorna o valor do dado no topo da pilha
	public Tipo top() throws Exception {
		if(isEmpty()) {
			throw new Exception("Pilha vazia");
		}

		Tipo valor = topo.dado;
		return valor;
	}

	//Fun��o para retornar o tamanho da pilha
	public int size() {
		int cont = 0;

		if(!isEmpty()) {
			No<Tipo> aux = topo;
			while (aux != null) {
				cont++;
				aux = aux.proximo;
			}
		}

		return cont;
	}
}
