package br.com.bubblesort;

public class Main {

	public static void main(String[] args) {
		
		int[] array = {5, 3, 2, 4, 7, 1, 0, 6 };
		
		BubbleSort bubbleSort = new BubbleSort();
		
		int[] arrayOrganizado = bubbleSort.organizar(array);
		
		for(int i = 0; i < arrayOrganizado.length; i++) {
			System.out.println(arrayOrganizado[i]);
		}
		
	}

}
