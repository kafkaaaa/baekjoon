package stepbystep;

import java.util.Scanner;

public class Q_1316 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();		// N : 입력받을 단어의 개수
		int count = N;				// count : '그룹 단어'의 개수. 전체 개수(N)에서 if절을 통해 count--;
		
		for (int i = 0; i < N; i++) {				// N개의 word를 입력받는다
			String word = scan.next();
			boolean[] check = new boolean[26];		// 등장한 알파벳을 true로 저장할 배열. boolean 타입으로 선언
			
			for (int j = 1; j < word.length(); j++) {		// 단어의 2번째 글자부터 단어 끝까지 반복하며 검사
				if (word.charAt(j) != word.charAt(j-1)) {		// 앞뒤 문자가 다르고..
					if (check[word.charAt(j) - 97] == true) {	// 현재 글자가 이전에 등장했다면..
						count--;								// 그룹단어가 아니므로 개수 -1
						break;									// 이미 그룹단어가 아니므로 그 뒤는 검사할 필요가 없다.
					}
					check[word.charAt(j-1) - 97] = true;	// 현재 검사중인 알파벳을 true로 변경
				}
			}
		}
		System.out.println(count);
			
	}

}
