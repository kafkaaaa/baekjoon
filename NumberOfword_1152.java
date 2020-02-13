package stepbystep;

import java.util.Scanner;

public class NumberOfword_1152 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine().trim();		// .trim() -> 앞뒤 공백 제거
		
		if (word.isEmpty()) {
			System.out.println(0);
		}
		else {
			System.out.println(word.split(" ").length);
		}
	}
}

		
/*  ver2 (StringTokenizer 사용)

import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberOfword_1152 {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        StringTokenizer strToken = new StringTokenizer(word, " ");
        							// StringTokenizer : 문자열 word를 " "(공백)을 기준으로 나눔
        System.out.println(strToken.countTokens());
        							// countTokens() : 나눠진 단어의 개수를 반환
    }
}
	
*/