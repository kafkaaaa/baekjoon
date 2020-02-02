package stepbystep;

import java.util.Scanner;

public class Q_10871 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		int[] arr = new int[N];
		
		for (int i=0; i<N; i++) {
			arr[i] = scan.nextInt();
			if (arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}