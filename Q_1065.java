package stepbystep;

import java.util.Scanner;

public class Q_1065 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int result = 0;
		
		if (N < 100) System.out.println(N); 	// 1~99 (두 자리수)는 모두 한수
		else {
			result = 99;
			for (int i=100; i<=N; ++i) {
				result += IsHanNumber(i);
			}
			System.out.println(result);
		}
	}
		

	private static int IsHanNumber(int x)	// x는 100~1000 사이의 자연수
	{
		int a = x / 100;					// 첫 번째 자리 수
		int b = x / 10 % 10;				// 두 번째 자리 수
		int c = x % 10;						// 세 번째 자리 수
		
		if (a + c == 2 * b) return 1;
		// 등차수열  n n+d n+2d -> n + (n+2d) = 2 * (n+d)
		return 0;
	}
		
}