package com.ds.singlelinkedlist;

public class SingleLinkedList {

	NodeSL first;
	NodeSL last;

	public void insertNodeFirst(int data) {
		NodeSL newNode = new NodeSL();
		newNode.data = data;

		 
		newNode.next = first;
		first = newNode;
		
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return ( first == null ) ;
	}

	 

	public void displayNodes() {
		NodeSL currentNode = first;

		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}

	}

}
