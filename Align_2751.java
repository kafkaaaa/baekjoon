package stepbystep;

import java.util.*;
import java.io.*;

public class Align_2751 {
	// 시간초과 유의	
	// BufferedR/W, ArrayList, Collection.sort 사용

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for (int i=0; i<N; i++) {
			num.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(num);		// 시간복잡도 : O(n*log(n))
		
		for (int i=0; i<N; i++) {
			bw.write(num.get(i) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
