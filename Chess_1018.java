package stepbystep;

import java.io.*;
import java.util.*;

public class Chess_1018 {
	final static String[] chess = { "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", 
			"WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW" };
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String [] s = new String[N];
		for (int i=0; i<N; i++) {		// N*M 배열을 입력받는다
			s[i] = br.readLine();
		}
		
		int result = Integer.MAX_VALUE;
		
		for (int i=0; i<=N-8; i++) {
			for (int j=0; j<=M-8; j++) {
				int cnt = 0;
				for (int k=0; k<8; k++) {
					String temp = s[i+k].substring(j, j+8);
					for (int l=0; l<8; l++) {
						if (temp.charAt(l) == chess[k].charAt(l)) {
							cnt++;
						}
					}
				}
				if (cnt >= 32) cnt = 64-cnt;
				result = Math.min(result, cnt);
			}
		}
		bw.write(result + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
}