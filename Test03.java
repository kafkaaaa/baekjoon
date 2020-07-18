package test0;

import java.util.Scanner;

public class Test03 {

	// ※시간제한 0.15초
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();	// 낮에 올라가는 높이
		int B = scan.nextInt();	// 밤에 떨어지는 높이
		int V = scan.nextInt();	// 올라가야할 높이
		
		int height = 0;	// 올라간 높이
		int day = (V-B) / (A-B);	// 경과날짜
		
		if ( (V-B) % (A-B) != 0 ) {
			day++;
		}
		
		System.out.println(day);
	}

}
