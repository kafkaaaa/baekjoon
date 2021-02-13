package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// Queue - Josephus Permutation (요세푸스 순열)
// https://www.acmicpc.net/problem/11866

public class Josephus_11866 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());		// 1 ≤ K ≤ N ≤ 1,000
		int K = Integer.parseInt(st.nextToken());		// (N, K) - 요세푸스 순열
		
		Queue<Integer> queue = new LinkedList<>();
		
		// 큐에 Input		
		for (int i=1; i<=N; i++) queue.offer(i);
		
		// K번째 사람 제거 반복
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		while (queue.size() > 1) {
			
			for (int i=0; i<K-1; i++) {			// K번째 사람 바로 앞까지
				int element = queue.poll();		// 큐의 가장 앞 원소를 빼와서
				queue.offer(element);			// 다시 큐의 맨 뒤에 삽입
			}
			
			sb.append(queue.poll()).append(", ");		// K번째 원소를 삭제하고 출력
		}
		
		// 마지막 남은 원소 출력
		sb.append(queue.poll()).append(">");
		System.out.println(sb);
	}

}
