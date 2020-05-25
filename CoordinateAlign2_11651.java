package stepbystep;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Comparable, Comparator 를 사용한 정렬
public class CoordinateAlign2_11651 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();		// 점의 개수 N
		
		int[][] point = new int[N][2];
		for (int i=0; i<N; i++) {
			point[i][0] = scan.nextInt();
			point[i][1] = scan.nextInt();
		}
		scan.close();
		
		// Comparator 인터페이스 재정의
		Arrays.sort(point, new Comparator<int []>() {
			@Override
			public int compare(int[] point1, int[] point2) {
				
				// y좌표 같으면 x좌표 기준으로 오름차순 정렬
				if (point1[1] == point2[1])
					return Integer.compare(point1[0], point2[0]);
				
				// 그외에는 y좌표를 기준으로 오름차순 정렬
				return Integer.compare(point1[1], point2[1]);
			}
		});
			
		for (int i=0; i<N; i++) {
			System.out.println(point[i][0] + " " + point[i][1]);
		}
		
	
	}

}
