package com.ds.queue;

public class QueueMain {

	public static void main(String args[]) {
		Queue que = new Queue(5);
		que.insert(1);
		que.insert(178);
		que.insert(12);
		que.insert(87);
		que.insert(178);

		System.out.println(que.remove() + " removed....");
		System.out.println(que.remove() + " removed....");
		que.insert(1768);
		// que.insert(123456);

		que.view();
	}

}
