package stepbystep;

// Divide & Conquer (분할 정복) : 확장 유클리드 알고리즘
// https://www.acmicpc.net/problem/11401
// *Ref : https://www.acmicpc.net/blog/view/29

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BiCoef3_11401 {
	
	final static int M = 1000000007;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		long A = factorial(N);							// N!
		long B = ( factorial(N-K) * factorial(K) ) % M;	// (N-K)! x K! mod M
		long C = pow(B, M-2);							// B^(M-2) : 페르마의 소정리
		long result = (A * C) % M;						// N! x ((N-K)! x K!) : M은 prime number
		
		System.out.println(result);
	}
	
	static long pow(long x, int m) {
		
		long result = 1;
		
		while (m > 0) {
			if (m % 2 != 0) {
				result *= x;
				result %= M;
			}
			x *= x;
			x %= M;
			m /= 2;
		}
		return result;
	}
	
	static long factorial(int x) {
	
		long result = 1;
		
		for (int i=2; i<=x; i++) {
			result *= i;
			result %= M;
		}
		return result;
	}

}
