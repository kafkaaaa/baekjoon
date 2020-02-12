package stepbystep;

import java.util.Arrays;

/*
#����
���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�,
�ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

#�Է�
ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
*/			

import java.util.Scanner;

public class Find_Alphabet_10809 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		// next() -> ����(��)�� '����'�� �������� �� ����(�ܾ�)�� �Է� �޴´�.
		// nextLine() -> �� ���� ��ü�� �Է� �޴´�.
		scan.close();
		
		int[] alphabet = new int[26];			// a~z ���ĺ� ������ �迭]
		Arrays.fill(alphabet, -1);				// alphabet �迭�� ��� -1�� �ʱ�ȭ
		
		for (int i=0; i<S.length(); i++) {
			char ch = S.charAt(i);				// �Է¹��� ���ڿ��� �� ���ھ� ������� char�� ���� ch�� ����
			int temp = (int)ch;					// temp : �ش��ϴ� ���ĺ��� �ƽ�Ű�ڵ尪
			if (alphabet[temp-97] == -1) {		// temp�� �� ����(���ĺ�)�� �ƽ�Ű�ڵ尪�̹Ƿ� 'a'�� �ƽ�Ű�ڵ尪�� 97�� ���ָ� alphabet[0~25]�迭�� ù ��° ������ ����(i)�� ����ȴ�. 
				alphabet[temp-97] = i;
			}
		}
		
		for (int i=0; i<alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
	}
}