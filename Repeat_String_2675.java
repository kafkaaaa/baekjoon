package stepbystep;

import java.util.Scanner;

public class Repeat_String_2675 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();					// T : 테스트 케이스의 수
		
		for (int i=0; i<T; i++) {
			int R = scan.nextInt();				// R : 반복 횟수
			String S = scan.next();				// S : 반복 할 문자열
			
			for (int j=0; j<S.length(); j++) {
				for (int k=0; k<R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.print("\n");
		}
	}
}