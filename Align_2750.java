package stepbystep;

import java.util.Arrays;
import java.util.Scanner;

//N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class Align_2750 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int [] num = new int[N];
		for (int i=0; i<N; i++) {
			num[i] = scan.nextInt();
		}
		scan.close();
		Arrays.sort(num);
		
		for (int i=0; i<N; i++) {
			System.out.println(num[i]);
		}
	}

}
