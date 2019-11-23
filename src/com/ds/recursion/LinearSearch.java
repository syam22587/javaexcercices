package com.ds.recursion;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 9 };
		int key = 3;
		int position = linearSearchByRecursion(a, key, 0);
		System.out.println("Position found :" + position);
	}

	private static int linearSearchByRecursion(int[] a, int key, int i) {

		if (i < a.length) {
			if (a[i] != key)
				return linearSearchByRecursion(a, key, ++i);
		}
		System.out.println(i);

		return -1;
	}
}
