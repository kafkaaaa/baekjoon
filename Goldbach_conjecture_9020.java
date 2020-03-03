package stepbystep;

import java.util.Scanner;

public class Goldbach_conjecture_9020 {
/* 골드바흐 파티션 
	4 = 2+2
	6 = 3+3
	8 = 3+5
	10 = 5+5
	12 = 5+7
	14 = 3+11, 7+7
	...
*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for (int i=0; i<T; i++) {
			int n = scan.nextInt();
			for (int j=n/2; j>=2; j--) {
				if (IsPrime(j) && IsPrime(n-j)) {
					System.out.println(j + " " + (n-j));
					break;
				}
			}

		}
	}

	public static boolean IsPrime(int num) {
		if (num<2) return false;		// 1이하는 소수가 아니다
			
		for (int i=2; i<=(int)Math.sqrt(num); i++)
			if (num % i == 0) return false;
			
		return true;
	}	
	
}