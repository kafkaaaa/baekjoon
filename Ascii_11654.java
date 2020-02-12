package stepbystep;

import java.util.Scanner;

public class Ascii_11654 {
	
// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오 //
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char c = str.charAt(0); 	// charAt(index) -> index번째 문자를 반환, index는 0부터 시작
									// str.charAt(0) -> 문자열 str의 첫번째 문자를 반환

		System.out.println( (int)c );
	}

}