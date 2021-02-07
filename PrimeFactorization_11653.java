package stepbystep;

// 기본 수학 2 - 소인수분해 (1 ≤ N ≤ 10,000,000)
// https://www.acmicpc.net/problem/11653

import java.util.Scanner;

public class PrimeFactorization_11653 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int i = 2;
		while (true) {
			if (N % i == 0) {
				System.out.println(i);
				N /= i;
			}
			else i++;
			
			if (N == 1) break;
		}

	}

}
