package stepbystep;

import java.util.Scanner;

public class Black_Jack_2798 {
	
	// 브루트 포스 알고리즘(전체 탐색)

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();		// N : 카드의 개수
		int M = scan.nextInt();		// M : 카드3장의 최대 합
		
		int[] card = new int[N];	// 카드의 개수만큼 int형 배열 선언
		
		for (int i=0; i<N; i++) {
			card[i] = scan.nextInt();
		}
		
		int temp = 0;				// M값과 가장 가까운 sum을 임시 저장할 변수
		int sum = 0;				// 카드 3장의 합을 저장할 변수 sum
		
	
		for (int i=0; i<N-2; i++) {
			for (int j=i+1; j<N-1; j++) {
				for (int k=j+1; k<N; k++) {
					sum = card[i] + card[j] + card[k];
					if (sum <= M && sum > temp) {			// temp < sum <= M
						temp = sum;
					}
				}
			}
		}
		
		System.out.println(temp);
	}

}
