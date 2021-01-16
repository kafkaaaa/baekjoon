package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// DP
// https://www.acmicpc.net/problem/1912
// **Ref : https://st-lab.tistory.com/140

public class Q_1912 {
	
	public static void main(String[] args) throws IOException {
		
		// Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		// Solve
		int[] seq = new int[n];
		int[] dp = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = seq[0];
		int max = seq[0];
		
		for (int i=1; i<n; i++) {
			// dp[i-1] + seq[i] 값과 seq[i] 중에서 큰 값을 저장해나감
			dp[i] = Math.max(dp[i-1] + seq[i], seq[i]);
			max = (max > dp[i]) ? max : dp[i];	// 최대값 갱신
		}
	
		// Output
		System.out.println(max);
	}
			
}
