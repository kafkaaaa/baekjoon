package stepbystep;

import java.util.Scanner;

public class Hive_2292 {
	
	/*
	 
	 1 		: 	1
	 2~7 	:	2		6��
	 8~19 	: 	3		12��
	 20~37 	: 	4		18��
	 38~61 	: 	5		24��
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
		int num = 2;		// 2, 8, 20, 38 ... 2��° ���� 6, 12, 18 ... ���� �ϹǷ� 2���� ����
		int cnt = 1;		// ���İ��� ���� ����
		
		if (n == 1) return 1;
		
		while (num <= n)
			num += 6 * (cnt++);
		
		return cnt;

	}
}
