package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// DP - LCS (Longest Common Subsequence, 최장 공통 부분수열)
// https://www.acmicpc.net/problem/9251
// **Ref : https://twinw.tistory.com/126

public class LCS_9251 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		
		char[] table1 = new char[s1.length()];
		char[] table2 = new char[s2.length()];
		table1 = s1.toCharArray();
		table2 = s2.toCharArray();
		
		int dp[][] = new int[s1.length()+1][s2.length()+1];
		
		for (int i=1; i<=s1.length(); i++) {
			for (int j=1; j<=s2.length(); j++) {
				if (table1[i-1] == table2[j-1]) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		System.out.println(dp[s1.length()][s2.length()]);
	}

}
