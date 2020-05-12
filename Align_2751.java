package stepbystep;

import java.util.*;
import java.io.*;

public class Align_2751 {
	// �ð��ʰ� ����	
	// BufferedR/W, ArrayList, Collection.sort ���

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for (int i=0; i<N; i++) {
			num.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(num);		// �ð����⵵ : O(n*log(n))
		
		for (int i=0; i<N; i++) {
			bw.write(num.get(i) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
