package stepbystep;

import java.util.Scanner;

public class star21_10996 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for (int i=1; i<=2*n; i++) {
			
			if (i % 2 == 1) {	// Ȧ�� ��
				for (int j=1; j<=n; j++) {
					if (j % 2 == 1) {	// ��, ����, ��, ���� ������ ���
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			else {	// ¦�� ��
				for (int j=1; j<=n; j++) {
					if (j % 2 == 1) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
			}
			System.out.print("\n");	// �ٹٲ�
		}		
	}
}
