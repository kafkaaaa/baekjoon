package stepbystep;

import java.util.Scanner;

public class Break_even_point_1712 {		// Break-even point : 손익분기점

	public static void main(String[] args) {
/*
	A : 고정 비용 : 임대료 + 재산세 + 보험료 + 급여
	B : 가변 비용 : 재료비 + 인건비
	C : 노트북 1대의 판매가격
	n : 노트북 판매 대수
	ex)	1대의 노트북을 생산하는 데 드는 비용 -> A+B, 10대의 노트북을 생산하는 데 드는 비용 -> A+10B
	손익분기점(Break-even point) : A + n*B < n*C 가 되는 지점
								0 <	A < n*(C-B)
							↙                 				    ↘
	0 <	A/n < C-B 이므로  C>B 이어야 한다.					0 < A/(C-B) < n
*/
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int result;
		
		if (C <= B)
			System.out.println(-1);
		else
			System.out.println(A / (C-B) + 1);
			//	17행  0 < A/(C-B) < n 에서 손익분기점이 되는 노트북 판매 대수 n은 
			//			A/(C-B) 보다 큰 수중 가장 작은 수 이므로 1을 더해주는것이다
			

	}

}
