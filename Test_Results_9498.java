package stepbystep;

import java.util.Scanner;

public class Test_Results_9498 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int Grade = scan.nextInt();
		
		if(Grade >= 90) System.out.println("A");
		else if(Grade >= 80) System.out.println("B");
		else if(Grade >= 70) System.out.println("C");
		else if(Grade >= 60) System.out.println("D");
		else System.out.println("F");
	}

}