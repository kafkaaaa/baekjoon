package stepbystep;

import java.util.Scanner;

public class Q_5543 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int b1 = scan.nextInt();
		int b2 = scan.nextInt();
		int b3 = scan.nextInt();
		int min = b1;
		
		int d1 = scan.nextInt();
		int d2 = scan.nextInt();

		if (min > b2) min = b2;
		if (min > b3) min = b3;
		
		int result = min + ((d1 > d2)? d2: d1) - 50;
		
		System.out.println(result);
	}

}
