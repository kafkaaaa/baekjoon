package stepbystep;

import java.util.Scanner;

public class Star_2438 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}