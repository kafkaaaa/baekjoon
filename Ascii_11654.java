package stepbystep;

import java.util.Scanner;

public class Ascii_11654 {
	
// ���ĺ� �ҹ���, �빮��, ���� 0-9�� �ϳ��� �־����� ��, �־��� ������ �ƽ�Ű �ڵ尪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ� //
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char c = str.charAt(0); 	// charAt(index) -> index��° ���ڸ� ��ȯ, index�� 0���� ����
									// str.charAt(0) -> ���ڿ� str�� ù��° ���ڸ� ��ȯ

		System.out.println( (int)c );
	}

}