package br.edu.fateczl.ordenacao.quicksort;

public class QuickSort {

	public QuickSort() {
		super();
	}
	
	//Função de ordenação "QuickSort"
	public int[] quickSort(int[] vetor, int inicio, int fim) {
		if(fim > inicio) {
			int pivoFixo = dividir(vetor, inicio, fim);
			quickSort(vetor, inicio, pivoFixo - 1); //Subvetor da esquerda
			quickSort(vetor, pivoFixo + 1, fim);	//Subvetor da direita
		}
		return vetor;
	}
	
	//Função para dividir um vetor em 2 menores a partir de um pivô
	private int dividir(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int ponteiroEsquerda = inicio + 1;
		int ponteiroDireita = fim;
		
		while(ponteiroEsquerda <= ponteiroDireita){
			while(ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroEsquerda] <= pivo) {
				ponteiroEsquerda++;
			}
			while(ponteiroDireita >= ponteiroEsquerda && vetor[ponteiroDireita] > pivo) {
				ponteiroDireita--;
			}
			
			if(ponteiroEsquerda < ponteiroDireita) {
				trocar(vetor, ponteiroEsquerda, ponteiroDireita);
				ponteiroEsquerda++;
				ponteiroDireita--;
			}
		}
		trocar(vetor, inicio, ponteiroDireita);
		return ponteiroDireita;
	}
	
	
	//Função para trocar dois números de posição em um vetor
	private void trocar(int[] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}

}
