package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Stack
// https://www.acmicpc.net/problem/10773

public class Zero_10773 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		int[] num = new int[K];
		int idx = 0;
		int sum = 0;
		
		for (int i=0; i<K; i++) {
			int input = Integer.parseInt(br.readLine());
			
			if (input == 0) {
				idx--;
			}
			else {
				num[idx++] = input;
			}
		}
		
		for (int i=0; i<idx; i++) {
			sum += num[i];
		}
		
		System.out.println(sum);
	}

}
