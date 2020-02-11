package stepbystep;

import java.util.Scanner;

public class Q_1065 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int result = 0;
		
		if (N < 100) System.out.println(N); 	// 1~99 (�� �ڸ���)�� ��� �Ѽ�
		else {
			result = 99;
			for (int i=100; i<=N; ++i) {
				result += IsHanNumber(i);
			}
			System.out.println(result);
		}
	}
		

	private static int IsHanNumber(int x)	// x�� 100~1000 ������ �ڿ���
	{
		int a = x / 100;					// ù ��° �ڸ� ��
		int b = x / 10 % 10;				// �� ��° �ڸ� ��
		int c = x % 10;						// �� ��° �ڸ� ��
		
		if (a + c == 2 * b) return 1;
		// ��������  n n+d n+2d -> n + (n+2d) = 2 * (n+d)
		return 0;
	}
		
}