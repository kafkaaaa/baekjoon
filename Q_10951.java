package stepbystep;

import java.util.Scanner;

public class Q_10951 {			// hasNext() È°¿ë

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt()){
			int A = scan.nextInt();
			int B = scan.nextInt();
			System.out.println(A + B);
		}
		
	}

}