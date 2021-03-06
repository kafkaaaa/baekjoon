package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Binary Search
// https://www.acmicpc.net/problem/1654

public class Q_1654 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int K = Integer.parseInt(st.nextToken());
		int[] wire = new int[K];
		int N = Integer.parseInt(st.nextToken());
		
		for (int i=0; i<K; i++) {
			wire[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(wire);
		
		// binary search
		long left = 1;
		long right = wire[K-1];		// 최대 랜선 길이
		long mid;
		
		while (left <= right) {
			mid = (left + right) / 2;
			
			long cnt = 0;
			for (int i=0; i<K; i++) {		// 자른 랜선 개수의 합
				cnt += (wire[i] / mid);
			}
			
			if (cnt >= N) {		// 자른 랜선 개수의 합이 필요한 랜선의 개수 N보다 많으면
				left = mid + 1;
			}
			else {
				right = mid -1;
			}
		}
		
		System.out.println(right);
	}
					
}
