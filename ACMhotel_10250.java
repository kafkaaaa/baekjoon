package stepbystep;

import java.util.Scanner;

public class ACMhotel_10250 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for (int i=0; i<T; i++) {
			int H = scan.nextInt();
			int W = scan.nextInt();
			int N = scan.nextInt();
			
			int floor = N % H;		// �� ��
			int room = N / H + 1;	// ȣ ��
			
			if (N % H == 0) {
				floor = H;
				room = N / H;
			}
			System.out.println(floor*100 + room);	// YXX or YYXX ���·� ���
	}

	}
}
