package stepbystep;

import java.util.Scanner;

// 백트래킹
// DFS(Depth First Search, 깊이 우선 탐색)

public class NM_15649 {
	static int M, N;
	static int arr[];		
	static boolean isVisit[];
	static StringBuilder sb = new StringBuilder();
	
	static void dfs(int cnt) {
		// 선택 개수 = M 이면 dfs함수 종료
		if (cnt == M) {
			for (int i : arr)
				sb.append(i + " ");
			sb.append("\n");
			return;
		}
		
		for (int i=1; i<=N; i++) {
			if (!isVisit[i]) {
				isVisit[i] = true;	// 방문 표시
				arr[cnt] = i;		// 선택
				dfs(cnt+1);			// 다음 선택 : 재귀 호출
				isVisit[i] = false;	// 선택 후 다시 미방문 표시
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
