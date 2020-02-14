package stepbystep;

import java.util.Scanner;

public class SangSoo_2908 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		// 입력받은 두 수 A, B를 거꾸로 변환
		A = 100 * (A%10) + 10 * ( (A/10)%10 ) + A/100;
		B = 100 * (B%10) + 10 * ( (B/10)%10 ) + B/100;
 		
		System.out.println(A > B? A : B);
	}

}
