package stepbystep;

import java.util.Scanner;

public class Find_Fraction_1193 {
	
	// https://deveric.tistory.com/39 ���� // 
	
	/* 
		1/1	1/2	1/3	1/4	1/5	��      
		2/1	2/2	2/3	2/4	��	��      
		3/1	3/2	3/3	��	��	��
		4/1	4/2	��	��	��	�� 
		5/1	��	��	��
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		
		int n = 1;		// n�� m �� �и� ����
		int m = 1;
		boolean flag = false;
		
		for (int i=0; i<X-1; i++) {		// �־��� �� X�� ��ŭ �ݺ�
			if (flag) {
				n++;
				m--;
				if (m == 0) {
					flag = false;
					m++;
				}
			}
			else {
				n--;
				m++;
				if (n == 0) {
					flag = true;
					n++;
				}
			}
		}
		System.out.println(n + "/" + m);
	}
}
		