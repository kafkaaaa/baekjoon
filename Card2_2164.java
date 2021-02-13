package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// Queue
// https://www.acmicpc.net/problem/2164

public class Card2_2164 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		
		// 큐에 차례대로 입력
		for (int i=1; i<=N; i++) {	// offer 메소드는 큐가 가득차서 더 이상 추가할 수 없는 경우 false를 반환하고
			queue.offer(i);			// 요소가 추가되면 true를 반환하며 특정 예외를 throw 하지 않는다
		}							// 반면 add 메소드는 illegalStateException을 발생시킨다
		
		// 카드 작업 수행
		while(true) {
		
			if (queue.size() == 1) {
				System.out.println(queue.poll());	// 마지막으로 남은 카드 한장을 출력한다.
				break;
			}
			
			queue.poll();		// 제일 위에 있는 카드를 버린다. (remove도 동일한 기능이지만 예외발생 가능성 있음)
			queue.offer(queue.poll());	// 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.
		}

	}

}
