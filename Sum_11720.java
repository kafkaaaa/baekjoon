package stepbystep;

// N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ� //

import java.util.Scanner;

public class Sum_11720 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); 				// �׽�Ʈ ���̽��� ���� N
		int sum = 0;
		String str = scan.next();
		
		for (int i=0; i<N; i++) {
			sum += Integer.parseInt(str.substring(i, i+1)); 
			// Integer.parseInt(string) -> string(���ڿ�)�� 10���� int������ ��ȯ
			// Integer.parseInt(string, int radix) -> �ش� ����(radix)�� ���� int������ ��ȯ
		}
			// substring -> ���ڿ� ���� �޼ҵ� (�κ� ���ڿ� ��ȯ)
			// substring(start, end) -> start ��ġ ���� end ������ ���ڿ� ����
			System.out.println(sum);
	}
}