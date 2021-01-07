package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// DP
// https://www.acmicpc.net/problem/10844

public class Q_10844 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());	// 수의 길이. 1 <= len <= 100.
		long[][] dp = new long[len+1][11];
		
		 /*
		  * 마지막 수(L) =    0     =>  dp[N][L] = dp[N - 1][L + 1]
		  * 마지막 수(L) = (1 ~ 8)  =>  dp[N][L] = dp[N - 1][L - 1] + dp[N - 1][L + 1]
		  * 마지막 수(L) =    9     =>  dp[N][L] = dp[N - 1][L - 1]
		 */
	
		for (int i=1; i<=9; i++) {
			dp[1][i] = 1;
		}
		
		for (int i=2; i<=len; i++) {
			dp[i][0] = dp[i-1][1];
			
			for (int j=1; j<=9; j++) {
				dp[i][j] = ( dp[i-1][j-1] + dp[i-1][j+1] ) % 1000000000;
			}
		}

		long sum = 0;
	
		for (int i=0; i<=9; i++) {
			sum += dp[len][i];
			
		}
		
		System.out.println(sum % 1000000000);
	}
	
}
