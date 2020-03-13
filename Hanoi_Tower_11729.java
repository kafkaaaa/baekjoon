package stepbystep;

import java.util.Scanner;

public class Hanoi_Tower_11729 {
	
	public static int N = 0;			//  ������ ���� N
	public static int count = 0;		// 	�ű� Ƚ�� count
	public static StringBuilder sb = new StringBuilder();
	
	
	public static void Hanoi(int n, int from, int to, int X) {
		if (n == 0)
			return;
		else {
			count++;
			Hanoi(n-1, from, X, to);			// n-1���� ������ from���� X�� �ű��
			
			sb.append(from + " " + to + "\n");		// �̵� ��� ���
			// append : v.�����̴�, ÷���ϴ�
			
			Hanoi(n-1, X, to, from);			// n-1���� ������ X���� to�� �ű��
		}
	}

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		Hanoi(N, 1, 3, 2);
		
		System.out.println(count);
		System.out.println(sb);

	}

}
