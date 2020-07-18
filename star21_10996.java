package stepbystep;

import java.util.Scanner;

public class star21_10996 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for (int i=1; i<=2*n; i++) {
			
			if (i % 2 == 1) {	// 홀수 행
				for (int j=1; j<=n; j++) {
					if (j % 2 == 1) {	// 별, 공백, 별, 공백 번갈아 출력
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			else {	// 짝수 행
				for (int j=1; j<=n; j++) {
					if (j % 2 == 1) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
			}
			System.out.print("\n");	// 줄바꿈
		}		
	}
}
