package model;

public class ArvoreInt {

	No raiz = null;
	
	public ArvoreInt() {
		super();
	}
	
	public void insert(int dado) {
		No no = new No();
		no.dado = dado;
		no.esquerda = null;
		no.direita = null;
		insertLeaf(no, raiz);
	}
	
	private void insertLeaf(No no, No raizSubArvore) {
		if(raiz == null) {
			raiz = no;
			
		}else {
			if(no.dado < raizSubArvore.dado) {
				if(raizSubArvore.esquerda == null) {
					raizSubArvore.esquerda = no;
					
				}else {
					insertLeaf(no, raizSubArvore.esquerda);
				}
			}
			
			if(no.dado >= raizSubArvore.dado) {
				if(raizSubArvore.direita == null) {
					raizSubArvore.direita = no;
					
				}else {
					insertLeaf(no, raizSubArvore.direita);
				}
			}
		}
	}
	
	public void search(int valor) throws Exception{
		try {
			No no = nodeSearch(raiz, valor);
			int level = nodeLevel(raiz, valor);
			System.out.println("Dado " + no.dado + " nível " + level);
		} catch (Exception e) {
			throw new Exception("Valor não existente");
		}
	}

	private No nodeSearch(No raizSubArvore, int valor) throws Exception {
		if(raiz == null) {
			throw new Exception("Árvore vazia");
			
		}else if(raizSubArvore.dado > valor) {
			return nodeSearch(raizSubArvore.esquerda, valor);
			
		}else if(raizSubArvore.dado < valor) {
			return nodeSearch(raizSubArvore.direita, valor);
			
		}else {
			return raizSubArvore;
		}
	}
	
	private int nodeLevel(No raizSubArvore, int valor) throws Exception {
		if(raiz == null) {
			throw new Exception("Árvore vazia");
			
		}else if(raizSubArvore.dado > valor) {
			return 1 + nodeLevel(raizSubArvore.esquerda, valor);
			
		}else if(raizSubArvore.dado < valor) {
			return 1 + nodeLevel(raizSubArvore.direita, valor);
			
		}else {
			return 0;
		}
	}
	
	public void remove(int valor) throws Exception{
		try {
			removeChild(raiz, valor);
		} catch (Exception e) {
			throw new Exception("Valor não existente");
		}
	}

	private No removeChild(No raizSubArvore, int valor) throws Exception {
		if(raiz == null) {
			throw new Exception("Árvore vazia");
			
		}else if(raizSubArvore.dado > valor) {
			raizSubArvore.esquerda = removeChild(raizSubArvore.esquerda, valor);
			
		}else if(raizSubArvore.dado < valor) {
			raizSubArvore.direita = removeChild(raizSubArvore.direita, valor);
			
		}else {	//Achou o no
			if(raizSubArvore.esquerda == null && raizSubArvore.direita == null) {	//Remoção de folha
				raizSubArvore = null;
				
			}else if(raizSubArvore.esquerda == null) {	//No com filho a direita
				raizSubArvore = raizSubArvore.direita;
				
			}else if(raizSubArvore.direita == null) {	//No com filho a esquerda
				raizSubArvore = raizSubArvore.esquerda;
				
			}else {
				No no = raizSubArvore.esquerda;
				while(no.direita != null) {
					no = no.direita;
				}
				raizSubArvore.dado = no.dado;	//Buscar para trocar o no de posicao
				no.dado = valor;
				raizSubArvore.esquerda = removeChild(raizSubArvore.esquerda, valor);
			}
		}
		return raizSubArvore;
		
	}
	
	public void prefixSearch() throws Exception {
		prefix(raiz);
	}

	private void prefix(No raizSubArvore) throws Exception {
		if(raiz == null) {
			throw new Exception("Árvore vazia");
			
		}else {
			System.out.print(raizSubArvore.dado + " ");
			if(raizSubArvore.esquerda != null) {
				prefix(raizSubArvore.esquerda);
				
			}
			if(raizSubArvore.direita != null) {
				prefix(raizSubArvore.direita);
			}
		}
		
	}
	
	public void infixSearch() throws Exception {
		infix(raiz);
	}
	
	private void infix(No raizSubArvore) throws Exception {
		if(raiz == null) {
			throw new Exception("Árvore vazia");
			
		}else {
			if(raizSubArvore.esquerda != null) {
				infix(raizSubArvore.esquerda);
				
			}
			System.out.print(raizSubArvore.dado + " ");
			if(raizSubArvore.direita != null) {
				infix(raizSubArvore.direita);
			}
		}
		
	}
	
	public void postfixSearch() throws Exception {
		postfix(raiz);
	}
	
	private void postfix(No raizSubArvore) throws Exception {
		if(raiz == null) {
			throw new Exception("Árvore vazia");
			
		}else {
			if(raizSubArvore.esquerda != null) {
				postfix(raizSubArvore.esquerda);
				
			}
			if(raizSubArvore.direita != null) {
				postfix(raizSubArvore.direita);
			}
			System.out.print(raizSubArvore.dado + " ");
		}
		
	}
	

}
