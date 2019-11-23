package com.paranthesisvalidation;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class ParanthesisValidationMain {

	static HashMap<Character, Character> hm = new HashMap<Character, Character>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Create a hashmap consisting of key values of opening and closing bracket
		 * combinations 2. create a stack 3. If an opening bracket appears just simply
		 * push it 4. If a closing bracket appears and the previously pushed bracket is
		 * counterpart of it then just pop it else return it as Invalid expression.
		 */

		hm.put(')', '(');
		hm.put('}', '{');
		hm.put(']', '[');

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string ::: ");
		String input = scanner.next();
		System.out.println("You have entered : " + input);

		System.out.println("The entered expression is a  ; " + isValidExpression(input));
		scanner.close();

		int i = 0;

	}

	private static boolean isValidExpression(String input) {
		// Create a stack
		Stack<Character> stack = new Stack<Character>();

		
		System.out.println("stirng syze : " + input.length());
		for (int i = 0; i < input.length(); i++) {
			Character c = input.charAt(i);

			// check if its a closing bracket

			if (hm.containsKey(c)) {
				Character top = stack.empty() ? '#' : stack.pop();

				if (top != hm.get(c))
					return false;
			} else {
				stack.push(c); // push the item
			}

		}
		return stack.empty();
	}

}
