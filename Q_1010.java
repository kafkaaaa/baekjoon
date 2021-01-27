package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 정수론 및 조합론 - 조합 (combination) - dp
// https://www.acmicpc.net/problem/1010

public class Q_1010 {

	static int[][] memo = new int[30][30];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			System.out.println(comb(n, r));
		}

	}

	static int comb(int n, int r) {
		
		if (memo[n][r] > 0) {		// 이미 계산된 값은 바로 리턴
			return memo[n][r];
		}
		
		if (n == r || r == 0) {		// n==r || r==0  이면 -> nCr = 1
			return memo[n][r] = 1;
		}
		
		// nCr = n-1Cr-1 + n-1Cr
		return memo[n][r] = comb(n-1, r-1) + comb(n-1, r);
	}

}
