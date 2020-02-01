package stepbystep;

import java.util.*;
import java.io.*;

// 버퍼를 이용한 빠른(효율적인) 출력

public class Fast_Sum_15552 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter BW = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(BR.readLine()); // 문자열 -> 정수 형변환
		
		for (int i=0; i<T; i++)
		{
			StringTokenizer ST = new StringTokenizer(BR.readLine());
			int A = Integer.parseInt(ST.nextToken());
			int B = Integer.parseInt(ST.nextToken());	
			
			BW.write(A + B + "\n");		// 자동으로 개행이 안되기때문에 "\n" 추가
		}
		
		BW.flush();	// 남아있는 데이터 모두 출력	
		BW.close();
	}

}