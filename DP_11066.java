
// https://www.acmicpc.net/problem/11066
// DP 동적 계획법
// DP[i][j] = i ~ j번째 페이지까지 파일을 합치는 최소 비용
// 1. DP[i][i] = 0
// 2. DP[i][i+1] = V[i] + V[i+1]
// 3. DP[i][j] = MIN( DP[i][k] + DP[k+1][j] ) + SUM

package stepbystep;

import java.util.Arrays;
import java.util.Scanner;

public class DP_11066 {
	
	static int[] file;
	static int[] sum;
	static int[][] dp;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();		// 테스트 케이스

		while (T-- > 0) {
			int K = scan.nextInt();

			file = new int[K + 1];
			sum = new int[K + 1];
			dp = new int[K + 1][K + 1];
			for (int[] arr : dp)
				Arrays.fill(arr, -1);

			for (int i = 1; i <= K; i++) {
				file[i] = scan.nextInt();
				sum[i] = sum[i - 1] + file[i];
			}

			int result = solve(1, K);
			System.out.println(result);
		}
	}

	public static int solve(int start, int end) {

		if (start >= end)
			return 0;

		if (dp[start][end] != -1)
			return dp[start][end];

		if (end - start == 1)
			return file[start] + file[end];

		dp[start][end] = Integer.MAX_VALUE;

		for (int i = start; i <= end; i++) {
			int temp = solve(start, i) + solve(i + 1, end) + sum[end] - sum[start - 1];
			dp[start][end] = Math.min(dp[start][end], temp);
		}

		return dp[start][end];
	}
}