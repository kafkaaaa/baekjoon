package stepbystep;

import java.util.Scanner;

public class Croatia_2941 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		String[] croa_alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for (int i=0; i<croa_alpha.length; i++) {
			s = s.replace(croa_alpha[i], "x");		// ���� ũ�ξ�Ƽ�� ���ĺ��������� 1���� ��� x�� ����
		}
			System.out.println(s.length());			// ���� ���
		
	}

}
