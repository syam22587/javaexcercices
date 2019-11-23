package com.ds.doublelinkedlist;

public class App {

	public static void main(String[] args) {
		DoubleLinkedList dl = new DoubleLinkedList();
		dl.insertAtFirst(10);
		dl.insertAtFirst(20);
		dl.insertAtFirst(30);
		dl.insertAtFirst(40);

	//	dl.displayNodes();

		//System.out.println("-----------");

		dl.insertAtLast(999);

	//	dl.displayNodes();

		System.out.println("-----------");

		// dl.deleteNodeAtFirst();

		//dl.displayNodes();

		System.out.println("-----------");

		// System.out.println("asfasdf" + dl.deleteNodeAtLast());

		dl.displayNodes();

		System.out.println("-----------");

		// insert an element after a specific key .

		System.out.println("STATUS is: "  + dl.insertAfter(20, 222) ) ;
		dl.displayNodes();

		System.out.println("-----------");

		// insert an element after a specific key .

		//dl.insertAfter(30, 444);
		//dl.displayNodes();

		System.out.println("-----------");

	}

}
