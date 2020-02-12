package stepbystep;

// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오 //

import java.util.Scanner;

public class Sum_11720 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); 				// 테스트 케이스의 개수 N
		int sum = 0;
		String str = scan.next();
		
		for (int i=0; i<N; i++) {
			sum += Integer.parseInt(str.substring(i, i+1)); 
			// Integer.parseInt(string) -> string(문자열)을 10진수 int형으로 반환
			// Integer.parseInt(string, int radix) -> 해당 진수(radix)에 맞춰 int형으로 반환
		}
			// substring -> 문자열 추출 메소드 (부분 문자열 반환)
			// substring(start, end) -> start 위치 부터 end 전까지 문자열 추출
			System.out.println(sum);
	}
}