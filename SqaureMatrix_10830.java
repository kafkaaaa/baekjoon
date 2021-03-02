package stepbystep;

// Divide & Conquer (분할 정복) : 행렬의 제곱
// https://www.acmicpc.net/problem/10830

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SqaureMatrix_10830 {
	
	static int N;
	static int[][] unitMatrix;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		// 단위행렬 만들기
		unitMatrix = new int[N][N];
		for (int i=0; i<N; i++) unitMatrix[i][i] = 1;
		
		// N * N 행렬 입력받기
		int[][] matrix = new int[N][N];
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<N; j++) {
				// ** 입력으로 1000이하의 자연수가 들어오는데, 1000이 들어왔을 때 나머지 연산을 하기 위해 미리 %1000 을 해줌
				matrix[i][j] = Integer.parseInt(st.nextToken()) % 1000;
			}
		}
		
		matrix = powMatrix(matrix, B);
		
		for(int i=0; i<N; i++) {
			for (int j=0; j<N; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
		
	}
	
	// N * N 행렬을 거듭제곱 해주는 함수 (martix^n)
	// 1 ≤ n ≤ 100,000,000,000 이므로 long 자료형 사용
	static int[][] powMatrix(int[][] matrix, long n) {
		
		if (n == 0) 			// 행렬의 0제곱은 단위행렬 (Unit Matrix)
			return unitMatrix;
		if (n == 1) 			// 행렬의 1제곱은 자기 자신
			return matrix;
		
		// Divide & Conquer
		// 행렬 A^n 에서 (n, k는 자연수)
		// (1) : n이 짝수일때 -> (n = 2k)   -> A^n = A^k * A^k
		// (2) : n이 홀수일때 -> (n = 2k+1) -> A^n = A^k * A^k * A
		int[][] half = powMatrix(matrix, n/2);
		int[][] temp = multipleMatrix(half, half);
		
		if (n % 2 == 0) return temp;		
		else return multipleMatrix(temp, matrix);
	}
	
	// 두 행렬을 곱하는 함수
	static int[][] multipleMatrix(int[][] m1, int[][] m2) {
		
		int[][] result = new int[N][N];
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				for (int k=0; k<N; k++) {
					result[i][j] += (m1[i][k] * m2[k][j]) % 1000;
				}
				result[i][j] %= 1000;
			}
		}
		return result;
	}
	
}
