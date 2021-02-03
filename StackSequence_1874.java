package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// Stack - 스택 수열
// https://www.acmicpc.net/problem/1874

public class StackSequence_1874 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<>();
		int count = 0;
		
		// Solve
		while (testCase --> 0) {
			
			int input = Integer.parseInt(br.readLine());
			
			if (input > count) {
				
				for (int i = count + 1; i <= input; i++) {
					stack.push(i);
					sb.append("+").append("\n");
				}
				count = input;
			}
			
			else if (stack.peek() != input) {
				System.out.println("NO");
				System.exit(0);
			}
			
			stack.pop();
			sb.append("-").append("\n");
		}
		
		System.out.println(sb);
	}

}
