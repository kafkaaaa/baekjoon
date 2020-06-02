package stepbystep;

import java.util.*;
import java.io.*;

public class WordAlign_1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());		// 단어의 개수 N

		// 중복 제거를 위해 set으로 입력받는다.
		HashSet<String> hs = new HashSet<String>();
		
		for (int i=0; i<N; i++) {
			hs.add(br.readLine());
		}
		
		// ArrayList로 옮긴다
		ArrayList<String> list = new ArrayList<String>(hs);
		
		// 1.길이가 짧은 순으로  정렬 -> 2.(길이가 같으면)사전 순으로 정렬
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() > s2.length())
					return 1;
				else if (s1.length() < s2.length())
					return -1;
				else
					return s1.compareTo(s2);
			}
		});
		
		for (String s : list) {
			System.out.println(s);
		}
	}

}
