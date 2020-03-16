package stepbystep;

import java.util.Scanner;

public class Q_2231 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int result = 0;
		
		for (int i=1; i<=N; i++) {	// 최소값인 1부터 하나씩 증가시키면서 분해합(result)이 N과 일치 할때 멈춘다
			if (get_Decom_Sum(i) == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
				
	}
	
	public static int get_Decom_Sum(int x) {		// 분해합 값을 반환하는 함수
		String str = String.valueOf(x);
		int temp = x;		// 분해합을 구할 때 원래 값을 저장하기 위한 temp
		
		for (int i=0; i<str.length(); i++) {
			temp += str.charAt(i) - '0';		// char값이지만 int로 계산하기 위해   -'0';
												// 		- 48  을 해도 된다. ('0'의 아스키코드 값 : 48)
		}
		return temp;
	}

}
