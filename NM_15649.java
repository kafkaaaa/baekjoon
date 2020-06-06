package stepbystep;

import java.util.Scanner;

// ��Ʈ��ŷ
// DFS(Depth First Search, ���� �켱 Ž��)

public class NM_15649 {
	static int M, N;
	static int arr[];		
	static boolean isVisit[];
	static StringBuilder sb = new StringBuilder();
	
	static void dfs(int cnt) {
		// ���� ���� = M �̸� dfs�Լ� ����
		if (cnt == M) {
			for (int i : arr)
				sb.append(i + " ");
			sb.append("\n");
			return;
		}
		
		for (int i=1; i<=N; i++) {
			if (!isVisit[i]) {
				isVisit[i] = true;	// �湮 ǥ��
				arr[cnt] = i;		// ����
				dfs(cnt+1);			// ���� ���� : ��� ȣ��
				isVisit[i] = false;	// ���� �� �ٽ� �̹湮 ǥ��
			}
		}
	}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		scan.close();
		
		arr = new int[M];		
		isVisit = new boolean[N+1];
		
		dfs(0);
		
		System.out.println(sb);
	}

}
