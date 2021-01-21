package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 정수론 및 조합론
// https://www.acmicpc.net/problem/5086

public class Q_5086 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] num = new int[100];
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			num[0] = Integer.parseInt(st.nextToken());
			num[1] = Integer.parseInt(st.nextToken());
			
			if (num[0] == 0 && num[1] == 0) break;
			
			if (num[1] % num[0] == 0) {
				System.out.println("factor");
			}
			else if (num[0] % num[1] == 0) {
				System.out.println("multiple");
			}
			else System.out.println("neither");
		}
	}

}
