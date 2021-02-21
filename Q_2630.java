package stepbystep;

// Divide & Conquer (분할 정복)
// https://www.acmicpc.net/problem/2630

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2630 {
	
	static int[][] board;
	static int nOfWhite, nOfBlue = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	// 전체 종이의 한 변의 길이 (2^k, k는 1 이상 7 이하 자연수)
		
		board = new int[n][n];		// n*n 정사각형
		
		// Input
		StringTokenizer st;
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j=0; j<n; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		check(0, 0, n);
		System.out.println(nOfWhite);
		System.out.println(nOfBlue);
			
			
	}
	
	static void check(int x, int y, int size) {
		
		if (isSame(x, y, size) == false) {		// 정사각형의 모든 칸의 색이 일치하지 않으면
			
			int divSize = size/2;
			check(x, y, divSize);
			check(x, y + divSize, divSize);
			check(x + divSize, y + divSize, divSize);
			check(x + divSize, y , divSize);
		}
		else {
			if (board[x][y] == 1) nOfBlue++;
			else nOfWhite++;
		}
	}

	static boolean isSame(int x, int y, int size) {
		
		int temp = board[x][y];		// 비교할 정사각형에서 첫 칸의 색깔
		
		for (int i=x; i<x+size; i++) {
			for (int j=y; j<y+size; j++) {
				if (board[i][j] != temp) {
					return false;
				}
			}
		}
		
		return true;
	}

}
