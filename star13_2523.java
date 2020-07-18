package stepbystep;

import java.util.Scanner;

public class star13_2523 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for (int i=1; i<N; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for (int i=0; i<N; i++) {
			System.out.print("*");
		}
		System.out.print("\n");
		
		for (int i=N-1; i>0; i--) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	
	}

}
