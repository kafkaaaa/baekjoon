package stepbystep;

import java.util.Scanner;

public class Times_Table_2739 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(N + " * " + i + " = " + N * i);
		}
	}
}