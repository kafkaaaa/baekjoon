package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// DP : '0-1 Knapsack Problem' : 물건을 쪼갤 수 없는 배낭문제 - 조합 최적화
// https://www.acmicpc.net/problem/12865
// **Ref : https://st-lab.tistory.com/141, https://fbtmdwhd33.tistory.com/60

public class Bag_12865 {

	public static void main(String[] args) throws IOException {

		// Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());	// 물품의 수
		int K = Integer.parseInt(st.nextToken());	// 버틸 수 있는 무게
		int[] W = new int[N+1];	// 물건의 무게
		int[] V = new int[N+1];	// 물건의 가치
		int[][] dp = new int[N+1][K+1];		// dp[~번째 물건][~무게]
		
		for (int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			W[i] = Integer.parseInt(st.nextToken());
			V[i] = Integer.parseInt(st.nextToken());
		}
		
		// Solve
		for (int i=1; i<=N; i++) {
			for (int j=1; j<=K; j++) {
				dp[i][j] = dp[i-1][j];	// Memoization
				
				// 무게가 남으면..
				if ( (j - W[i]) >= 0 ) {
					// 이전 아이템에서 구한 Value / 이전 Value + 해당 물건의 가치 중 큰값으로..
					dp[i][j] = Math.max(dp[i][j], dp[i-1][j-W[i]] + V[i]);
				}
			}
		}
		
		// Output
		System.out.println(dp[N][K]);
	}

}
