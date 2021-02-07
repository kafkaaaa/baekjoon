package stepbystep;

// 기본 수학 1 - 큰 수 A+B  (0 < A,B < 10^10000) : BigInteger 활용
// https://www.acmicpc.net/problem/10757

import java.math.BigInteger;
import java.util.Scanner;

public class Q_10757 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		BigInteger A = scan.nextBigInteger();
		BigInteger B = scan.nextBigInteger();
		
		System.out.println(A.add(B));
	}

}
