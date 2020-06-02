package stepbystep;

import java.util.*;
import java.io.*;

public class WordAlign_1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());		// �ܾ��� ���� N

		// �ߺ� ���Ÿ� ���� set���� �Է¹޴´�.
		HashSet<String> hs = new HashSet<String>();
		
		for (int i=0; i<N; i++) {
			hs.add(br.readLine());
		}
		
		// ArrayList�� �ű��
		ArrayList<String> list = new ArrayList<String>(hs);
		
		// 1.���̰� ª�� ������  ���� -> 2.(���̰� ������)���� ������ ����
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
