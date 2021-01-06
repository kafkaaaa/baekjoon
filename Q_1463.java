package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// DP
// https://www.acmicpc.net/problem/1463

public class Q_1463 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());		// 1 <= N <= 10^6
		
		int count = 0;		// 연산 횟수
		int dp[] = new int[N+1];	// 최소 연산 횟수를 저장할 배열
		
		/*	<Logic>
		 *  #1. i를 1로 만드는 최소 횟수 = i-1을 1로 만드는 최소 횟수 +1로 일단 설정 (다음 줄에서 비교해나감)
		 * 
		 *  #2. i가 2의배수 이고,
		 *  i-1을 1로 만드는 최소횟수+1 > i/2를 1로 만드는 최소횟수 +1 이면
		 *  i를 1로 만드는 최소횟수 dp[i] = i/2를 1로 만드는 최소횟수 +1 로 변경
		 *  
		 *  #3. i가 3의배수 이고,
		 *  i-1을 1로 만드는 최소횟수 +1 > i/3을 1로 만드는 최소횟수 +1 이면
		 *  i를 1로 만드는 최소횟수 dp[i] = i/3을 1로 만드는 최소횟수 +1로 변경
		 */
		
		dp[0] = dp[1] = 0;		// 0과 1은 예외 처리
		
		for (int i=2; i<=N; i++) {
			dp[i] = dp[i-1] + 1;
			if (i % 2 == 0) {
				dp[i] = Math.min(dp[i/2]+1, dp[i]);
			}
			if (i % 3 == 0) {
				dp[i] = Math.min(dp[i/3]+1, dp[i]);
			}
		}
		
		System.out.println(dp[N]);
	}
	
}
