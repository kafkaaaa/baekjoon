package test0;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int kg5 = N / 5;
		int kg3 = 0;
		
		switch(N % 5) {
	
		case 1 :	// 1kg 남았을 때 -> 5kg하나빼고 남은 1kg더해서 총 6kg를 3kg 봉지에 담는다.
			kg5--;
			kg3 = 2;
			break;
			
		case 2 :	// 2kg 남았을 때
			kg5 -= 2;
			kg3 = 4;
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
		
		System.out.println(kg3 + kg5);

	}

}
