package stepbystep;

import java.util.Scanner;

// 정수론 및 조합론
// https://www.acmicpc.net/problem/3036

public class Ring_3036 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 링의 개수
		
		int[] radius = new int[n];
		for (int i=0; i<n; i++) {
			radius[i] = sc.nextInt();
		}
		sc.close();
		
		// 기약 분수 형태로 출력하기 위해
		// 두 수의 최대공약수로 나눠준 값을 출력한다
		for (int i=1; i<n; i++) {
			int GCD = getGCD(radius[0], radius[i]); 
			int A = radius[0] / GCD;
			int B = radius[i] / GCD;
			System.out.println(A + "/" + B);
		}
	}
		
	// 최대공약수
	static int getGCD(int a, int b) {
	
		if (a % b == 0) return b;
		else return getGCD(b, a % b);
	}

}
