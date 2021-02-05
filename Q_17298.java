package stepbystep;

// Stack
// https://www.acmicpc.net/problem/17298
// Ref* : https://st-lab.tistory.com/196

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q_17298 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N];
		
		Stack<Integer> stack = new Stack<Integer>();
		
		// Input
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		// Solve
		for (int i=0; i<N; i++) {
			/* 
			 * 스택이 비어있지 않으면서
			 * 현재 원소가 스택의 맨 위 원소가 가리키는 원소보다 큰 경우
			 * 해당 조건을 만족할때 까지 스택의 원소를 pop 하면서
			 * 해당 인덱스의 값을 현재 원소로 바꿔준다.
			 */
			while (!stack.isEmpty() && num[stack.peek()] < num[i]) {
				num[stack.pop()] = num[i];
			}
			stack.push(i);
		}
		
		/*
		 * 스택의 모든 원소를 pop하면서 해당 인덱스의 value를
		 * -1로 초기화
		 */
		while (!stack.isEmpty()) {
			num[stack.pop()] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<N; i++) {
			sb.append(num[i]).append(" ");
		}
		System.out.println(sb);
		
//		아래 코드는 시간초과
//		for (int i=0; i<N; i++) {
//			System.out.print(num[i] + " ");
//		}
		
	}
	
}
