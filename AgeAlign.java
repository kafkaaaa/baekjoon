package stepbystep;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AgeAlign {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();		// N : 회원 수
		
		String[][] info = new String[N][2];	// 나이와 이름을 저장할 2차원 String배열
		
		for (int i=0; i<N; i++) {
			info[i][0] = scan.next();
			info[i][1] = scan.next();
		}
		
		// 나이(info[i][0]) 순으로만 정렬하면 된다. (입력시 이미 가입순으로 입력하기 때문)
		Arrays.sort(info, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});
		
		for (int i=0; i<N; i++) {
			System.out.println(info[i][0] + " " + info[i][1]);
		}

	}

}
