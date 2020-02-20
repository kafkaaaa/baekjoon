package stepbystep;

import java.util.Scanner;

public class Sugar_2839 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int kg5 = N / 5;
		int kg3 = 0;
		
		switch(N % 5) {				// 5kg 봉지를 먼저 최대한 담고 남은 경우의 수
		 
		case 1 :	// 1kg 남았을 때
			kg5--; kg3 = 2;
			break;
		case 2 :	// 2kg 남았을 때
			kg5 -= 2; kg3 = 4;
			break;
		case 3 :	// 3kg 남았을 때
			kg3 = 1;
			break;
		case 4 :	// 4kg 남았을 때
			kg5--;
			kg3 = 3;
			break;
		}
			
		if (kg5 < 0) {
			System.out.println(-1);
			return;
		}
		System.out.println(kg5 + kg3);

	}

}
