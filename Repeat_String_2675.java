package stepbystep;

import java.util.Scanner;

public class Repeat_String_2675 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();					// T : �׽�Ʈ ���̽��� ��
		
		for (int i=0; i<T; i++) {
			int R = scan.nextInt();				// R : �ݺ� Ƚ��
			String S = scan.next();				// S : �ݺ� �� ���ڿ�
			
			for (int j=0; j<S.length(); j++) {
				for (int k=0; k<R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.print("\n");
		}
	}
}