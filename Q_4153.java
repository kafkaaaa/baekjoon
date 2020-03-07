package stepbystep;

import java.util.Arrays;
import java.util.Scanner;

public class Q_4153 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] len = new int[3];
		
		while (true) {
			for (int i=0; i<3; i++)
				len[i] = scan.nextInt();
			
			if (len[0] == 0 && len[1] == 0 && len[2] == 0) break;
		
			Arrays.sort(len);
		
			// �迭 �������� ���� : Arrays.sort(ArrayName);
			// �迭 �������� ���� : Arrays.sort(ArrayName, Collections.reverseOrder());
			// �ڡ� import java.util.Arrays; �ʿ�
		
			if (len[0]*len[0] + len[1]*len[1] == len[2]*len[2])
				System.out.println("right");
			else
				System.out.println("wrong");
		}
		
	}

}
