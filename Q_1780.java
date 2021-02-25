package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Divide & Conquer (분할 정복)
// https://www.acmicpc.net/problem/1780

public class Q_1780 {
	
	static int[][] paper;
	static int nOfMinus1, nOf0, nOf1 = 0;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		paper = new int[N][N];
		
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j=0; j<N; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dividePaper(0, 0, N);
		
		System.out.println(nOfMinus1);
		System.out.println(nOf0);
		System.out.println(nOf1);

	}
	
	static void dividePaper(int x, int y, int size) {
		
		if ( isSame(x, y, size) == false ) {
			
			int divSize = size / 3;
			
			// 9등분
			for (int i=0; i<3; i++) {
				for (int j=0; j<3; j++) {
					dividePaper(x + i*divSize, y + j*divSize, divSize);
				}
			}
		}
		
		else {
			
			int criteria = paper[x][y];
			
			switch (criteria) {
				case -1 :
					nOfMinus1++; break;
				case 0 :
					nOf0++; break;
				case 1 : 
					nOf1++; break;
			}
		}
				
	}
	
	static boolean isSame(int x, int y, int size) {
		
		int temp = paper[x][y];
		
		for (int i=x; i<x+size; i++) {
			for (int j=y; j<y+size; j++) {
				if (paper[i][j] != temp)
					return false;
			}
		}
		
		return true;
	}

}
