package stepbystep;

import java.util.Scanner;

public class Q_1316 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();		// N : �Է¹��� �ܾ��� ����
		int count = N;				// count : '�׷� �ܾ�'�� ����. ��ü ����(N)���� if���� ���� count--;
		
		for (int i = 0; i < N; i++) {				// N���� word�� �Է¹޴´�
			String word = scan.next();
			boolean[] check = new boolean[26];		// ������ ���ĺ��� true�� ������ �迭. boolean Ÿ������ ����
			
			for (int j = 1; j < word.length(); j++) {		// �ܾ��� 2��° ���ں��� �ܾ� ������ �ݺ��ϸ� �˻�
				if (word.charAt(j) != word.charAt(j-1)) {		// �յ� ���ڰ� �ٸ���..
					if (check[word.charAt(j) - 97] == true) {	// ���� ���ڰ� ������ �����ߴٸ�..
						count--;								// �׷�ܾ �ƴϹǷ� ���� -1
						break;									// �̹� �׷�ܾ �ƴϹǷ� �� �ڴ� �˻��� �ʿ䰡 ����.
					}
					check[word.charAt(j-1) - 97] = true;	// ���� �˻����� ���ĺ��� true�� ����
				}
			}
		}
		System.out.println(count);
			
	}

}
