package com.ds.selectionsort;

import java.util.Arrays;

public class SelectionSort {

	// selection sort is a technique in which for each iteration a minimum is
	// compared against the rest of the elements and if
	// another minimum finds then the current minimum is swapped with a new minimum.
	// for every iteration this techniques ensures first item is sorted out and so
	// on

	public static void main(String[] args) {
		int[] array = { 45, 23, 5, 67, 56, 21, 78 };
		System.out.println(Arrays.toString(array));

		int[] output = selectionSort(array);
		System.out.println(Arrays.toString(output));
	}

	private static int[] selectionSort(int[] array) {
		// TODO Auto-generated method stub

		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}

			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;

			System.out.println("\" " + i + " th time  \" " + Arrays.toString(array));

		}

		return array;
	}

}
