package stepbystep;

import java.util.Scanner;

public class Leap_Year_2753 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int Year = scan.nextInt();
		
		if( (Year % 4 == 0) && (Year % 100 != 0 || Year % 400 == 0)) {
			System.out.println("1");
		} else System.out.println("0");
	}
}