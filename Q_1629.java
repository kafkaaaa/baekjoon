package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Divide & Conquer (분할 정복) : A^B mod C
// https://www.acmicpc.net/problem/1629

public class Q_1629 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		System.out.println(calMod(A, B, C));
	}
	
	static long calMod(long A, long B, long C) {
		
		if (B == 0) return 1;
		
		long divided = calMod(A, B/2, C);
		long result = divided * divided % C;
		
		if (B % 2 == 0) return result;
		else return A * result % C;
	}

}
