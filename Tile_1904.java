package stepbystep;

import java.io.*;

public class Tile_1904 {	// time limit : 2s

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] tile = new int[N+1];
		tile[1] = 1;
		if (N >= 2) tile[2] = 2;	// �׳� tile[2] = 2; �� �ϸ� N=1 �϶� ��Ÿ�� ����. (�迭����)
		
		for (int i=3; i<=N; i++) {
			tile[i] = (tile[i-2] + tile[i-1]) % 15746;
						// 46��° ���� int������ �ʰ��ϱ� ������
						// �̸� �������� �ؾ��Ѵ�. (��¿��� ������ -> error)
		}
		
		System.out.println(tile[N]);
		
	}
	
}
