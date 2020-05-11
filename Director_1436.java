package stepbystep;

import java.util.Scanner;

public class Director_1436 {		// 브루트 포스

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		
		int num = 0;
		while(N > 0) {		// N이 0이 됬을때가 N번째로 "666"을 포함한 숫자	
			num++;	// 숫자(num)를 하나씩 증가시키면서 찾는다
			// 문자열로 변환해서 "666"이 포함되면 N--;
			// toString() 보다는 String.valueOf()를 사용하자
			// NullPointerException 방지
			if (String.valueOf(num).contains("666")) N--;
		}
		System.out.println(num);
		
	}

}
