package br.edu.fateczl.ordenacao.mergesort;

public class MergeSort {

	public MergeSort() {
		super();
	}
	
	public int[] mergeSort(int[] vetor, int inicio, int fim) {
		
		if(inicio < fim) { //Subvetor de 2 ou mais posições
			int meio = (inicio + fim) / 2;
			
			mergeSort(vetor, inicio, meio); //Subvetor da esquerda
			mergeSort(vetor, meio + 1, fim); //Subvetor da direita
			intercalar(vetor, inicio, meio, fim);
		}
		
		return vetor;
	}

	private void intercalar(int[] vetor, int inicio, int meio, int fim) {
		int tamanho = vetor.length;
		int[] vetorAuxiliar = new int[tamanho];
		
		for(int i = inicio; i <= fim; i++) {
			vetorAuxiliar[i] = vetor[i];
		}
		
		int ponteiroEsquerda = inicio;
		int ponteiroDireita = meio + 1;
		
		for(int cont = inicio; cont <= fim; cont ++) {
			if(ponteiroEsquerda > meio) {
				
				vetor[cont] = vetorAuxiliar[ponteiroDireita];
				ponteiroDireita++;
				
			}else if(ponteiroDireita > fim) {
				
				vetor[cont] = vetorAuxiliar[ponteiroEsquerda];
				ponteiroEsquerda++;
				
			}else if(vetorAuxiliar[ponteiroEsquerda] < vetorAuxiliar[ponteiroDireita]) {
				
				vetor[cont] = vetorAuxiliar[ponteiroEsquerda];
				ponteiroEsquerda++;
				
			}else {
				
				vetor[cont] = vetorAuxiliar[ponteiroDireita];
				ponteiroDireita++;
				
			}
		}
		
	}

}
