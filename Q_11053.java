package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// DP
// https://www.acmicpc.net/problem/11053

public class Q_11053 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N+1];	// 입력받은 수
		int[] dp = new int[N+1];
		
		// 입력받은 수 num[] 배열에 저장
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=1; i<=N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			dp[i] = 1;	// 모두 1로 초기화
		}
		
		// 크기 비교 및 카운팅
		for (int i=2; i<=N; i++) {
			for (int j=1; j<=i; j++) {
				if (num[j] < num[i] && dp[i] <= dp[j]) {
					dp[i] = dp[j] + 1;
				}
			}
		}
		
		// 오름차순 정렬 후 마지막 값(최대값) 출력
		Arrays.sort(dp);
		System.out.println(dp[N]);
	}

}
