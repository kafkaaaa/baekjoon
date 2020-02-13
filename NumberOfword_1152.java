package stepbystep;

import java.util.Scanner;

public class NumberOfword_1152 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine().trim();		// .trim() -> �յ� ���� ����
		
		if (word.isEmpty()) {
			System.out.println(0);
		}
		else {
			System.out.println(word.split(" ").length);
		}
	}
}

		
/*  ver2 (StringTokenizer ���)

import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberOfword_1152 {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        StringTokenizer strToken = new StringTokenizer(word, " ");
        							// StringTokenizer : ���ڿ� word�� " "(����)�� �������� ����
        System.out.println(strToken.countTokens());
        							// countTokens() : ������ �ܾ��� ������ ��ȯ
    }
}
	
*/