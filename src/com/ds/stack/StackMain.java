package com.ds.stack;

public class StackMain {

	public static void main(String[] args) {
		int maxSize = 5;
		Stack st = new Stack(maxSize);

		st.push(10);
		
		st.peek(); 
		
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(50);
		st.peek(); 

		st.pop();

		while (!st.isStackEmpty()) {
			System.out.println("---> " + st.pop());
		}
		
		
		System.out.println("------");
		st.pop();
		st.push(562);
		st.peek();
	}
}
