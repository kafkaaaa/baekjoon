package stepbystep;

import java.util.Arrays;
import java.util.Scanner;

public class Q_7568 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();			// N : ����� ��
		int[] weight = new int[N];		// weight[] : ������
		int[] height = new int[N];		// height[] : Ű
		int[] rank = new int[N];		// rank : ���
		Arrays.fill(rank, 1);			// ����� ��� 1�� �ʱ�ȭ

		
		for (int i=0; i<N; i++) {		// ����� �� ��ŭ �����Կ� Ű�� ���� �迭�� ����
			weight[i] = scan.nextInt();
			height[i] = scan.nextInt();
		}
		
		for (int i=0; i<N; i++) {		// ���� �����Կ� Ű�� ���ؼ� �Ѵ� ������ rank++
			for (int j=0; j<N; j++) {
				if (weight[i] < weight[j] && height[i] < height[j])
					rank[i]++;
			}
		}
		
		for (int i=0; i<N; i++) {
			System.out.print(rank[i] + " ");
		}
	}

}
