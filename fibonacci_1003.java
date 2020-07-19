package stepbystep;

import java.util.Scanner;

// �ڽð����� ���� : 0.25��

public class fibonacci_1003 {
	static int count[][];	// ȣ��Ƚ���� ������ �迭. 0 <= n <= 41
		
	static void count0Fibo(int n) {		// fibo(0) ȣ��Ƚ�� ���
		if (n >= 2)
			count[n][0] = count[n-2][0] + count[n-1][0];
	}
	
	static void count1Fibo(int n) {		// fibo(1) ȣ��Ƚ�� ���
		if (n >= 2)
		
		count = new int[41][2];		// ȣ��Ƚ���� ������ �迭. 0 <= n <= 41
		count[0][0] = 1;	// 0�� 1�϶��� ���� �̸� �Է�.
		count[1][0] = 0;

		count[0][1] = 0;
		count[1][1] = 1;
		
		for (int i=2; i<=40; i++) {		// fibo(0), fibo(1)�� ȣ��Ƚ�� ���. 40����.
			count0Fibo(i);
			count1Fibo(i);
		}
		
		for (int i=0; i<T; i++) {		// ���
			int n = scan.nextInt();
			System.out.println(count[n][0] + " " + count[n][1]);
		}
		
	}

}
