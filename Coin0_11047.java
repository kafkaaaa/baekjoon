package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Greedy Algorithm
// https://www.acmicpc.net/problem/11047

public class Coin0_11047 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());	// The Number of Coins
		int k = Integer.parseInt(st.nextToken());	// Sum of Values
		int[] value = new int[n];	// 각 코인의 가치
		int cnt = 0;	// 동전 개수
		
		// Input
		for (int i=0; i<n; i++) {
			value[i] = Integer.parseInt(br.readLine());
		}
		
		// Solve
		for (int i=n-1; i>=0; i--) {
			if (value[i] <= k) {		// 가치가 큰 동전부터 나눠준다
				cnt += (k / value[i]);
				k %= value[i];
			}
		}
		
		System.out.println(cnt);
	}

}
