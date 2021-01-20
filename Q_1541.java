package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Greedy Algorithm
// https://www.acmicpc.net/problem/1541

public class Q_1541 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int result = 0;
		
		// -를 기준으로 나눈다
		String[] str = input.split("-");
		
		// 처음 -가 나오기전 수식은 따로 처리 (모두 덧셈 처리)
		String[] str1 = str[0].split("\\+");
		for (String s : str1) {
			result += Integer.parseInt(s);
		}
		
		// -를 기준으로 나눠진 숫자들을 더해서 빼준다
		int minusSum = 0; 	// -해줄 값들의 부분합
		
		for (int i=1; i<str.length; i++) {
			String[] temp = str[i].split("\\+");
			for (String s : temp) {
				minusSum += Integer.parseInt(s);	// -해줄 값들의 부분합
			}
		}
		
		System.out.println(result - minusSum);
	}

}
