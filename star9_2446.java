package stepbystep;

import java.util.Scanner;

public class star9_2446 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		for (int i=0; i<2*n-1; i++) {	// 2n-1 �� �ݺ� ���
			if (i<n) {
				for (int j=0; j<i; j++)		// ���� ���
					System.out.print(" ");
				
				for (int j=0; j<2*(n-i)-1; j++)
					System.out.print("*");	// �� ���
				
				System.out.println();	// �ٹٲ�
			}
			else {
				for (int j=0; j<2*(n-1)-i; j++)	// ���� ���
					System.out.print(" ");
				
				for (int j=0; j<(i+1-n)*2+1; j++)	// �� ���
					System.out.print("*");
				
				System.out.println();	// �ٹٲ�
			}
		}
	}
}
