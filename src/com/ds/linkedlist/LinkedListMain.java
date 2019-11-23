package com.ds.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedListNode nodeA = new LinkedListNode();
		nodeA.data = 3333;

		LinkedListNode nodeB = new LinkedListNode();
		nodeB.data = 44444;

		LinkedListNode nodeC = new LinkedListNode();
		nodeC.data = 55555;

		LinkedListNode nodeD = new LinkedListNode();
		nodeD.data = 666666;
 
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;

		System.out.println("Total Lenth of node is : " + findLength(nodeA)); // this should return 4 as it traverses all nodes
		System.out.println("Total Lenth of node is : " + findLength(nodeB)); // this should return 3 as it traverses only 3 nodes starting from the nodeB
	//	System.out.println("Total Lenth of node is : " + findLength(nodeD)); // this should return 3 as it traverses only 3 nodes starting from the nodeB
		

	}
	
	// the below method finds the length of the node. 

	private static int findLength(LinkedListNode node) {
		int len = 0;
		LinkedListNode currentNode = node;
		
		
		while (currentNode != null) {
			//System.out.println(currentNode.data);
			len++;
			currentNode = currentNode.next;
		}
		return len;
	}

}
