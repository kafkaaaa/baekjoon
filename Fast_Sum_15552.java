package stepbystep;

import java.util.*;
import java.io.*;

// ���۸� �̿��� ����(ȿ������) ���

public class Fast_Sum_15552 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter BW = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(BR.readLine()); // ���ڿ� -> ���� ����ȯ
		
		for (int i=0; i<T; i++)
		{
			StringTokenizer ST = new StringTokenizer(BR.readLine());
			int A = Integer.parseInt(ST.nextToken());
			int B = Integer.parseInt(ST.nextToken());	
			
			BW.write(A + B + "\n");		// �ڵ����� ������ �ȵǱ⶧���� "\n" �߰�
		}
		
		BW.flush();	// �����ִ� ������ ��� ���	
		BW.close();
	}

}