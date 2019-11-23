package com.ds.queue;

public class Queue {

	int maxSize;
	long[] queueArray;
	int front;
	int rear;
	int noOfItems;

	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[maxSize];
		this.front = 0;
		this.rear = -1; // defined to know where the rear is parked..
		this.noOfItems = 0;

	}

	public void insert(int item) {

		if (rear == maxSize - 1) {
			rear = -1;
		}
		rear++;
		queueArray[rear] = item;
		noOfItems++;

	}

	public long remove() {

		if (isQueueEmpty()) {
			System.out.println("Ques is already empty.");
			return -111;
		} else {
			long temp = queueArray[front];
			front++;

			if (front == maxSize) {
				front = 0;
			}

			noOfItems--;
			return temp;
		}

	}

	public void view() {
		if (!isQueueEmpty()) {
			for (int i = 0; i < queueArray.length; i++) {
				System.out.println("--> " + queueArray[i]);
			}
		}
	}

	private boolean isQueueEmpty() {
		return (noOfItems == 0);
	}

	private boolean isQueueFull() {
		return (noOfItems == maxSize);
	}

}
