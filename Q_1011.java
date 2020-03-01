package stepbystep;

import java.util.Scanner;
import java.math.*;

public class Q_1011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for (int i=0; i<T; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			long dis = y - x;							// distance. 두 지점 사이의 거리(y-x)
			double sqrt_dis = Math.sqrt(dis);			// y-x의 제곱근
			int tmp = (int) Math.round(Math.sqrt(dis));	// sqrt(y-x)를 반올림 한 것
			
			if (sqrt_dis <= tmp)
				System.out.println(2*tmp - 1);
			else
				System.out.println(2*tmp);
			
		}
	}
}