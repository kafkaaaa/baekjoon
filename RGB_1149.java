package stepbystep;

import java.io.*;

public class RGB_1149 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cost[][] = new int[N+1][3];	// RGB 비용, 0열 (첫번째 열)은 최소비용 저장 용도로 사용
	
		for (int i=1; i<=N; i++) {
			String[] tmp = br.readLine().split(" ");
			int r = Integer.parseInt(tmp[0]);
			int g = Integer.parseInt(tmp[1]);
			int b = Integer.parseInt(tmp[2]);
			
			// 최소비용 저장
			cost[i][0] = Math.min(cost[i-1][1], cost[i-1][2]) + r;
			cost[i][1] = Math.min(cost[i-1][0], cost[i-1][2]) + g;
			cost[i][2] = Math.min(cost[i-1][0], cost[i-1][1]) + b;
		}
		
		System.out.println(Math.min(cost[N][0], Math.min(cost[N][1], cost[N][2])));
	}
	
}
	