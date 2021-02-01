package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Stack
// https://www.acmicpc.net/problem/10828

public class Stack_10828 {
	
	static int[] stack;
	static int idx = -1;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		stack = new int[N];
		
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			switch (st.nextToken()) {
			
				case "push" :
					push(Integer.parseInt(st.nextToken()));
					break;
					
				case "pop" :
					pop();
					break;
					
				case "size" :
					size();
					break;
					
				case "empty" :
					empty();
					break;
					
				case "top" :
					top();
					break;
			}
		}

	}
	
	static void push(int x) {
		stack[++idx] = x;
	}
	
	static void pop() {
		if (idx == -1) System.out.println(-1);
		else System.out.println(stack[idx--]);
	}
	
	static void size() {
		System.out.println(idx+1);
	}
	
	static void empty() {
		if (idx == -1) System.out.println(1);
		else System.out.println(0);
	}
	
	static void top() {
		if (idx == -1) System.out.println(-1);
		else System.out.println(stack[idx]);
	}
}
