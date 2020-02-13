package stepbystep;

import java.util.Scanner;

public class Study_Word_1157 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next().toUpperCase();	// 입력받은 단어를 모두 대문자로 바꿔준다
		
		int[] alpha = new int[26];					// A~Z의 사용된 개수를 저장할 배열
		int max = 0;								// 가장 많이 사용된 알파벳의 개수를 저장할 max
		char result = ' ';
		
		for (int i=0; i<word.length(); i++) {
			alpha[word.charAt(i) - 65]++;			// A의 아스키코드는 65이므로 .. 
			if (max < alpha[word.charAt(i) - 65])
			{
				max = alpha[word.charAt(i) - 65];
				result = word.charAt(i);
			}
			else if (max == alpha[word.charAt(i) - 65])
			{
				result = '?';
			}
		}
		System.out.println(result);
		
	}

}
