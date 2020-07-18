package stepbystep;

import java.util.Scanner;

public class star9_2446 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		for (int i=0; i<2*n-1; i++) {	// 2n-1 줄 반복 출력
			if (i<n) {
				for (int j=0; j<i; j++)		// 공백 출력
					System.out.print(" ");
				
				for (int j=0; j<2*(n-i)-1; j++)
					System.out.print("*");	// 별 출력
				
				System.out.println();	// 줄바꿈
			}
			else {
				for (int j=0; j<2*(n-1)-i; j++)	// 공백 출력
					System.out.print(" ");
				
				for (int j=0; j<(i+1-n)*2+1; j++)	// 별 출력
					System.out.print("*");
				
				System.out.println();	// 줄바꿈
			}
		}
	}
}
