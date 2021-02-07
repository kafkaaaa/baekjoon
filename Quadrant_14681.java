package stepbystep;

import java.util.Scanner;

// if문 - 사분면 고르기
// https://www.acmicpc.net/problem/14681

public class Quadrant_14681 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		if (x > 0 && y > 0) System.out.println(1);
		else if (x < 0 && y > 0) System.out.println(2);
		else if (x < 0 && y < 0) System.out.println(3);
		else System.out.println(4);

	}

}
