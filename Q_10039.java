package stepbystep;

import java.util.Scanner;

public class Q_10039 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] score = new int[5];
		int sum = 0;
		
		for (int i=0; i<5; i++) {
			int temp = scan.nextInt();
			if (temp < 40) temp = 40;
			score[i] = temp;
			sum += score[i];
		}
		System.out.println(sum / 5);
	}

}
