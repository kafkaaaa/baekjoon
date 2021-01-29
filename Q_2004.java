package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 정수론 및 조합론 - 조합 0의 개수
// https://www.acmicpc.net/problem/2004

public class Q_2004 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		
		// 이항계수 (n, m) = nCm = n! / (n-m)! / m!
		// 0의 개수 -> 2와 5의 승수 중 작은값
		long expon5 = getExpon5(n) - getExpon5(n-m) - getExpon5(m);
		long expon2 = getExpon2(n) - getExpon2(n-m) - getExpon2(m);
		
		System.out.println(Math.min(expon5, expon2));
	}
	
	// x! 에서 5가 곱해진 개수를 반환하는 함수
	static long getExpon5(long x) {
		long result = 0;
		
		while (x >= 5) {
			result += x/5;
			x /= 5;
		}
		return result;
	}
	
	// x! 에서 2가 곱해진 개수를 반환하는 함수
	static long getExpon2(long x) {
		long result = 0;
		
		while (x >= 2) {
			result += x/2;
			x /= 2;
		}
		return result;
	}
		
}
