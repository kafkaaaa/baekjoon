package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// Queue
// https://www.acmicpc.net/problem/1966

public class Q_1966 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		while (testCase --> 0) {
			
			// Input
			StringTokenizer st = new StringTokenizer(br.readLine());
			int nOfDoc = Integer.parseInt(st.nextToken());	// 문서의 개수
			int pos = Integer.parseInt(st.nextToken());		// 현재 큐에 놓여있는 위치
			int nOfPrint = 0;								// 출력한 횟수
			
			// 큐에 우선순위 삽입
			st = new StringTokenizer(br.readLine());
			int[] priority = new int[nOfDoc];
			LinkedList<int[]> q = new LinkedList<>();
			
			for (int i=0; i<nOfDoc; i++) {
				priority[i] = Integer.parseInt(st.nextToken());
				q.offer(new int[] {i, priority[i]} );		// {위치, 우선순위}
			}
			
			// 출력을 위한 반복
			while (!q.isEmpty()) {			// 큐가 공백이 될때까지
				
				int[] front = q.poll();		// front 값 추출
				boolean isFirst = true;		// front 값의 우선순위가 제일 높은지 확인하는 플래그
				
				// 큐의 나머지 원소들과 우선순위 비교
				for (int i=0; i<q.size(); i++) {
					
					// front보다 i번째 원소의 우선순위가 높은 경우
					if (front[1] < q.get(i)[1]) {
						
						isFirst = false;
						q.offer(front);
						
						for (int j=0; j<i; j++) {
							q.offer(q.poll());
						}
						break;
					}
				}
				
				if (isFirst == false) continue;
				
				nOfPrint++;
				
				if (front[0] == pos) {		// 출력하려고 했던 문서이면
					break;
				}
			}
			
			System.out.println(nOfPrint);
		}
	
	}

}
