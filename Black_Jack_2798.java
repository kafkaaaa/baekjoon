package stepbystep;

import java.util.Scanner;

public class Black_Jack_2798 {
	
	// ���Ʈ ���� �˰���(��ü Ž��)

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();		// N : ī���� ����
		int M = scan.nextInt();		// M : ī��3���� �ִ� ��
		
		int[] card = new int[N];	// ī���� ������ŭ int�� �迭 ����
		
		for (int i=0; i<N; i++) {
			card[i] = scan.nextInt();
		}
		
		int temp = 0;				// M���� ���� ����� sum�� �ӽ� ������ ����
		int sum = 0;				// ī�� 3���� ���� ������ ���� sum
		
	
		for (int i=0; i<N-2; i++) {
			for (int j=i+1; j<N-1; j++) {
				for (int k=j+1; k<N; k++) {
					sum = card[i] + card[j] + card[k];
					if (sum <= M && sum > temp) {			// temp < sum <= M
						temp = sum;
					}
				}
			}
		}
		
		System.out.println(temp);
	}

}
