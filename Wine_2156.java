package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// DP
// https://www.acmicpc.net/problem/2156

public class Wine_2156 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	// 포도주 잔의 개수   1 ≤ n ≤ 10,000
		int[] qty = new int[n+1];	// 1~n번 포도주의 양(quantity)
		int[] dp = new int[n+1];	// 1~n개의 포도주가 있을 때, 최대로 마실 수 있는 양
		
		for (int i=1; i<=n; i++) {	// qty[1] ~ qty[n] : 각 포도주에 담긴 양
			qty[i] = Integer.parseInt(br.readLine());
		}
		
		// 1, 2의 경우는 예외 처리
		if (n >= 1) dp[1] = qty[1];
		if (n >= 2) dp[2] = qty[1] + qty[2];
		
		for (int i=3; i<=n; i++) {
			// (1) 0번 연속 마실 수 있는 경우 : i번째 포도주를 마신 경우 -> dp[i] = dp[i-1]
			// (2) 1번 연속 마실 수 있는 경우 : n-1번 포도주는 마시면x -> dp[i] = dp[i-2] + qty[i]
			// (3) 2번 연속 마실 수 있는 경우 : i번째 포도주를 마신 경우 -> dp[i] = dp[i-3] + qty[i-1] + qty[i]
			dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + qty[i], dp[i-3] + qty[i-1] + qty[i]));
		}
		System.out.println(dp[n]);
	}

}
