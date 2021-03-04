package stepbystep;

import java.util.Scanner;

// Divide & Conquer (분할 정복) : 피보나치 수열 - **행렬을 이용한 방법
// https://www.acmicpc.net/problem/11444
// **Ref : https://www.acmicpc.net/blog/view/28, https://gre-eny.tistory.com/94

public class Fiboancci_11444 {
	
	final static int MOD = 1000000007;
	static long[][] matrix = { {1, 1}, {1, 0} };
	static long[][] result;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();	// n은 1,000,000,000,000,000,000보다 작거나 같은 자연수
		scan.close();				// n번째 피보나치 수를 1,000,000,007으로 나눈 나머지를 구하는 문제
		
		// f(n+2) = f(n+1) + f(n)
		// f(n+1) = f(n+1)
		// 위 식을 행렬로 나타내면..
		// ( f(n+2) ) = ( 1 1 ) ( f(n+1) )
		// ( f(n+1) )   ( 1 0 ) (  f(n)  )
		// 위 식을 정리하면
		// (  f(n)  ) = ( 1 1 ) ^n-1 * ( f(1) )
		// ( f(n-1) )   ( 1 0 )        ( f(0) )
		
		if (n == 1) System.out.println(1);
		else {
			result = pow(n-1);
			System.out.println(result[0][0]);
		}
	}
	
	static long[][] pow(long n) {
		
		long[][] res = new long[2][2];
		
		if (n == 1) {
			for (int i=0; i<2; i++) {
				for (int j=0; j<2; j++)
					res[i][j] = matrix[i][j];
			}
			return res;
		}
		
		long[][] temp = pow(n/2);
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				for (int k=0; k<2; k++) {
					res[i][j] += temp[i][k] * temp[k][j];
				}
				res[i][j] %= MOD;
			}
		}
		
		if (n % 2 == 1) {
			long[][] tmp = new long[2][2];
			
			for (int i=0; i<2; i++) {
				for (int j=0; j<2; j++) {
					for (int k=0; k<2; k++) {
						tmp[i][j] += res[i][k] * matrix[k][j];
					}
					tmp[i][j] %= MOD;
				}
			}
			return tmp;
		} else return res;
	}

}
