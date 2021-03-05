package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이분 탐색 (Binary Search) : 배열을 정렬한 후 이분 탐색으로 값 찾기 O(log n)
// https://www.acmicpc.net/problem/1920

public class Q_1920 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr1 = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr1);			// 이진탐색을 위해 미리 오름차순 정렬
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr2 = new int[M];
		for (int i=0; i<M; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i=0; i<M; i++) {
			if (isExist(arr1, arr2[i])) 
				System.out.println(1);
			else 
				System.out.println(0);
		}
		
	}
	
	// arr배열에 num이 존재하는가? 
	static boolean isExist(int[] arr, int num) {
		
		// 탐색 대상 인덱스 설정
		int min = 0;
		int max = arr.length - 1;
		int mid = 0;
		
		while (min <= max) {
			
			mid = (min + max) / 2;
			if (arr[mid] == num) return true;
			else if (arr[mid] < num)
				min = mid + 1;
			else 
				max = mid - 1;
		}
		
		return false;		// 찾는 값이 없으면
	}
			
}

// ** Arrays.binarySearch() 메소드를 사용해도 된다.
// 값이 존재하면 해당 인덱스 값을, 존재하지 않으면 음수 반환