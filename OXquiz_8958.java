package stepbystep;

import java.util.Scanner;

public class OXquiz_8958 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		String[] arr = new String[T+1];
		
		for (int i=0; i<T; i++) {
			
			arr[i] = scan.next();
			
			int cnt = 0;
			int sum = 0;
			
			for (int j=0; j<arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					cnt++;
					sum += cnt;
				}
				else cnt = 0;
			}
			System.out.println(sum);
		}
	}
}