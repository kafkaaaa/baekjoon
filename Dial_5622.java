package stepbystep;

import java.util.Scanner;

public class Dial_5622 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String Phone_Num = scan.nextLine();
		// ABC=2, DEF=3, GHI=4, JKL=5, MNO=6, PQRS=7, TUV=8, WXYZ=9
		int[] time = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
		int result = 0;
		
		for (int i=0; i<Phone_Num.length(); i++) {
			result += time[Phone_Num.charAt(i) - 65];		// 65 : A�� �ƽ�Ű �ڵ尪
		}
		System.out.println(result + Phone_Num.length());
		// ABC = 3��, DEF = 4��, GHI = 5��... -> �� ���ں��� 1�ʾ� �� �ɸ��Ƿ� ��ȭ��ȣ ���̸�ŭ ������
	}
}
