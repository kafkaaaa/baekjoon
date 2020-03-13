package stepbystep;

import java.util.Scanner;

public class Hanoi_Tower_11729 {
	
	public static int N = 0;			//  원판의 개수 N
	public static int count = 0;		// 	옮긴 횟수 count
	public static StringBuilder sb = new StringBuilder();
	
	
	public static void Hanoi(int n, int from, int to, int X) {
		if (n == 0)
			return;
		else {
			count++;
			Hanoi(n-1, from, X, to);			// n-1개의 원판을 from에서 X로 옮긴다
			
			sb.append(from + " " + to + "\n");		// 이동 경로 출력
			// append : v.덧붙이다, 첨부하다
			
			Hanoi(n-1, X, to, from);			// n-1개의 원판을 X에서 to로 옮긴다
		}
	}

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		Hanoi(N, 1, 3, 2);
		
		System.out.println(count);
		System.out.println(sb);

	}

}
