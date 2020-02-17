package stepbystep;

import java.util.Scanner;

public class Break_even_point_1712 {		// Break-even point : ���ͺб���

	public static void main(String[] args) {
/*
	A : ���� ��� : �Ӵ�� + ��꼼 + ����� + �޿�
	B : ���� ��� : ���� + �ΰǺ�
	C : ��Ʈ�� 1���� �ǸŰ���
	n : ��Ʈ�� �Ǹ� ���
	ex)	1���� ��Ʈ���� �����ϴ� �� ��� ��� -> A+B, 10���� ��Ʈ���� �����ϴ� �� ��� ��� -> A+10B
	���ͺб���(Break-even point) : A + n*B < n*C �� �Ǵ� ����
								0 <	A < n*(C-B)
							��                 				    ��
	0 <	A/n < C-B �̹Ƿ�  C>B �̾�� �Ѵ�.					0 < A/(C-B) < n
*/
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int result;
		
		if (C <= B)
			System.out.println(-1);
		else
			System.out.println(A / (C-B) + 1);
			//	17��  0 < A/(C-B) < n ���� ���ͺб����� �Ǵ� ��Ʈ�� �Ǹ� ��� n�� 
			//			A/(C-B) ���� ū ���� ���� ���� �� �̹Ƿ� 1�� �����ִ°��̴�
			

	}

}
