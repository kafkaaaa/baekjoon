package stepbystep;

import java.util.Scanner;

public class Director_1436 {		// ���Ʈ ����

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		
		int num = 0;
		while(N > 0) {		// N�� 0�� �������� N��°�� "666"�� ������ ����	
			num++;	// ����(num)�� �ϳ��� ������Ű�鼭 ã�´�
			// ���ڿ��� ��ȯ�ؼ� "666"�� ���ԵǸ� N--;
			// toString() ���ٴ� String.valueOf()�� �������
			// NullPointerException ����
			if (String.valueOf(num).contains("666")) N--;
		}
		System.out.println(num);
		
	}

}
