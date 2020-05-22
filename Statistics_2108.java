package stepbystep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Statistics_2108 {
	static Scanner scan = new Scanner(System.in);
	static int N = scan.nextInt();	// n : 수의 개수
									// n은 홀수라고 가정
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

	// 산술평균
	static int avg(int[] num) {
		int sum = 0;
		for (int i=0; i<num.length; i++) {
			sum += num[i];
		}
		
		// 여기서 음수값에 대한 반올림을 생각하지 못해서 틀렸다.
		// return Math.round(sum / num.length); -> 음수값을 넣으면 반올림이 제대로 되지 않음
		return (int)Math.round((double)sum/N);
	}
	
	// 중앙값
	static int mid(int[] num) {
		Arrays.sort(num);	// 오름차순으로 정렬
		return num[(num.length / 2 + 1) -1];
	}
	
	// 최빈값
	static int mode(int[] num) {
		int[] cnt = new int[8001];	// 해당하는 수가 있으면 cnt[수]++
		ArrayList<Integer> list = new ArrayList<Integer> ();
		
		for (int i : num) {
			if (i<0) {	// 음수일 경우 4000을 더해서 해당 인덱스 증가
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
				if (i>4000) {	// 4000 이상은 음수를 변경한것이므로 다시 원래 숫자로 변경
					x -= 4000;
					x *= -1;
					list.add(x);
				}
				else list.add(i);
			}
		}
		Collections.sort(list);	// 오름차순 정렬
		
		if (list.size() > 1)
			return list.get(1);
		else
			return list.get(0);
		
	}
	
	// 최소값
	static int min(int[] num) {
		int minVal = num[0];
		for (int i=1; i<num.length; i++) {
			if ( minVal > num[i] ) minVal = num[i];
		}
		return minVal;
	}
	
	// 최대값
	static int max(int[] num) {
		int maxVal = num[0];
		for (int i=1; i<num.length; i++) {
			if (maxVal < num[i]) maxVal = num[i];
		}
		return maxVal;
	}
	
	// 범위
	static int range(int[] num) {
		return ( max(num) - min(num) );
	}
	
}
