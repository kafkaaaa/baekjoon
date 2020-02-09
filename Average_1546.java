package stepbystep;

import java.util.Scanner;

public class Average_1546 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] score = new int[N];
		int sum = 0;
		int Max = 0;
		
		for (int i=0; i<N; i++) {			// 최대값 구하기
			score[i] = scan.nextInt();
			sum += score[i];				// 평균계산에 쓸 총합 sum 
			if (score[i] > Max) {
				Max = score[i];
			}
		}
		
		double avg = (double)sum / (double)Max * 100 / (double)N;
		
		System.out.printf("%.2f", avg);		// 소수 둘째자리 까지 출력하기위해 
											// printf 와"%.2f" 사용
	}

}