package stepbystep;

import java.util.Scanner;

public class Avg_4344 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int C = scan.nextInt();						// �׽�Ʈ ���̽� ��
		int[] score = new int[1000];
		
		for (int i=0; i<C; i++)
		{
			int N = scan.nextInt();					// �л��� N �Է¹���
			double total = 0;
			int count = 0;
			
			for (int j=0; j<N; j++)
			{
				score[j] = scan.nextInt();
				total += score[j];
			}
			double avg = total / N;
			
			for (int k=0; k<N; k++) {				// ��� �̻� �л� �� count
				if (score[k] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f", 100.0 * count / N);		// �Ҽ����Ʒ� ��° �ڸ� ���� ���
			System.out.println("%");
		}
	}
}