package com.ds.circularlinkedlist;

public class CircularLinkedList {

	Node first;
	Node last;

	// insert Node at the first position
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			last = newNode;
		}

		newNode.next = first;
		first = newNode;

	}

	// insert the node at the last position
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			first = newNode;
		}

		last.next = newNode;
		newNode = last;

	}

	// check if the method is empty

	private boolean isEmpty() {
		return (first == null);
	}

	// display all nodes

	public void displayNodes() {
		Node currentNode = first;

		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}

	}

	// Delete the node at the first position

	public int deleteFirstNode() {

		if (isEmpty()) {
			return -1;
		} else {
			Node temp = first;
			first = first.next;

			return temp.data;
		}

	}

 

}
