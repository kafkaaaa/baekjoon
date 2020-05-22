package stepbystep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Statistics_2108 {
	static Scanner scan = new Scanner(System.in);
	static int N = scan.nextInt();	// n : ���� ����
									// n�� Ȧ����� ����
	static int[] numbers = new int[N];
	
	public static void main(String[] args) {
		for (int i=0; i<N; i++) {
			numbers[i] = scan.nextInt();
		}
		scan.close();
		
		System.out.println(avg(numbers));
		System.out.println(mid(numbers));
		System.out.println(mode(numbers));
		System.out.println(range(numbers));
	}

	// ������
	static int avg(int[] num) {
		int sum = 0;
		for (int i=0; i<num.length; i++) {
			sum += num[i];
		}
		
		// ���⼭ �������� ���� �ݿø��� �������� ���ؼ� Ʋ�ȴ�.
		// return Math.round(sum / num.length); -> �������� ������ �ݿø��� ����� ���� ����
		return (int)Math.round((double)sum/N);
	}
	
	// �߾Ӱ�
	static int mid(int[] num) {
		Arrays.sort(num);	// ������������ ����
		return num[(num.length / 2 + 1) -1];
	}
	
	// �ֺ�
	static int mode(int[] num) {
		int[] cnt = new int[8001];	// �ش��ϴ� ���� ������ cnt[��]++
		ArrayList<Integer> list = new ArrayList<Integer> ();
		
		for (int i : num) {
			if (i<0) {	// ������ ��� 4000�� ���ؼ� �ش� �ε��� ����
				cnt[Math.abs(i)+4000] ++;
			}
			else cnt[i]++;
		}
		
		int maxValue = 0;
		int index = 0;
		for (int i=0; i<cnt.length; i++) {
			if (cnt[i] != 0 && cnt[i] > maxValue) {
				maxValue = cnt[i];
				index = i;
			}
		}
		
		for (int i=0; i<cnt.length; i++) {
			int x = i;
			if (cnt[i] == maxValue) {
				if (i>4000) {	// 4000 �̻��� ������ �����Ѱ��̹Ƿ� �ٽ� ���� ���ڷ� ����
					x -= 4000;
					x *= -1;
					list.add(x);
				}
				else list.add(i);
			}
		}
		Collections.sort(list);	// �������� ����
		
		if (list.size() > 1)
			return list.get(1);
		else
			return list.get(0);
		
	}
	
	// �ּҰ�
	static int min(int[] num) {
		int minVal = num[0];
		for (int i=1; i<num.length; i++) {
			if ( minVal > num[i] ) minVal = num[i];
		}
		return minVal;
	}
	
	// �ִ밪
	static int max(int[] num) {
		int maxVal = num[0];
		for (int i=1; i<num.length; i++) {
			if (maxVal < num[i]) maxVal = num[i];
		}
		return maxVal;
	}
	
	// ����
	static int range(int[] num) {
		return ( max(num) - min(num) );
	}
	
}
