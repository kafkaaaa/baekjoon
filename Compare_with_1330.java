package stepbystep;

import java.util.Scanner;

public class Compare_with_1330 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		if(A > B) System.out.println(">");
		else if(A < B) System.out.println("<");
		else System.out.println("==");
		
		}
}