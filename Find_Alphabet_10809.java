package stepbystep;

import java.util.Arrays;

/*
#문제
알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서,
단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

#입력
첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
*/			

import java.util.Scanner;

public class Find_Alphabet_10809 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		// next() -> 문자(열)을 '공백'을 기준으로 한 문자(단어)씩 입력 받는다.
		// nextLine() -> 한 라인 전체를 입력 받는다.
		scan.close();
		
		int[] alphabet = new int[26];			// a~z 알파벳 저장할 배열]
		Arrays.fill(alphabet, -1);				// alphabet 배열을 모두 -1로 초기화
		
		for (int i=0; i<S.length(); i++) {
			char ch = S.charAt(i);				// 입력받은 문자열의 한 글자씩 순서대로 char형 변수 ch에 저장
			int temp = (int)ch;					// temp : 해당하는 알파벳의 아스키코드값
			if (alphabet[temp-97] == -1) {		// temp는 각 글자(알파벳)의 아스키코드값이므로 'a'의 아스키코드값인 97을 빼주면 alphabet[0~25]배열에 첫 번째 등장한 순서(i)가 저장된다. 
				alphabet[temp-97] = i;
			}
		}
		
		for (int i=0; i<alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
	}
}