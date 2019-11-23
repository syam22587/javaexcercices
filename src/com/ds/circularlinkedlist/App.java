package com.ds.circularlinkedlist;

public class App {

	public static void main(String[] args) {
		CircularLinkedList cl = new CircularLinkedList(); 
		 cl.insertFirst(10);
		 cl.insertFirst(20);
		 cl.insertFirst(30);
		 cl.insertFirst(40);
		 cl.insertLast(50);
		 cl.insertFirst(60);
		 
		 cl.displayNodes();
		 
		 // delete first node 
		 
		 System.out.println("----------------");
		 cl.insertLast(7896);
		 cl.deleteFirstNode() ; 
		 cl.displayNodes();
		 System.out.println("----------------");
		 cl.deleteFirstNode() ; 
		 
		 cl.displayNodes();
	}
	
}
