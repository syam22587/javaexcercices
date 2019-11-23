package com.ds.doublelinkedlist;

public class DoubleLinkedList {

	Node first;
	Node last;

	// this inserts the item at the begining of the list
	void insertAtFirst(int data) {

		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			last = newNode; // this assings the newly create nodes reference to the "last"
		} else {
			first.prev = newNode;
		}

		newNode.next = first;
		first = newNode;

	}

	//
	void insertAtLast(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;
			newNode.prev = last;
		}

		last = newNode;
	}

	// delete node at first position

	public int deleteNodeAtFirst() {
		Node temp = first;

		if (isEmpty()) {
			return -1;
		} else {
			first.next.prev = null;
			first = first.next;

		}

		return temp.data;
	}

	// delete node at first position

	public int deleteNodeAtLast() {
		Node temp = last;

		if (isEmpty()) {
			return -1;
		} else {
			last.prev.next = null;
			last = last.prev;
		}

		// last.prev = last ;

		return temp.data;
	}

	// this is to check if the list is empty

	boolean isEmpty() {
		return first == null;
	}

	// display all nodes

	public void displayNodes() {
		Node currentNode = first;

		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}

	}

	public boolean insertAfter(int key, int data) {

		// create a node with data to insert after a specific key
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			System.out.println("Oops...no items to scan... ");
		} else {

			Node current = first;
			while (current.data != key) {
				current = current.next;

				if (current.next == null) {
					return false;
				}

				if (current == last) {
					current.next = null ;
					 
					last = newNode; // adding the node at the end .
				} else {
					//current.next = newNode;
					Node temp = current.next;
					current.next = newNode;
					newNode.prev = current.next;
					temp.prev = newNode;
					newNode.next = temp;
					return true ; 
				}

			}

		}
		return false  ;

	}
}
