package test0;

import java.util.Scanner;

public class test04 {	// �� brute-force

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();	// ī�� ���� N
		int M = scan.nextInt();	// ī�� 3���� �� M
		int[] num = new int[N];	// ī���� ���ڸ� ������ �迭
		
		for (int i=0; i<N; i++) {
			num[i] = scan.nextInt();
		}
		
		int sum = 0;	// ī�� 3���� ���� ����
		int temp = 0;	// M���� ���� ����� sum�� ����
		
		for (int i=0; i<N-2; i++) {
			for (int j=i+1; j<N-1; j++) {
				for (int k=j+1; k<N; k++) {
					sum = num[i]+num[j]+num[k];
					if (sum <= M && sum > temp) {
						temp = sum;
					}
				}
			}
		}
		System.out.println(temp);
		
	}

}
