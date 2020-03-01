package stepbystep;

import java.util.Scanner;

public class Prime_Number_2581 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		int sum = 0;
		int min_prime = 0;
		
		for (int i=M; i<=N; i++) {
			if (IsPrime(i)) {
				sum += i;
				if (min_prime == 0)		// ó������ ã���� ���� 1�� �����Ѵ� (�ּҰ�)
					min_prime = i;
			}
		}
		System.out.println(sum == 0 ? -1 : sum + "\n" + min_prime);
	}
	
	public static boolean IsPrime(int num) {
		if (num<2) return false;		// 1���ϴ� �Ҽ��� �ƴϴ�
		
		for (int i=2; i<=(int)Math.sqrt(num); i++)
			if (num % i == 0) return false;
		
		return true;
		}
}