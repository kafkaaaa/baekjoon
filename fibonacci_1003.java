package stepbystep;

import java.util.Scanner;

//★시간제한 주의 : 0.25초

public class fibonacci_1003 {
	static int count[][];	// 호출횟수를 저장할 배열. 0 <= n <= 41
		
	static void count0Fibo(int n) {		// fibo(0) 호출횟수 기록
		if (n >= 2)
			count[n][0] = count[n-2][0] + count[n-1][0];
	}
	
	static void count1Fibo(int n) {		// fibo(1) 호출횟수 기록
		if (n >= 2)
			count[n][1] = count[n-2][1] + count[n-1][1];
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();		// T : test case의 수
		
		count = new int[41][2];		// 호출횟수를 저장할 배열. 0 <= n <= 41
		count[0][0] = 1;	// 0과 1일때의 값은 미리 입력.
		count[1][0] = 0;

		count[0][1] = 0;
		count[1][1] = 1;
		
		for (int i=2; i<=40; i++) {		// fibo(0), fibo(1)의 호출횟수 기록. 40까지.
			count0Fibo(i);
			count1Fibo(i);
		}
		
		for (int i=0; i<T; i++) {		// 출력
			int n = scan.nextInt();
			System.out.println(count[n][0] + " " + count[n][1]);
		}
		
	}

}
