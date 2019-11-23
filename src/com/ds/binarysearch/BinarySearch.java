package com.ds.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {

		int[] array = { 11, 23, 35, 48, 89, 90, 110, 124, 456, 789, 1045 };

		int key = 1045;

		int position = findKey(array, key);

		System.out.println("Position : " + position);

	}

	private static int findKey(int[] array, int key) {
		int p = 0; // first index
		int q = 0; // middle index
		int r = array.length - 1;

		while (p <= r) {

			System.out.println("while.....");
			q = Math.round((p + r) / 2);
			System.out.println("P:" + p + " , Q : " + q + " , R : " + r);

			if (array[q] == key) {
				return q;
			} else if (array[q] > key) {
				r = q - 1;
			} else if (array[q] < key) {
				p = q + 1;
			}

		}

		return -1;

	}
}
