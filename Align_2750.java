package stepbystep;

import java.util.Arrays;
import java.util.Scanner;

//N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

public class Align_2750 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int [] num = new int[N];
		for (int i=0; i<N; i++) {
			num[i] = scan.nextInt();
		}
		scan.close();
		Arrays.sort(num);
		
		for (int i=0; i<N; i++) {
			System.out.println(num[i]);
		}
	}

}
