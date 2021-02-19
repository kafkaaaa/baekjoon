package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

// Queue - Deque을 활용하여 시간복잡도를 향상시키는 문제
// https://www.acmicpc.net/problem/5430

public class Q_5430 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		while (testCase --> 0) {
			
			// 수행할 함수 p
			String p = br.readLine();
			
			// 배열에 들어있는 수의 개수
			int nOfNums = Integer.parseInt(br.readLine());		// 사실상 사용되지 않음
			
			// 배열에 들어있는 수 [X1,X2,...,Xn]
			String input = br.readLine();
			// 입력에서 앞뒤 [] 괄호를 제거하고  ,로 구분
			String[] x = input.substring(1, input.length()-1).split(",");
			
			// 덱에 입력
			Deque<Integer> deq = new LinkedList<>();
			for (String s : x) {
				if (!s.equals("")) {	// 만약 입력이 [] 이면 형변환 오류가 발생하므로 이 if문이 필요
					deq.add(Integer.valueOf(s));
				}
			}
			
			System.out.println( AC(deq, p) );
		}
	}
	
	static String AC(Deque<Integer> deq, String p) {
		/* 주의할점 
		 * 입력 R을 받아 실제로 큐를 뒤집으면 시간 초과
		 * 플래그 변수를 사용 해야함 */
		boolean isReverse = false;
		
		for (char cmd : p.toCharArray()) {
			
			if (cmd == 'R') {
				isReverse = !isReverse;
			}
			else {
				if (deq.isEmpty())
					return "error";
				
				if (isReverse) deq.removeLast();	// R이면 뒤에서 지운다
				else deq.removeFirst();				// D이면 앞에서 지운다
			}
		}
		
		// Output
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		while (!deq.isEmpty()) {
			sb.append(isReverse ? deq.removeLast() : deq.removeFirst());
			
			if (!deq.isEmpty())
				sb.append(',');
		}
		
		sb.append("]");
		return sb.toString();
	}
}
