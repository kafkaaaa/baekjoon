package stepbystep;

import java.util.Scanner;

public class Q_2775 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();			// T: Test case
		
		for (int i=0; i<T; i++) {
			int k = scan.nextInt();		// k ��	(1 <= k <= 14)
			int n = scan.nextInt();		// n ȣ	(1 <= n <= 14)
			System.out.println(Resident(k, n));
		}
	}

	
	// k�� nȣ = (k-1)�� nȣ + k�� (n-1)ȣ //
	
	public static int Resident(int k, int n) {		// k�� nȣ�� ���ֹ� ���� ��ȯ�ϴ� �Լ�
		
		if (k == 0)			// 0�� : 1, 2, 3, ...
			return n;
		else if (n == 0)
			return 0;
		else {
			return Resident(k, n-1) + Resident(k-1, n);
		}
	}
}