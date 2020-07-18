package test0;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int kg5 = N / 5;
		int kg3 = 0;
		
		switch(N % 5) {
	
		case 1 :	// 1kg ������ �� -> 5kg�ϳ����� ���� 1kg���ؼ� �� 6kg�� 3kg ������ ��´�.
			kg5--;
			kg3 = 2;
			break;
			
		case 2 :	// 2kg ������ ��
			kg5 -= 2;
			kg3 = 4;
			break;
			
		case 3 :	// 3kg ������ ��
			kg3 = 1;
			break;
		
		case 4 :	// 4kg ������ ��
			kg5--;
			kg3 = 3;
			break;
		}
		
		if (kg5 < 0) {
			System.out.println(-1);
			return;
		}
		
		System.out.println(kg3 + kg5);

	}

}
