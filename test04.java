package test0;

import java.util.Scanner;

public class test04 {	// ※ brute-force

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();	// 카드 개수 N
		int M = scan.nextInt();	// 카드 3장의 합 M
		int[] num = new int[N];	// 카드의 숫자를 저장할 배열
		
		for (int i=0; i<N; i++) {
			num[i] = scan.nextInt();
		}
		
		int sum = 0;	// 카드 3장의 합을 저장
		int temp = 0;	// M값과 가장 가까운 sum을 저장
		
		for (int i=0; i<N-2; i++) {
			for (int j=i+1; j<N-1; j++) {
				for (int k=j+1; k<N; k++) {
					sum = num[i]+num[j]+num[k];
					if (sum <= M && sum > temp) {
						temp = sum;
					}
				}
			}
		}
		System.out.println(temp);
		
	}

}
