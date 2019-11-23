package com.ds.heap;

public class App {
	public static void main(String[] args) {
		Heap heap = new Heap(10) ; 
		heap.insertNode(10);
		heap.insertNode(5);
		heap.insertNode(30);
		heap.insertNode(25);
		heap.insertNode(7);
		heap.insertNode(2);
		heap.insertNode(1);

		heap.insertNode(1000);
		heap.insertNode(1200);
		heap.insertNode(9);
		
		heap.removeNode();
		heap.removeNode();
		
		 
	}
}
