package stepbystep;

import java.util.Arrays;
import java.util.Scanner;

public class Star_2447 {
	
	public static char[][] star;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		star = new char[N][N];			// N * N �迭 ����
		
		for (char[] arr : star) {				// 2�����迭 star�� ����(' ') ���� �ʱ�ȭ
			Arrays.fill(arr, ' ');				// for-in���� ���
		}
		
	/*	for (int i=0; i<star.length; i++) {		// �Ϲ� for���� ����� ��. �� �پ� ��� ����(' ')���� �ʱ�ȭ
			Arrays.fill(star[i], ' ');
		}
	*/
		
		draw_Star(0, 0, N);
		
		for (int i=0; i<star.length; i++) {		// star.length ��� N�� �ᵵ �ȴ�.
			System.out.println(star[i]);
		}		
	}

// 3x3 ���� ����� ����Լ� //
// ��� ȣ�� �� ���� �������� �Űܼ� ���� 3x3�� ����� �ݺ����ش� //

	public static void draw_Star(int x, int y, int n) {
	
		if (n == 1) {
			star[x][y] = '*';
			return;
		}
	
		int z = n / 3;
	
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (i == 1 && j == 1) continue;
				else draw_Star(x+(z*i), y+(z*j), z); 
			}
		}
	}

}		