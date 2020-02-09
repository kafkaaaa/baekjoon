package stepbystep;

import java.util.Scanner;

public class Num_2577 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int count = 0;
		
		int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for (int i = 0; i < num.length; i++) {
			int x = A * B * C;
			count = 0;							// count를 다시 0으로 초기화
			
			while (x != 0) {					// A*B*C가 0이 되기전까지 반복
				if(x % 10 == num[i]) { 			// num[0] ~ num[9] 비교
					count++;
				}
				x = x/10;						// 10으로 나눠서 한자리씩 지워나감
			}
			System.out.println(count); 			// 숫자의 개수 (count) 반복 출력 (0~9)
		}
		
	}
	
}