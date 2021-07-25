
// https://www.acmicpc.net/problem/10942
// DP 동적계획법 - 팰린드롬(Palindrome)
// Memoization : num[start] == num[end] 이면 -> dp[s][e] = 1 저장

package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DP_10942 {
	
	static int[] num;
	static int[][] dp;	// dp[i][j] = i ~ j 번 수열이 팰린드롬인지 저장
	
	public static void main(String[] args) throws IOException {
		
		// Input (1 <= N <= 2000)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	// 수열의 크기
		num = new int[N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=1; i<N+1; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		dp = new int[N+1][N+1];
		for (int e[] : dp) {
			Arrays.fill(e, -1);		// 아직 계산되지 않은 dp배열은 -1로 초기화
		}
		
		// Question (1 <= M <= 1000000)
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine());	// 질문의 개수
		for (int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			if ( isPalindrome(start, end) == 1 )  sb.append("1\n");
			else sb.append("0\n");
		}
		System.out.println(sb);
	}

	// Recursive
	static int isPalindrome(int start, int end) {
		
		if (start >= end) return 1;
		
		// 이미 계산된 값이면..
		if (dp[start][end] != -1)
			return dp[start][end];
		
		if (num[start] == num[end]) {
			return dp[start][end] = isPalindrome(start+1, end-1);
		}
		
		return 0;
	}
		
}
