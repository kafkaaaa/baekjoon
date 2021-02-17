package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.StringTokenizer;

// Queue - 회전하는 큐
// https://www.acmicpc.net/problem/1021

public class RotateQueue_1021 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int target, index, count = 0;
		Deque<Integer> deq = new ArrayDeque<Integer>();
		for (int i=0; i<N; i++) {
			deq.add(i+1);
		}
		st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<M; i++) {
			target = Integer.parseInt(st.nextToken());
			index = 1;
			
			Iterator<Integer> it = deq.iterator();
			while (it.hasNext()) {
				if (it.next() == target) break;
				index++;
			}
			
			int front = index - 1;
			int back = deq.size() + 1 - index;
			
			if (front < back) {
				for (int j=0; j<front; j++) {
					deq.addLast(deq.pollFirst());
					count++;
				}
				deq.pollFirst();
			}
			else {
				for (int j=0; j<back; j++) {
					deq.addFirst(deq.pollLast());
					count++;
				}
				deq.pollFirst();
			}
		}
		
		System.out.println(count);
	}
	
}
