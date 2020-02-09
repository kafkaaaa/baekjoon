package stepbystep;

import java.util.Scanner;

public class Remainder_3052 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[10];
		int[] remainder = new int[10];
		int count = 10;
		
		for (int i=0; i<10; i++) {
			num[i] = scan.nextInt();
			remainder[i] = num[i] % 42;
		}
		
		for (int i=0; i<10; i++) {
			for (int j=0; j<i; j++) {
				if(remainder[i] == remainder[j]) {		// 나머지 비교
					count--;
					break;
				}
			}
		}
		System.out.println(count);
	}

}