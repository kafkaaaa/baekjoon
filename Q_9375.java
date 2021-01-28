package stepbystep;

// 정수론 및 조합론 - 옷가지 조합 : HashMap 활용
// https://www.acmicpc.net/problem/9375

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_9375 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());	// number of TestCase
		
		StringTokenizer st;
		
		for (int i=0; i<T; i++) {
			int n = Integer.parseInt(br.readLine());	// 옷의 수
			
			HashMap<String, Integer> hm = new HashMap<>();
			
			for (int j=0; j<n; j++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();		// 옷의 이름은 필요 없음
				String type = st.nextToken();	// 옷의 종류
				
				if (hm.containsKey(type)) {		// 같은 종류의 옷이 이미 있으면
					int index = hm.get(type);	// 그 종류의 인덱스를 구하고
					hm.put(type, index + 1);	// 다음 인덱스에 저장한다
				}
				else {
					hm.put(type, 1);
				}
			}
			
			int count = 1;
			for (int each : hm.values()) {
				count *= each + 1;		// (각 종류별 옷들의 개수 + 1)을 곱해나간다
			}
			// 아무것도 입지 않는 경우를 제외 : -1
			System.out.println(count - 1);
		}
	}	
	
}
