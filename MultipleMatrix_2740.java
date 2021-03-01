package stepbystep;

// Divide & Conquer (분할 정복) : 행렬의 곱셈
// https://www.acmicpc.net/problem/2740

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultipleMatrix_2740 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// Input Matrix1 (N * M)
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] matrix1 = new int[N][M];
		
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<M; j++) {
				matrix1[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// Input Matrix2 (M * K)
		st = new StringTokenizer(br.readLine());
		st.nextToken();
		int K = Integer.parseInt(st.nextToken());
		int[][] matrix2 = new int[M][K];
		
		for (int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<K; j++) {
				matrix2[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// Multiple Matrix1 & Matrix2 (N * K)
		int[][] result = new int[N][K];
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<K; j++) {
				int sum = 0;
				for (int k=0; k<M; k++) {
					sum += matrix1[i][k] * matrix2[k][j];
					result[i][j] = sum;
				}
			}
		}
		
		// Print result Matrix
		for (int i=0; i<N; i++) {
			for (int j=0; j<K; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
