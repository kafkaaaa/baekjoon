package stepbystep;

import java.util.Scanner;

public class Find_prime_number_1978 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();		// 테스트 케이스의 개수 N.   N<=100.
		int cnt = 0;
		for (int i=0; i<N; i++) {
			int num = scan.nextInt();
			if(IsPrime(num)) cnt++;
		}
		System.out.println(cnt);
	}

			
	public static boolean IsPrime(int num) {
		if (num<2) return false;		// 1이하는 소수가 아니다
		
		for (int i=2; i<=(int)Math.sqrt(num); i++)
			if (num % i == 0) return false;
		
		return true;
		}
}
