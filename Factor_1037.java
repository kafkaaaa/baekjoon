package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 정수론 및 조합론
// https://www.acmicpc.net/problem/1037

public class Factor_1037 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nOfFactor = Integer.parseInt(br.readLine());
		
		int[] factor = new int[nOfFactor];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<factor.length; i++) {
			factor[i] = Integer.parseInt(st.nextToken());
		}
		// Solve : '진짜'약수들을 오름차순 정렬하고, 가장 큰 수와 가장 작은 수를 곱해주면 된다
		Arrays.sort(factor);
		System.out.println(factor[0] * factor[nOfFactor-1]);
	}

}
