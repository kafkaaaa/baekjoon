package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Binary Search : ** lower_bound & upper_bound
// https://www.acmicpc.net/problem/10816
// **Ref : https://velog.io/@junhok82/lowerbound-upperbound

public class Q_10816 {
	
	static int[] cards;
	static int N;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		cards = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(cards);
		
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<M; i++) {
			int target = Integer.parseInt(st.nextToken());
			sb.append(howMany(target)).append(" ");
		}
		System.out.println(sb);
			
	}
		
	static int howMany(int n) {
		
		return (upperBound(n) - lowerBound(n) + 1);
	}
	
	static int lowerBound(int target) {
		
		int start = 0;
		int end = N;
		
		while (start < end) {
			int mid = (start + end) / 2;
			
			if (cards[mid] >= target) {
				end = mid;
			}
			else {
				start = mid + 1;
			}
		}
		return start + 1;
	}
	
	static int upperBound(int target) {
		
		int start = 0;
		int end = N;
		
		while (start < end) {
			int mid = (start + end) / 2;
			
			if (cards[mid] == target) {
				start = mid + 1;
			}
			else if (cards[mid] > target) {
				end = mid;
			}
			else start = mid + 1;
		}
		return end;
	}
	
}
