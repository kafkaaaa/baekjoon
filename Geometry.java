package stepbystep;

import java.util.Scanner;

public class Geometry {
	
	// 유클리드 기하학에서의 원의 넓이 -> PI*R^2
	// 택시 기하학에서의 원의 넓이 -> 대각선의 길이가 2R인 정사각형(마름모) -> 2R * 2R / 2 = 2R^2

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt();
		
		System.out.printf("%.6f\n", (double) Math.PI * R * R);
		System.out.printf("%.6f", (double) 2 * R * R);
	}

}
