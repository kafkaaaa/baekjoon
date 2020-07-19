package stepbystep;

import java.util.Scanner;

// n : 90이하 자연수 -> long형 사용
public class fibonacci2_2748 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextInt();
		
//		System.out.println(recur_fibo(n));
		System.out.println(iter_fibo(n));		
	}
	
//	static long recur_fibo(long n) {	// 재귀적 피보나치 함수
//		if (n <= 1)
//			return n;
//		else
//			return recur_fibo(n-1) + recur_fibo(n-2);
//	}
	
	static long iter_fibo(long n) {	// 반복적 피보나치 함수
		long preNum2 = 0;	// 2개 앞의 피보나치 값
		long preNum1 = 1;	// 1개 앞의 피보나치 값
		long result = 0;
		
		if (n <= 1)		// fibo(0) = 0,	fibo(1) = 1
			return n;
		else {
			for (long i=2; i<=n; i++) {
				result = preNum2 + preNum1;
				preNum2 = preNum1;
				preNum1 = result;
			}
			return result;
		}
	}
				
}
