package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.ordenacao.bubblesort.BubbleSort;
import br.edu.fateczl.ordenacao.mergesort.MergeSort;

public class Principal {
	

	public static void main(String[] args) {
		int[] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] vetor2 = {44, 43, 42, 41, 40, 39, 38};
		int opcao;
		
		BubbleSort bubbleSort = new BubbleSort();
		MergeSort mergeSort = new MergeSort();
		
		do{
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha como ordenar os vetores(Ver no console): \n"
												                   + "1- Bubble Sort\n"
												                   + "2- Merge Sort"));
			
			switch(opcao) {
				case 1:
					vetor1 = bubbleSort.bubbleSort(vetor1);
					vetor2 = bubbleSort.bubbleSort(vetor2);
					break;
				
				case 2:
					vetor1 = mergeSort.mergeSort(vetor1, 0, vetor1.length - 1);
					vetor2 = mergeSort.mergeSort(vetor2, 0, vetor2.length - 1);
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Digite uma opção válida");
			}
		}while(opcao != 1 && opcao != 2);
		
		for(int i : vetor1) {
			System.out.print(i + " ");
		}
		System.out.println("Ordenação do vetor 1");
		
		for(int i : vetor2) {
			System.out.print(i + " ");
		}
		System.out.println("Ordenação do vetor 2");
		
	}

}
