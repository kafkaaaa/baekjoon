package stepbystep;

import java.util.Scanner;
import java.math.*;

public class Q_1011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for (int i=0; i<T; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			long dis = y - x;							// distance. �� ���� ������ �Ÿ�(y-x)
			double sqrt_dis = Math.sqrt(dis);			// y-x�� ������
			int tmp = (int) Math.round(Math.sqrt(dis));	// sqrt(y-x)�� �ݿø� �� ��
			
			if (sqrt_dis <= tmp)
				System.out.println(2*tmp - 1);
			else
				System.out.println(2*tmp);
			
		}
	}
}