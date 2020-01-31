package stepbystep;

import java.util.Scanner;

public class Alarm_2884 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();		// hour
		int M = scan.nextInt();		// minute
		
		if(M < 45) {
			H --;
			M = 60 + M - 45;
			if(H < 0) H += 24;
		}
		else M = M - 45;
		
		System.out.println(H + " " + M);
	}
}