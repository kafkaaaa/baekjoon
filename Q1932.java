package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1932 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] num = new int[n][n];	// 입력받은 수 저장
		int[][] max = new int[n][n];	// ~까지의 최대값 저장
		
		int sumMax = 0;
		
		// 입력 저장
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j=0; j<=i; j++) { 
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 최대값 저장하기
		max[0][0] = num[0][0];
		for (int i=1; i<n; i++) {
			for (int j=0; j<=i; j++) {
				// i행 j열까지 경로의 합계의 최대값은 
				// i행 j열 값 + Math.max(i-1행 j-1열까지의 최대값, i-1행 j열까지의 최대값) 이다.
					max[i][j] = num[i][j];
					
					if (j == 0) {		// 각 행의 첫번째 값 : j-1 존재 x -> 예외 처리
						max[i][j] += max[i-1][j];
					}
					else if (i == j) {	// 각 행에서 마지막 열 -> j 존재 x -> 예외 처리
						max[i][j] += max[i-1][j-1];
					}
					else {
						max[i][j] += Math.max(max[i-1][j-1], max[i-1][j]);
					}
					
					sumMax = Math.max(sumMax, max[i][j]);
			}
		}
		System.out.println(sumMax);
	}
	
}
