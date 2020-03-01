package stepbystep;

import java.util.Scanner;

public class Prime_number_1929 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		
		for (int i=M; i<=N; i++) {
			if (IsPrime(i))
				System.out.println(i);
		}
	}

	public static boolean IsPrime(int num) {
		if (num<2) return false;		// 1이하는 소수가 아니다
			
		for (int i=2; i<=(int)Math.sqrt(num); i++)
			if (num % i == 0) return false;
			
		return true;
	}	
	
}
