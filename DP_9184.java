package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// DP - Memoization
// https://www.acmicpc.net/problem/9184

public class DP_9184 {
	
	static int[][][] value;		// w(a,b,c)의 결과값을 저장해둘 3차원 배열
	static int a, b, c;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		value = new int[102][102][102];
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			
			if (a == -1 && b == -1 && c == -1) break;
			
			System.out.println("w(" + a + ", " + b + ", " + c + ") = " + w(a,b,c));
		}
		
	}

	static int w(int a, int b, int c) {
		
		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		else if (a > 20 || b > 20 || c > 20) {
			return w(20, 20, 20);
		}
		else if (a < b && b < c) {
			if (value[a][b][c] != 0) {	// 이미 계산된 값이면 바로 리턴
				return value[a][b][c];
			}
			else {
				value[a][b][c] = w(a,b,c-1) + w(a,b-1,c-1) - w(a,b-1,c);
				return value[a][b][c];
			}
		}
		else {
			if (value[a][b][c] != 0) {	// 이미 계산된 값이면 바로 리턴
				return value[a][b][c];
			}
			else {
				value[a][b][c] = w(a-1,b,c) + w(a-1,b-1,c) + w(a-1,b,c-1) - w(a-1,b-1,c-1);
				return value[a][b][c];
			}
		}
		
	}
	
}
