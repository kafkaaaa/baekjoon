package stepbystep;

// 정수론 및 조합론 - 팩토리얼 0의 개수
// https://www.acmicpc.net/problem/1676

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1676 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		// Solve
		// 뒤에 0이 붙으려면 2x5가 있어야 한다.
		// 2와 5가 세트로 곱해진 개수가 팩토리얼 0의 개수가 된다.
		// 5의 개수가 2의 개수보다 항상 적으므로 5의 개수만 세도 된다.
		int cnt = 0;
		
		while (n >= 5) {
			cnt += n/5;
			n /= 5;
		}
		System.out.println(cnt);
	}

}
