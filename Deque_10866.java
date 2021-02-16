package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// Queue - Deque (Double-Ended Queue)
// https://www.acmicpc.net/problem/10866

public class Deque_10866 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deq = new LinkedList<>();
		
		while (N --> 0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			
			if (input.equals("push_front")) {
				int temp = Integer.parseInt(st.nextToken());
				deq.addFirst(temp);
			}
			
			else if (input.equals("push_back")) {
				int temp = Integer.parseInt(st.nextToken());
				deq.addLast(temp);
			}
			
			else if (input.equals("pop_front")) {
				if (deq.isEmpty()) System.out.println(-1);
				else System.out.println(deq.removeFirst());
			}
			
			else if (input.equals("pop_back")) {
				if (deq.isEmpty()) System.out.println(-1);
				else System.out.println(deq.removeLast());
			}
			
			else if (input.equals("size")) {
				System.out.println(deq.size());
			}
			
			else if (input.equals("empty")) {
				System.out.println(deq.isEmpty()? 1 : 0);
			}
			
			else if (input.equals("front")) {
				if (deq.isEmpty()) System.out.println(-1);
				else System.out.println(deq.getFirst());
			}
			
			else if (input.equals("back")) {
				if (deq.isEmpty()) System.out.println(-1);
				else System.out.println(deq.getLast());
			}
			
		}
		

	}

}
