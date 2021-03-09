package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Binary Search
// https://www.acmicpc.net/problem/2110

public class Q_2110 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());	// 집의 개수
		int[] house = new int[N];
		int C = Integer.parseInt(st.nextToken());	// 공유기의 개수
		
		for (int i=0; i<N; i++) {
			house[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(house);
		
		int left = 1;							// 최소 거리
		int right = house[N-1] - house[0];		// 최대 거리
		int mid;
		int result = 0;
		
		while (left <= right) {
			mid = (left + right) / 2;
			int preHouse = house[0];	// 좌표상 첫 번째 집에 공유기를 설치
			int iptime = 1;				// 공유기 설치 개수
			
			for (int i=0; i<N; i++) {
				int distance = house[i] - preHouse;
				
				if (distance >= mid) {
					iptime++;
					preHouse = house[i];
				}
			}
			
			if (iptime >= C) {
				left = mid + 1;
				result = mid;
			}
			else {
				right = mid - 1;
			}
		}
		System.out.println(result);
	}
	
}
