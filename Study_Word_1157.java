package stepbystep;

import java.util.Scanner;

public class Study_Word_1157 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next().toUpperCase();	// �Է¹��� �ܾ ��� �빮�ڷ� �ٲ��ش�
		
		int[] alpha = new int[26];					// A~Z�� ���� ������ ������ �迭
		int max = 0;								// ���� ���� ���� ���ĺ��� ������ ������ max
		char result = ' ';
		
		for (int i=0; i<word.length(); i++) {
			alpha[word.charAt(i) - 65]++;			// A�� �ƽ�Ű�ڵ�� 65�̹Ƿ� .. 
			if (max < alpha[word.charAt(i) - 65])
			{
				max = alpha[word.charAt(i) - 65];
				result = word.charAt(i);
			}
			else if (max == alpha[word.charAt(i) - 65])
			{
				result = '?';
			}
		}
		System.out.println(result);
		
	}

}
