package stepbystep;


import java.util.Scanner;

// 정수론 및 조합론 - 이항 계수 2 : 파스칼의 삼각형
// https://www.acmicpc.net/problem/11051

public class BiCoef2_11051 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		sc.close();
		
		int[][] fascal = new int[N+1][N+1];

		/*  Solve : 파스칼의 삼각형 이용
		 *  nCr = n-1Cr-1 + n-1Cr
		 *  ex) 5C2 = 4C1 + 4C2    */
		 
		for (int i=0; i<=N; i++) {	
			for (int j=0; j<=i; j++) {
				if (i == j || j == 0)
					fascal[i][j] = 1;
				else
					fascal[i][j] = fascal[i-1][j-1] + fascal[i-1][j];
				
				fascal[i][j] %= 10007;
			}
		}
		
		System.out.println(fascal[N][K]);
	}

}
