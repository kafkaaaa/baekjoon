package stepbystep;

import java.util.Scanner;

public class Max_Min_10818 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int [] num = new int[N];
		int max = -1000000;			// �ִ밪 max�� �ּҰ����� �����Ͽ� ��
		int min = 1000000;			// �ּҰ� min�� �ִ밪���� �����Ͽ� ��
		
		for (int i=0; i<N; i++) {
			num[i] = scan.nextInt();
			max = Math.max(max, num[i]);
			min = Math.min(min, num[i]);
		}
		
		System.out.println(min + " " + max);
		
		}

}