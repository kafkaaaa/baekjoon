package stepbystep;

import java.util.Scanner;

// n : 90���� �ڿ��� -> long�� ���
public class fibonacci2_2748 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextInt();
		
//		System.out.println(recur_fibo(n));
		System.out.println(iter_fibo(n));		
	}
	
//	static long recur_fibo(long n) {	// ����� �Ǻ���ġ �Լ�
//		if (n <= 1)
//			return n;
//		else
//			return recur_fibo(n-1) + recur_fibo(n-2);
//	}
	
	static long iter_fibo(long n) {	// �ݺ��� �Ǻ���ġ �Լ�
		long preNum2 = 0;	// 2�� ���� �Ǻ���ġ ��
		long preNum1 = 1;	// 1�� ���� �Ǻ���ġ ��
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
