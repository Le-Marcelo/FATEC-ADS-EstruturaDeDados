package view;

import br.edu.fateczl.ordenacao.quicksort.QuickSort;

public class Principal {

	public static void main(String[] args) {
		int[] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] vetor2 = {44, 43, 42, 41, 40, 39, 38};
		int[] vetor3 = {31, 32, 33, 34, 99, 98, 97, 96};
		
		QuickSort sort = new QuickSort();
		StringBuffer buffer = new StringBuffer();
		
		vetor1 = sort.quickSort(vetor1, 0, vetor1.length - 1);
		vetor2 = sort.quickSort(vetor2, 0, vetor2.length - 1);
		vetor3 = sort.quickSort(vetor3, 0, vetor3.length - 1);
		
		buffer.append("Vetor1:\t");
		
		for(int i : vetor1) {
			buffer.append(i + " ");
		}
		
		buffer.append("\nVetor2:\t");
		
		for(int i : vetor2) {
			buffer.append(i + " ");
		}
		
		buffer.append("\nVetor3:\t");
		
		for(int i : vetor3) {
			buffer.append(i + " ");
		}
		
		String resultado = buffer.toString();
		
		System.out.println(resultado);
		
	}

}
