package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// DP (Dynamic Programming)

public class StairClimbing_2579 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int nOfStairs = Integer.parseInt(br.readLine());
		int[] score = new int[nOfStairs + 1];
		int[] max = new int[nOfStairs + 1]; // maxScore until 'N'th stair

		for (int i = 1; i <= nOfStairs; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}

		max[0] = 0;
		max[1] = score[1];
		
		if (nOfStairs >= 2) max[2] = score[1] + score[2];

		for (int i = 3; i <= nOfStairs; i++) {

			int case1 = score[i] + score[i - 1] + max[i - 3];
			int case2 = score[i] + max[i - 2];

			max[i] = Math.max(case1, case2);
		}
	
		System.out.println(max[nOfStairs]);
	}

}
