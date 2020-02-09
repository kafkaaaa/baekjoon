package stepbystep;

import java.util.Scanner;

public class Num_2577 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int count = 0;
		
		int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for (int i = 0; i < num.length; i++) {
			int x = A * B * C;
			count = 0;							// count�� �ٽ� 0���� �ʱ�ȭ
			
			while (x != 0) {					// A*B*C�� 0�� �Ǳ������� �ݺ�
				if(x % 10 == num[i]) { 			// num[0] ~ num[9] ��
					count++;
				}
				x = x/10;						// 10���� ������ ���ڸ��� ��������
			}
			System.out.println(count); 			// ������ ���� (count) �ݺ� ��� (0~9)
		}
		
	}
	
}