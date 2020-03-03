package stepbystep;

import java.util.Scanner;

public class Q_4948 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int n = 1;
		
		while (true) {
			n = scan.nextInt();
			if (n == 0) break;
			for (int i=n+1; i<=2*n; i++) {
				if(IsPrime(i)) cnt++;
			}
			System.out.println(cnt);
			cnt = 0;	// ī��Ʈ �ʱ�ȭ
		}
	}

	public static boolean IsPrime(int num) {
		if (num<2) return false;		// 1���ϴ� �Ҽ��� �ƴϴ�
			
		for (int i=2; i<=(int)Math.sqrt(num); i++)
			if (num % i == 0) return false;
			
		return true;
	}	
	
}
