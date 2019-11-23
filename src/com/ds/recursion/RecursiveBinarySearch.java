package com.ds.recursion;

public class RecursiveBinarySearch {
	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10, 56 };
		int key = 90;
		int pos = recursiveBinarySearch(array, 0, array.length-1, key);
		System.out.println(pos);
	}

	private static int recursiveBinarySearch(int[] array, int p, int r, int key) {

		if (p > r) {
			return -1;
		} else {
			int q = (p + r) / 2;
			if (array[q] == key) {
				return q;
			} else if (array[q] > key) {
				return recursiveBinarySearch(array, p, q - 1, key);
			} else
				return recursiveBinarySearch(array, q + 1, r, key);
		}
	}

}
