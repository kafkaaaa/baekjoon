package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// Stack - 짝을 이루는 문자열
// https://www.acmicpc.net/problem/4949

public class BalancedWorld_4949 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		
		while (true) {
			
			input = br.readLine();
			
			if (input.equals(".")) break;

			if (isBalanced(input)) System.out.println("yes");
			else System.out.println("no");
		}
		
	}
	
	static Boolean isBalanced(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for (int i=0; i<s.length(); i++) {	// 입력받은 문자열 검사
			
			char c = s.charAt(i);
			
			if (c == '(' || c == '[') {		// 여는 괄호를 만나면
				stack.push(c);				// 스택에 push
			}
			
			else if (c == ')') {			// 닫는 소괄호를 만나면
				
				if (stack.isEmpty() || stack.peek() != '(') {
					return false;
				}
				else stack.pop();
			}
			
			else if (c == ']') {			// 닫는 대괄호를 만나면
				
				if (stack.isEmpty() || stack.peek() != '[') {
					return false;
				}
				else stack.pop();
			}
			
		}
			
		if (stack.isEmpty()) return true;
		else return false;
	}
		
}
