package stepbystep;

import java.util.Scanner;

// 정수론 및 조합론 - 이항 계수 1
// https://www.acmicpc.net/problem/11050

public class BiCoef1_11050 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		// 이항 계수  = N! / ((N-K)! * K!)
		
		int binomialCoef = factorial(N) / factorial(N-K) / factorial(K);
		System.out.println(binomialCoef);
	}
	
	static int factorial(int x) {
		int result = 1;
		
		if (x == 0) return 1;
		else {
			for (int i=1; i<=x; i++) {
				result *= i;
			}
			return result;
		}
	}
				
}
