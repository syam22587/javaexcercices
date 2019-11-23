package com.ds.stack;

public class Stack {

	int maxSize;
	int top;
	long[] stackArray;

	public Stack(int size) {
		this.maxSize = size;
		this.top = -1;
		this.stackArray = new long[maxSize];
	}

	public void push(int item) {
		if (isFull()) {
			System.out.println("Unfortunatley..stack is full ... ");
		} else {
			top++;
			stackArray[top] = item;
		}

	}

	public long pop() {
		if(isStackEmpty()) {
			System.out.println("oops...nothing is there to empty....");
			return -11; 
		} else {
			int oldTop = top;
			top--;
			return stackArray[oldTop];
		}
	
	}

	public boolean isStackEmpty() {
		boolean flag = false;
		if (top == -1)
			flag = true;
		return flag;
	}

	public boolean isFull() {
		boolean flag = false;
		if (maxSize - 1 == top)
			flag = true;

		return flag;
	}

	public void peek() {
		System.out.println(stackArray[top]);

	}

}
