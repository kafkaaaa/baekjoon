package stepbystep;

import java.util.Scanner;

public class Fourth_Dot_3009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] x = new int[3];
		int[] y = new int[3];
		int remain_x, remain_y = 0;		// �� ��° ���� x,y ��ǥ 
		
		for (int i=0; i<3; i++) {		// �Է¹��� �� ���� ��ǥ�� x[0~2], y[0~2] �迭�� ����
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}
		
		if (x[0] == x[1])	// 1������ 2������ x��ǥ�� ���ٸ� �־��� �� ���� ������ ������ �� ���� x��ǥ�� 3�� ���� x��ǥ�� ����
			remain_x = x[2];
		else				// 2������ 3������ x��ǥ�� ���ٸ� -> 1�� ���� x��ǥ�� ���� / �ƴϸ� -> 2�� ���� x��ǥ�� ����
			remain_x = (x[1] == x[2]) ? x[0] : x[1];
		
		// y��ǥ�� x��ǥ�� ���� �������
		if (y[0] == y[1])	
			remain_y = y[2];
		else				
			remain_y = (y[1] == y[2]) ? y[0] : y[1];
			
		System.out.println(remain_x + " " + remain_y);
	}

}
