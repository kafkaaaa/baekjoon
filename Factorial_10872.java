package stepbystep;

import java.util.Scanner;

public class Factorial_10872 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int result = 1;
		
		for (int i=N; i>=1; i--) {
			result *= i;
		}
		
		System.out.println(result);

	}
}
