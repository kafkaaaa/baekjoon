
// PriorityQueue : Max Heap
// Heap : Binary Tree 구조.  Max Heap -> Root=max  /  Min Heap : Root=min
// https://www.acmicpc.net/problem/11279
	
package stepbystep;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxHeap_11279 {

	public static void main(String[] args) {
		
//		// 우선순위가 낮은 숫자 순
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		// 우선순위가 높은 숫자 순
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] input = new int[N];
		for (int i=0; i<N; i++) {
			input[i] = scan.nextInt();
		}
		scan.close();
		
		for (int i=0; i<N; i++) {
			if (input[i] == 0) {		// 0 -> 배열에서 가장 큰 값 출력 및 제거 (우선순위 큐에서 poll)
				if (pq.isEmpty()) {		// 배열이 비어 있는 데 출력하라고 하면 -> 0 출력
					System.out.println(0);
					continue;
				}
				System.out.println(pq.poll());
			}
			else {		// 자연수 -> 배열에 값 추가 (우선순위 큐에서 add)
				pq.add(input[i]);
			}
		}
			
	}

}
