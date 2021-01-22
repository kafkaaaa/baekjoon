package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 정수론 및 조합론 - 최대공약수(GCD) & 최소공배수(LCM) 구하기
// https://www.acmicpc.net/problem/2609

public class GCD_LCM_2609 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int gcd = GCD_Euclid(a, b);
		int lcm = a * b / gcd;		// 최소공배수 = 두 수의 곱 / 최대공약수
		
		System.out.println(gcd);
		System.out.println(lcm);
	}
	
	static int GCD_Euclid(int a, int b) {		
		// 최대공약수 구하기 - 유클리드 호제법
		if (a % b == 0) return b;
		else return GCD_Euclid(b, a % b);
	}

}
