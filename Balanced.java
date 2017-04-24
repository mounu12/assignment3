package assignment3;

import java.util.Stack;

public class Balanced {
	public static boolean balancedParanthesis(String exp) {

		Stack<Integer> stack = new Stack<Integer>();

		int length = exp.length();
		for (int i = 0; i < length; i++) {
			char ch = exp.charAt(i);
			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(i);
			} else if (ch == ')' || ch == ']' || ch == '}') {
				if (stack.isEmpty()) {
					return false;
				} else if (stack.pop() != ch) {
					return false;
				}
			}
		}

		return true;

	}

	/*public static void main(String[] args) {
		Balanced balanced = new Balanced();
		String str = "";
		str = str + balanced.balancedParanthesis("{[(a+(a*b))]}");
		System.out.println(str);

	}*/

}
