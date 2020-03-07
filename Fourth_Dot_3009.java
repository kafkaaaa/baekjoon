package stepbystep;

import java.util.Scanner;

public class Fourth_Dot_3009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] x = new int[3];
		int[] y = new int[3];
		int remain_x, remain_y = 0;		// 네 번째 점의 x,y 좌표 
		
		for (int i=0; i<3; i++) {		// 입력받은 세 점의 좌표를 x[0~2], y[0~2] 배열에 저장
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}
		
		if (x[0] == x[1])	// 1번점과 2번점의 x좌표가 같다면 주어진 세 점을 제외한 나머지 한 점의 x좌표는 3번 점의 x좌표와 같다
			remain_x = x[2];
		else				// 2번점과 3번점의 x좌표가 같다면 -> 1번 점의 x좌표와 같다 / 아니면 -> 2번 점의 x좌표와 같다
			remain_x = (x[1] == x[2]) ? x[0] : x[1];
		
		// y좌표도 x좌표와 같은 방법으로
		if (y[0] == y[1])	
			remain_y = y[2];
		else				
			remain_y = (y[1] == y[2]) ? y[0] : y[1];
			
		System.out.println(remain_x + " " + remain_y);
	}

}
