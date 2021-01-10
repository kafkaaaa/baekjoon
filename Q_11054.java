package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// DP - LIS (Longes Increasing Subsequence) : 가장 긴 증가하는 부분수열
// https://www.acmicpc.net/problem/11054
// **Ref : https://squareyun.tistory.com/27, https://withhamit.tistory.com/197


public class Q_11054 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] seq = new int[N+1];
		int[] IncLR = new int[N+1];
		int[] DecRL = new int[N+1];
		int max = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=1; i<=N; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		// 증가하는 부분 수열의 길이도 최대로,
		// 감소하는 부분 수열의 길이도 최대로..
		for (int i=1; i<=N; i++) {
			IncLR[i] = 1;
			for (int j=1; j<i; j++) {
				if (seq[i] > seq[j]) {
					IncLR[i] = Math.max(IncLR[j]+1, IncLR[i]);
				}
			}
		}
		
		for (int i=N; i>0; i--) {
			DecRL[i] = 1;
			for (int j=N; j>i; j--) {
				if (seq[i] > seq[j]) {
					DecRL[i] = Math.max(DecRL[j]+1, DecRL[i]);
				}
			}
		}
		
		// 길이 최대값 구하기
		for (int i=1; i<=N; i++) {
			max = Math.max(max, IncLR[i] + DecRL[i]);
		}
		System.out.println(max-1);
		
	}

}
