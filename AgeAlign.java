package stepbystep;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AgeAlign {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();		// N : ȸ�� ��
		
		String[][] info = new String[N][2];	// ���̿� �̸��� ������ 2���� String�迭
		
		for (int i=0; i<N; i++) {
			info[i][0] = scan.next();
			info[i][1] = scan.next();
		}
		
		// ����(info[i][0]) �����θ� �����ϸ� �ȴ�. (�Է½� �̹� ���Լ����� �Է��ϱ� ����)
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
