package com.ds.insertionsort;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] array = { 45, 23, 5, 67, 56, 21, 78 };
		System.out.println(Arrays.toString(array));

		int[] output = insertionSort(array);
		System.out.println(Arrays.toString(output));
	}

	private static int[] insertionSort(int[] a) {
		// TODO Auto-generated method stub
		System.out.println("asdf");
		for (int i = 1; i < a.length - 1; i++) {

			int element = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > element) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = element;
		}
		return a;
	}
}
