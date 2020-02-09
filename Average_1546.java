package stepbystep;

import java.util.Scanner;

public class Average_1546 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] score = new int[N];
		int sum = 0;
		int Max = 0;
		
		for (int i=0; i<N; i++) {			// �ִ밪 ���ϱ�
			score[i] = scan.nextInt();
			sum += score[i];				// ��հ�꿡 �� ���� sum 
			if (score[i] > Max) {
				Max = score[i];
			}
		}
		
		double avg = (double)sum / (double)Max * 100 / (double)N;
		
		System.out.printf("%.2f", avg);		// �Ҽ� ��°�ڸ� ���� ����ϱ����� 
											// printf ��"%.2f" ���
	}

}