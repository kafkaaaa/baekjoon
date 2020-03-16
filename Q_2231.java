package stepbystep;

import java.util.Scanner;

public class Q_2231 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int result = 0;
		
		for (int i=1; i<=N; i++) {	// �ּҰ��� 1���� �ϳ��� ������Ű�鼭 ������(result)�� N�� ��ġ �Ҷ� �����
			if (get_Decom_Sum(i) == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
				
	}
	
	public static int get_Decom_Sum(int x) {		// ������ ���� ��ȯ�ϴ� �Լ�
		String str = String.valueOf(x);
		int temp = x;		// �������� ���� �� ���� ���� �����ϱ� ���� temp
		
		for (int i=0; i<str.length(); i++) {
			temp += str.charAt(i) - '0';		// char�������� int�� ����ϱ� ����   -'0';
												// 		- 48  �� �ص� �ȴ�. ('0'�� �ƽ�Ű�ڵ� �� : 48)
		}
		return temp;
	}

}
