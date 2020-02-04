package stepbystep;

import java.util.Scanner;

public class Add_Cycle_1110 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int x = N/10; // 십의 자리 수
		int y = N%10; // 일의 자리 수
		int cnt = 0;
	
		while(true) {
			
			int temp_x = x;
			x = y;
			y = (temp_x + y)%10;
					
			cnt++;
			
			if (N == 10*x + y)
				break;
			}
		
		System.out.println(cnt);
		}	
}