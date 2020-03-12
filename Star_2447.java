package stepbystep;

import java.util.Arrays;
import java.util.Scanner;

public class Star_2447 {
	
	public static char[][] star;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		star = new char[N][N];			// N * N 배열 생성
		
		for (char[] arr : star) {				// 2차원배열 star를 공백(' ') 으로 초기화
			Arrays.fill(arr, ' ');				// for-in문을 사용
		}
		
	/*	for (int i=0; i<star.length; i++) {		// 일반 for문을 사용한 것. 한 줄씩 모두 공백(' ')으로 초기화
			Arrays.fill(star[i], ' ');
		}
	*/
		
		draw_Star(0, 0, N);
		
		for (int i=0; i<star.length; i++) {		// star.length 대신 N을 써도 된다.
			System.out.println(star[i]);
		}		
	}

// 3x3 별을 만드는 재귀함수 //
// 재귀 호출 시 마다 시작점을 옮겨서 각각 3x3별 모양을 반복해준다 //

	public static void draw_Star(int x, int y, int n) {
	
		if (n == 1) {
			star[x][y] = '*';
			return;
		}
	
		int z = n / 3;
	
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (i == 1 && j == 1) continue;
				else draw_Star(x+(z*i), y+(z*j), z); 
			}
		}
	}

}		