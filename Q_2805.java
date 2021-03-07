package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Binary Search
// https://www.acmicpc.net/problem/2805

public class Q_2805 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());	// 나무의 수 N
		int M = Integer.parseInt(st.nextToken());	// 필요한 나무의 길이 : M 미터
		int[] tree = new int[N];					// 각 나무의 높이 : tree[]
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(tree);
		
		// binary search
		int left = 0;
		int right = tree[N-1];
		int mid = 0;	// 절단기의 높이
		int result = 0;
		
		while (left <= right) {
			
			long sumOfTree = 0;			// 잘려진 나무들의 길이 합 : long 범위 필요
			mid = (left + right) / 2;
			
			for (int i=0; i<N; i++) {
				if (tree[i] > mid) {	// 나무의 높이가 절단기의 높이보다 높을때 합계 카운트
					sumOfTree += (tree[i] - mid);
				}
			}
			
			if (sumOfTree < M) {		// 잘라서 얻은 길이의 합이 필요한 길이보다 적으면
				right = mid - 1;
			}
			else {						// 잘라서 얻은 길이의 합이 필요한 길이보다 많으면
				left = mid + 1;
				result = mid;
			}
		}
		
		System.out.println(result);
	}

}
