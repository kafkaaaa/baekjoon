package stepbystep;

import java.util.Arrays;
import java.util.Scanner;

public class SortInside_1427 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String N = scan.nextLine();
		int len = N.length();
		char[] num1 = new char[N.length()];
		int[] num2 = new int[N.length()];
		
		for (int i=0; i<len; i++) {
			num1[i] = N.charAt(i);		// �Է¹��� ���� �� ���ھ� �迭�� ����
			num2[i] = num1[i] - '0';	// �� ���ڸ� ���ڷ� ��ȯ
		}
		
		// �������� ����
		Arrays.sort(num2);
		
		// �������� ������ ���� ����ؾ� �ϹǷ� �������� ...
		for (int i=len-1; i>=0; i--) {
			System.out.print(num2[i]);
		}

	}

}
