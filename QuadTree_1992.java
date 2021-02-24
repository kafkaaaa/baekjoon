package stepbystep;

// Divide & Conquer (분할 정복) - QuadTree
// https://www.acmicpc.net/problem/1992

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadTree_1992 {
	
	static int[][] image;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	// N * N 정사각형 크기
		image = new int[N][N];
		
		for (int i=0; i<N; i++) {
			String input = br.readLine();
			for (int j=0; j<N; j++) {
				image[i][j] = input.charAt(j) - '0';
			}
		}

		compress(0, 0, N);
		System.out.println(sb);
	}
	
	// 입력된 영상(image)을 압축
	static void compress(int x, int y, int size) {
		
		if ( isSame(y, x, size) ) {
			sb.append(image[y][x]);
		}
		
//    ** 아래와 같이 작성하면 결과값이 틀리게 나온다. (x좌표, y좌표 순서)
//		if ( isSame(x, y, size) ) {
//			sb.append(image[x][y]);
//		}
		
		else {
			sb.append("(");
			
			// 사등분하여 다시 압축 
			int divSize = size / 2;
			
			compress(x, y, divSize);						// 2사분면
			compress(x + divSize, y, divSize);				// 1사분면
			compress(x, y + divSize, divSize);				// 3사분면
			compress(x + divSize, y + divSize, divSize);	// 4사분면
			
			sb.append(")");
		}
	}
	
	// check image's elements are same
	static boolean isSame(int x, int y, int size) {
		
		int temp = image[x][y];

		for (int i=x; i<x+size; i++) {
			for (int j=y; j<y+size; j++) {
				if (image[i][j] != temp)
					return false;
			}
		}
		
		return true;
	}
				
}
