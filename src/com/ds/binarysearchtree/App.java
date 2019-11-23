package com.ds.binarysearchtree;

public class App {

	public static void main(String[] args) {

		BST bst = new BST();
		bst.insertNode(100);
		bst.insertNode(20);
		bst.insertNode(10);
		bst.insertNode(15);
		bst.insertNode(25);
		bst.insertNode(65);
		bst.insertNode(3);
		bst.insertNode(5);
		
		System.out.println(bst.deleteNode(5));
		
		bst.printTree() ; 

	}

}
