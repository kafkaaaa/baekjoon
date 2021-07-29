
// https://www.acmicpc.net/problem/7579
// DP 동적계획법

package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DP_7579 {

	public static void main(String[] args) throws IOException {
		
		// Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());	// 앱의 개수 N (1 <= N <= 100)
		int M = Integer.parseInt(st.nextToken());	// 필요한 메모리 M (1 <= M <= 10,000,000)
		int[] mem = new int[N];		// 각 앱이 차지하는 메모리	(0 <= mem[i] <= 10,000,000)
		int[] cost = new int[N];	// 각 앱을 다시 활성화 할 때 들어가는 비용 (0 <= cost[i] <= 100)
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			mem[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			cost[i] = Integer.parseInt(st.nextToken());
		}

		// dp[idx][cost] = (입력으로 받은)idx번째 까지의 앱을 사용하여 cost만큼의 비용으로 확보할 수 있는 최대 메모리 크기
		int[][] dp = new int[N][10001];		// 최대 100개 앱 x 각 최대 비용 100 -> 총 최대 비용 = 10000
		int minCost = Integer.MAX_VALUE;
		
		for (int i=0; i<N; i++) {
			int m = mem[i];
			int c = cost[i];
			
			for (int j=0; j<=10000; j++) {
				// base case 1 : 앱이 1개있는 경우
				if (i == 0) {
					if (j >= c) dp[i][j] = m;
				}
				else {
					if (j >= c) {
						dp[i][j] = Math.max(dp[i-1][j-c] + m, dp[i-1][j]);
					}
					else dp[i][j] = dp[i-1][j];
				}
				// 필요한 메모리 이상 확보했으면..
				if (dp[i][j] >= M) {
					minCost = Math.min(minCost, j);
				}
			}
		}
		System.out.println(minCost);
	}

}
