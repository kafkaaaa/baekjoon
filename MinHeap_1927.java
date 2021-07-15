
// PriorityQueue : Min Heap
// Heap : Binary Tree 구조.  Max Heap -> Root=max  /  Min Heap : Root=min
// https://www.acmicpc.net/problem/1927
package stepbystep;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MinHeap_1927 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] input = new int[N];
		for (int i=0; i<N; i++) {
			input[i] = scan.nextInt();
		}
		scan.close();
		
		for (int i=0; i<N; i++) {
			if (input[i] == 0) {
				if (pq.isEmpty()) {
					System.out.println(0);
					continue;
				}
				else {
					System.out.println(pq.poll());
				}
			}
			else {
				pq.add(input[i]);
			}
		}
		
	}

}
