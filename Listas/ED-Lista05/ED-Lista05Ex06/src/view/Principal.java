package view;

import java.util.Random;

import br.edu.fateczl.ordenacao.bubblesort.BubbleSort;
import br.edu.fateczl.ordenacao.mergesort.MergeSort;
import br.edu.fateczl.ordenacao.quicksort.QuickSort;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = new int[9000];
		int j = 1499;
		
		//Preencher o vetor aleatoriamente
//		for(int i = 0; i < 9000; i++) {
//			vetor[i] = (int) (Math.random() * 1500 + 1);
//		}
		
		//Preencher o vetor no pior caso (1499, 1498, 1497, ..., 0)
		for(int i = 0; i < 1500; i++) {
			vetor[i] = j;
			j--;
		}
		
		BubbleSort bubble = new BubbleSort();
		MergeSort merge = new MergeSort();
		QuickSort quick = new QuickSort();
		
		double tempoInicial = System.nanoTime();
		int[] vetorAux = bubble.bubbleSort(vetor);
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / 1000000;
		
		System.out.println(String.format("Bubble Sort:\t%.2fms",tempoTotal));
		
		tempoInicial = System.nanoTime();
		vetorAux = merge.mergeSort(vetor, 0, vetor.length - 1);
		tempoFinal = System.nanoTime();
		tempoTotal = (tempoFinal - tempoInicial) / 1000000;
		
		System.out.println(String.format("Merge Sort:\t%.2fms",tempoTotal));
		
		tempoInicial = System.nanoTime();
		vetorAux = quick.quickSort(vetor, 0, vetor.length - 1);
		tempoFinal = System.nanoTime();
		tempoTotal = (tempoFinal - tempoInicial) / 1000000;
		
		System.out.println(String.format("Quick Sort:\t%.2fms",tempoTotal));
	}

}
