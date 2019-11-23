package com.ds.quicksort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = { 45, 3, 2, 1, 23, 5, 67, 56, 5, 78, 98, 0, -11, 101, 11, 77, 21, 78 };
		System.out.println(Arrays.toString(array));

		int[] output = quickSort(array, 0, array.length);
		System.out.println("After sorting using Quick sorting technique : " + Arrays.toString(output));

	}

	private static int[] quickSort(int[] array, int start, int end) {

		if (start < end) {
			int partition = partion(array, start, end); // q is nothing but the partitioned key
			quickSort(array, start, partition); // this sorts the left half of the range
			quickSort(array, partition + 1, end); // this sorts the right half of the range
			return array;
		}
		return array;

	}

	private static int partion(int[] array, int start, int end) {
		int element = array[end - 1];
		int i = start - 1; // i is taken as -1 to ensure the proper indexing to track the first index
		int j = 0; // j is to track the current position move forward

		for (j = start; j < end; j++) {
			// compare if jth element is less than the pivot element then incremnt ith index
			// and swap with a[i] with a[j] that ensure the elements are sorted out.
			if (array[j] < element) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		// finally swap the pivot position with the exact position as all small values
		// to pivot element are sorted and placed
		int temp = array[i + 1];
		array[i + 1] = element;
		array[end - 1] = temp;

		return i + 1;
	}

}
