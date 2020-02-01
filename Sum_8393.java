package stepbystep;

import java.util.Scanner;

public class Sum_8393 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int i = 1;
		int Sum = 0;
		
		for(; i <= n; i++) {
			Sum += i;
		}
		
		System.out.println(Sum);
	}

}