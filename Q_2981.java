package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 정수론 및 조합론
// https://www.acmicpc.net/problem/2981

public class Q_2981 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		
		/* Solve
		 * 임의의 두 수
		 * A1 = a1 * M + r1
		 * A2 = a2 * M + r2
		 * A1 - A2 = M(a1 - a2)		// 나머지가 같으므로 r1 - r2 = 0
		 * 위 식에서 M은 A1-A2의 약수가 됨을 알 수 있다.
		 * 따라서, 주어진 숫자들의 차들의 최대공약수를 구해서 그 약수들이 문제의 답이 된다.
		 */
		
		for (int i=0; i<n; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(num);
		
		int tmp = num[1] - num[0];
		
		for (int i=2; i<n; i++) {
			tmp = GCD(tmp, num[i] - num[i-1]);
		}
		
		StringBuffer sb = new StringBuffer();
		// tmp(최대공약수)의 약수들 구하기
		for (int i=2; i<=tmp; i++) {
			if (tmp % i == 0) {
				sb.append(i + " ");
			}
		}
		
		// Output
		System.out.println(sb.toString());
	}
	
	static int GCD(int a, int b) {		// 최대공약수 구하는 함수
		if (a % b == 0) return b;
		else return GCD(b, a % b);
	}

}
