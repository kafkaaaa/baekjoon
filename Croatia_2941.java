package stepbystep;

import java.util.Scanner;

public class Croatia_2941 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		String[] croa_alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for (int i=0; i<croa_alpha.length; i++) {
			s = s.replace(croa_alpha[i], "x");		// 기존 크로아티아 알파벳단위별로 1개씩 모두 x로 변경
		}
			System.out.println(s.length());			// 개수 출력
		
	}

}
