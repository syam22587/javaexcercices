package com.ds.heap;

public class Node {
	int key;

	public Node(int data) {
		super();
		this.key = data;
	}

	public synchronized int getKey() {
		return key;
	}

	public synchronized void setKey(int key) {
		this.key = key;
	}

	
}
