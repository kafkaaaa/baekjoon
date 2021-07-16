
// https://www.acmicpc.net/problem/11286
// 우선순위 큐 -> Comparator의 compare 메소드 overriding
package stepbystep;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class AbsoluteValueHeap_11286 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) ->
			// 두 수의 절대값이 같으면 오름차순 정렬,  같지 않으면-> 절대값으로 오름차순 정렬
			Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1, o2) : 
				Integer.compare(Math.abs(o1), Math.abs(o2))
				);
			
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] input = new int[N];
		for (int i=0; i<N; i++) {
			input[i] = scan.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			if (input[i] == 0) {
				if (pq.isEmpty()) {
					System.out.println(0);
					// continue;
				}
				else {
					// 절댓값이 가장 작은 값을 출력하고 그 값을 배열에서 제거
					System.out.println(pq.poll());
				}
			}
			else {
				pq.add(input[i]);
			}
		}
	}

}
