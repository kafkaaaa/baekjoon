package stepbystep;

import java.util.Arrays;
import java.util.Scanner;

public class Q_7568 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();			// N : 사람의 수
		int[] weight = new int[N];		// weight[] : 몸무게
		int[] height = new int[N];		// height[] : 키
		int[] rank = new int[N];		// rank : 등수
		Arrays.fill(rank, 1);			// 등수를 모두 1로 초기화

		
		for (int i=0; i<N; i++) {		// 사람의 수 만큼 몸무게와 키를 각각 배열에 저장
			weight[i] = scan.nextInt();
			height[i] = scan.nextInt();
		}
		
		for (int i=0; i<N; i++) {		// 각각 몸무게와 키를 비교해서 둘다 작으면 rank++
			for (int j=0; j<N; j++) {
				if (weight[i] < weight[j] && height[i] < height[j])
					rank[i]++;
			}
		}
		
		for (int i=0; i<N; i++) {
			System.out.print(rank[i] + " ");
		}
	}

}
