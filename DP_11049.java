
// https://www.acmicpc.net/problem/11049
// DP 동적 계획법 - 행렬 곱셈 순서 : 최소 곱셈 연산 횟수
// N x M 행렬 A,  M x K 행렬B가 있을 때  -> A x B의 곱셉 연산 수 = N x M x K
 
package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DP_11049 {
	
	static int[] row;
	static int[] col;
	static int[][] dp;
	
	public static void main(String[] args) throws IOException {
		
		// Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	// N = 행렬의 개수
		StringTokenizer st;
		row = new int[N];
		col = new int[N];
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			row[i] = Integer.parseInt(st.nextToken());
			col[i] = Integer.parseInt(st.nextToken());
		}
		
		// dp배열 기저사례(i==j)  및   초기화(MAX_VALUE) 
		dp = new int[N][N];
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (i == j) dp[i][j] = 0;
				else dp[i][j] = Integer.MAX_VALUE;
			}
		}
		
		for (int i=1; i<N; i++) {
			for (int j=0; i+j<N; j++) {
				MultipleCnt(j, i+j);
			}
		}
		System.out.println(dp[0][N-1]);
	}

	
	// start번째 배열 ~ end번째 배열까지 최소 곱셉 연산 횟수 저장 
	static void MultipleCnt(int start, int end) {
		for (int i=start; i<end; i++) {
			int tmp = dp[start][i] + dp[i+1][end] + row[start] * col[i] * col[end];
			dp[start][end] = Math.min(dp[start][end], tmp);
		}
	}
	
}
			
		