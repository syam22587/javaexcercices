package com.ds.singlelinkedlist;

public class SingleLinkedListMain {

	public static void main(String[] args) {
		SingleLinkedList sl = new SingleLinkedList();
		sl.insertNodeFirst(10);
		sl.insertNodeFirst(20);
		sl.insertNodeFirst(0);
		sl.insertNodeFirst(30);
		sl.insertNodeFirst(40);
		sl.insertNodeFirst(50);

		sl.insertNodeFirst(5000);

		sl.displayNodes();

		// this linked list only moves the froward direction and any node doesnt know
		// its previous node information
	}
}
