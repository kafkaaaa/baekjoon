package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// DP - LIS
// https://www.acmicpc.net/problem/2565

public class Wire_2565 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	// 전깃줄의 개수
		int[][] connectionAB = new int[n+1][2];	// 전봇대 A와 B간의 연결
		int[] dp = new int[n+1];
		dp[1] = 1;
		
		// Input
		for (int i=1; i<=n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			connectionAB[i][0] = Integer.parseInt(st.nextToken());
			connectionAB[i][1] = Integer.parseInt(st.nextToken());
		}

		// 전봇대 A를 기준으로 오름차순 정렬
		Arrays.sort(connectionAB, new Comparator<int[]>() {
			@Override
			public int compare(int[] A, int[] B) {
				if (A[0] < B[0]) return -1;
				else if (A[0] > B[0]) return 1;
				else return 0;
			}
		});
		
		// LIS
		for (int i=2; i<=n; i++) {
			dp[i] = 1;
			for (int j=1; j<i; j++) {
				if (connectionAB[i][1] > connectionAB[j][1]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		
		Arrays.sort(dp);
		// 전체 - 최대로 설치할 수 있는 전깃줄의 개수 = 없애야 하는 전깃줄의 최소 개수
		System.out.println(n - dp[n]);
	}

}
