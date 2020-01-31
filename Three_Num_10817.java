package stepbystep;

import java.util.Scanner;

public class Three_Num_10817 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int MID = 0;
		
		if( (A >= B) && (B >= C) || (C >= B) && (B >= A) )
			MID = B;
		else if ( (A >= C) && (C >= B) || (B >= C) && (C >= A) )
			MID = C;
		else
			MID = A;
		
		System.out.println(MID);
		}
}