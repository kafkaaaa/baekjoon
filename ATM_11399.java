package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Greedy Algorithm
// https://www.acmicpc.net/problem/11399

public class ATM_11399 {

	public static void main(String[] args) throws IOException {
		
		// Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] time = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			time[i] = Integer.parseInt(st.nextToken());
		}
		
		// Solve
		Arrays.sort(time);
		
		int waitingTime = 0;
		int sum = 0;
		
		for (int i=0; i<N; i++) {
			waitingTime += time[i];
			sum += waitingTime;
		}
		System.out.println(sum);
	}
	
}
