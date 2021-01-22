package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 정수론 및 조합론 - 최소공배수(LCM) 구하기
// https://www.acmicpc.net/problem/1934

public class LCM_1934 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());	// 테스트 케이스의 수
		int num1[] = new int[T];
		int num2[] = new int[T];
		
		for (int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			num1[i] = Integer.parseInt(st.nextToken());
			num2[i] = Integer.parseInt(st.nextToken());
			
		}
		// 최소공배수(LCM) = 두 수의 곱 / GCD
		for (int i=0; i<T; i++) {
			System.out.println(num1[i] * num2[i] / GCD_Euclid(num1[i], num2[i]));
		}
			
	}
		
	static int GCD_Euclid(int a, int b) {		
		// 최대공약수 구하기 - 유클리드 호제법
		if (a % b == 0) return b;
		else return GCD_Euclid(b, a % b);
	}

}
