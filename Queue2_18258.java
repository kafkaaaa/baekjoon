package stepbystep;

import java.util.*;
import java.io.*;

// Queue - LinkedList 및 배열로  구현
// https://www.acmicpc.net/problem/18258

/* 
 * 배열로 구현 
 * 
 * public class Queue2_18258 {
	
	static int[] queue = new int[2000000];
	static int front = 0;	// 큐의 맨 앞 원소의 인덱스를 가리킨다
	static int rear = 0;	// 큐의 맨 뒤 원소의 인덱스를 가리킨다
	static int size = 0;	// 큐의 원소의 개수를 가리킨다

	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int testCase = Integer.parseInt(br.readLine());
		
		while (testCase --> 0) {
			
			st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			
			switch (input) {
			
			case "push" : push(Integer.parseInt(st.nextToken())); break;
			case "pop" : pop(); break;
			case "size" : size(); break;
			case "empty" : empty(); break;
			case "front" : front(); break;
			case "back" : back(); break;
			
			}
		}
		System.out.println(sb);
		
	}
	
	static void push(int n) {
		queue[rear++] = n;
		size++;
	}
	
	static void pop() {
		if (size == 0) sb.append(-1).append("\n");
		else {
			sb.append(queue[front++]).append("\n");
			size--;
		}
	}
	
	static void size() {
		sb.append(size).append("\n");
	}
	
	static void empty() {
		if (size == 0) sb.append(1).append("\n");
		else sb.append(0).append("\n");
	}
	
	static void front() {
		if (size == 0) sb.append(-1).append("\n");
		else sb.append(queue[front]).append("\n");
	}
	
	static void back() {
		if (size == 0) sb.append(-1).append("\n");
		else sb.append(queue[rear-1]).append("\n");
	}

}
 */


/* LinkedList로 구현 */
public class Queue2_18258 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		LinkedList<Integer> queue = new LinkedList<>();
		
		int testCase = Integer.parseInt(br.readLine());
		while (testCase --> 0) {
			
			st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			
			switch(input) {
			
			case "push" :
				// offer : 큐의 맨 끝에 삽입
				queue.offer(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop" :
				// poll : 큐의 가장 앞 원소 삭제  (empty 이면 -> null 반환)
				Integer element = queue.poll();
				if (element == null) sb.append(-1).append("\n");
				else sb.append(element).append("\n");
				break;
				
			case "size" :
				sb.append(queue.size()).append("\n");
				break;
				
			case "empty" :
				if (queue.isEmpty()) sb.append(1).append("\n");
				else sb.append(0).append("\n");
				break;
				
			case "front" :
				Integer front = queue.peek();
				if (front == null) sb.append(-1).append("\n");
				else sb.append(front).append("\n");
				break;
				
			case "back" :
				Integer rear = queue.peekLast();
				if (rear == null) sb.append(-1).append("\n");
				else sb.append(rear).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
	
}
	