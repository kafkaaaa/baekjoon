package stepbystep;

import java.util.Scanner;

public class Geometry {
	
	// ��Ŭ���� �����п����� ���� ���� -> PI*R^2
	// �ý� �����п����� ���� ���� -> �밢���� ���̰� 2R�� ���簢��(������) -> 2R * 2R / 2 = 2R^2

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt();
		
		System.out.printf("%.6f\n", (double) Math.PI * R * R);
		System.out.printf("%.6f", (double) 2 * R * R);
	}

}
