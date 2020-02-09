package stepbystep;

import java.util.Scanner;

public class Avg_4344 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int C = scan.nextInt();						// 테스트 케이스 수
		int[] score = new int[1000];
		
		for (int i=0; i<C; i++)
		{
			int N = scan.nextInt();					// 학생수 N 입력받음
			double total = 0;
			int count = 0;
			
			for (int j=0; j<N; j++)
			{
				score[j] = scan.nextInt();
				total += score[j];
			}
			double avg = total / N;
			
			for (int k=0; k<N; k++) {				// 평균 이상 학생 수 count
				if (score[k] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f", 100.0 * count / N);		// 소수점아래 셋째 자리 까지 출력
			System.out.println("%");
		}
	}
}