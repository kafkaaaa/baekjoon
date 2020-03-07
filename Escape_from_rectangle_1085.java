package stepbystep;

import java.util.Scanner;

public class Escape_from_rectangle_1085 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		int min = 1000;
		
		if (x < min)
			min = x;
		if (y < min)
			min = y;
		if (w-x < min)
			min = w-x;
		if (h-y < min)
			min = h-y;
		
		System.out.println(min);
		

	}

}
