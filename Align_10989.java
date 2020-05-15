package stepbystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
// 시간제한 : 3초
public class Align_10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());	// cnt : 입력받는 숫자의 개수
		int [] num = new int[10001];	// 10000이하 자연수
		
		for (int i=0; i<cnt; i++) {		// num[입력받은 수] 배열을 ++
			num[Integer.parseInt(br.readLine())]++;
		}
		
		for (int i=0; i<num.length; i++) {
			if(num[i] > 0) {	// 저장된 숫자가 있는 배열이면...
				for (int j=0; j<num[i]; j++) {
					bw.write(Integer.toString(i) + "\n");
				}
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}