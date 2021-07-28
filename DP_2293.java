
// https://www.acmicpc.net/problem/2293
// DP 동적계획법 - 동전1

package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DP_2293 {
	
	static int[] value;					// 각 동전의 가치 (100000이하 자연수)
	static int[] dp = new int[10001];	// DP - Memoization

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());	// 동전의 종류 (1 <= n <= 100)
		int k = Integer.parseInt(st.nextToken());	// k원을 만들려고 한다 (1 <= k <= 10000)
		value = new int[n+1];
		for (int i=1; i<=n; i++) {
			value[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 1;
		
		for (int i=1; i<=n; i++) {
			for (int j=value[i]; j<=k; j++) {
				dp[j] = dp[j] + dp[j - value[i]];
			}
		}
		
		System.out.println(dp[k]);
	}
	
}
