package com.ds.mergesort;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] array = { 45, 23, 5, 67, 56, 5, 78, 98, 101, 11, 77, 21, 78 };
		System.out.println(Arrays.toString(array));

		int[] output = sort(array);
		System.out.println("After sorting using merge sorting technique : " + Arrays.toString(output));
	}

	private static int[] sort(int[] array) {
		// TODO Auto-generated method stub

		return mergeSort(array, 0, array.length - 1);
	}

	private static int[] mergeSort(int[] array, int start, int end) {
		// TODO Auto-generated method stub

		if (end <= start)
			return array; // sorting is completed ...

		int mid = (start + end) / 2;

		mergeSort(array, start, mid);
		mergeSort(array, mid + 1, end);
		merge(array, start, mid, end);

		return array;
	}

	private static void merge(int[] array, int start, int mid, int end) {
		int k = 0; // define indexes
		int[] tempArray = new int[(end - start) + 1];

		int leftSlot = start;
		int rightSlot = mid + 1;

		while (leftSlot <= mid && rightSlot <= end) {
			if (array[leftSlot] < array[rightSlot]) {
				tempArray[k] = array[leftSlot];
				leftSlot++;
			} else {
				tempArray[k] = array[rightSlot];
				rightSlot++;
			}
			k++;
		}

		// the below fills the remaining un copied sorted items into the remining
		// tempArray

		if (leftSlot <= mid) {
			while (leftSlot <= mid) {
				tempArray[k] = array[leftSlot];
				leftSlot++;
				k++; // increment the kth counter
			}
		} else if (rightSlot <= end) {
			while (rightSlot <= end) {
				tempArray[k] = array[rightSlot];
				rightSlot++;
				k++; // increment the kth counter
			}
		}

		// we need to copy back the temp into the original input array

		for (int i = 0; i < tempArray.length; i++) {
			array[start + i] = tempArray[i];
		}

	}

}
