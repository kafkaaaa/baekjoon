package test0;

import java.util.Scanner;

public class Test03 {

	// �ؽð����� 0.15��
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();	// ���� �ö󰡴� ����
		int B = scan.nextInt();	// �㿡 �������� ����
		int V = scan.nextInt();	// �ö󰡾��� ����
		
		int height = 0;	// �ö� ����
		int day = (V-B) / (A-B);	// �����¥
		
		if ( (V-B) % (A-B) != 0 ) {
			day++;
		}
		
		System.out.println(day);
	}

}
