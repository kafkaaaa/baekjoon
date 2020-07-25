package stepbystep;

import java.io.*;

public class Q_9461 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		long[] p = new long[101];	// 1 <= n <= 100
		p[1] = 1; p[2] = 1; p[3] = 1; p[4] = 2; p[5] = 2;
		
		for (int i=6; i<=100; i++) {
			p[i] = p[i-1] + p[i-5];	// P(N) = P(N-1) + P(N-5)
		}
		
		while(T > 0) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(p[n]);
			T--;
		}

	}

}
