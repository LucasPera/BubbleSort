package br.com.bubblesort;

public class BubbleSort {

	public int[] organizar(int[] array) {
		
		int aux = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < (array.length - i); j++) {
				if (array[j - 1] > array[j]) {
					aux = array[j - 1];
					array[j - 1] = array[j];
					array[j] = aux;
				}

			}
		}
		
		return array;
	}

}
