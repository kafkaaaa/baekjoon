package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Stack - Parenthesis String (괄호 문자열)
// https://www.acmicpc.net/problem/9012

public class Bracket_9012 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		while (testCase --> 0) {
			
			int count = 0;
			boolean isVPS = false;
			String input = br.readLine();
			
			for (int i=0; i<input.length(); i++) {
				
				if (count < 0) {
					isVPS = false;
					break;
				}
				if (String.valueOf(input.charAt(i)).equals("(")) count++;
				else count--;
			}
		
			if (count == 0) isVPS = true;
			else isVPS = false;
		
			System.out.println(isVPS ? "YES" : "NO");
		}
	}

}
