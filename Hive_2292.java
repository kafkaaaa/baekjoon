package stepbystep;

import java.util.Scanner;

public class Hive_2292 {
	
	/*
	 
	 1 		: 	1
	 2~7 	:	2		6개
	 8~19 	: 	3		12개
	 20~37 	: 	4		18개
	 38~61 	: 	5		24개
	 		.
	 		.
	 		.
	 a(n) = a(n-1) + 6(n-1)
	 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		System.out.println(function(N));

	}
	public static int function(int n) {
		int num = 2;		// 2, 8, 20, 38 ... 2번째 부터 6, 12, 18 ... 증가 하므로 2부터 시작
		int cnt = 1;		// 거쳐가는 방의 개수
		
		if (n == 1) return 1;
		
		while (num <= n)
			num += 6 * (cnt++);
		
		return cnt;

	}
}
