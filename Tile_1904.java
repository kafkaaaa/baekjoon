package stepbystep;

import java.io.*;

public class Tile_1904 {	// time limit : 2s

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] tile = new int[N+1];
		tile[1] = 1;
		if (N >= 2) tile[2] = 2;	// 그냥 tile[2] = 2; 를 하면 N=1 일때 런타임 에러. (배열범위)
		
		for (int i=3; i<=N; i++) {
			tile[i] = (tile[i-2] + tile[i-1]) % 15746;
						// 46번째 수가 int범위를 초과하기 떄문에
						// 미리 나눗셈을 해야한다. (출력에서 나눗셈 -> error)
		}
		
		System.out.println(tile[N]);
		
	}
	
}
