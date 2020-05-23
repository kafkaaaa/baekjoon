package stepbystep;

import java.util.Arrays;
import java.util.Scanner;

public class SortInside_1427 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String N = scan.nextLine();
		int len = N.length();
		char[] num1 = new char[N.length()];
		int[] num2 = new int[N.length()];
		
		for (int i=0; i<len; i++) {
			num1[i] = N.charAt(i);		// 입력받은 수를 한 글자씩 배열에 저장
			num2[i] = num1[i] - '0';	// 각 문자를 숫자로 변환
		}
		
		// 오름차순 정렬
		Arrays.sort(num2);
		
		// 내림차순 정렬한 값을 출력해야 하므로 역순으로 ...
		for (int i=len-1; i>=0; i--) {
			System.out.print(num2[i]);
		}

	}

}
