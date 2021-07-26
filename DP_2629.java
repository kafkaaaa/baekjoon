
// https://www.acmicpc.net/problem/2629
// *Ref : https://gre-eny.tistory.com/89
// DP - DFS(Depth First Search)

// 추(무게) 조합 방법 : 3가지
// #1. 기본 추 그대로의 무게
// #2. 추 + 같은쪽에 새로운 추 올리기 (구슬 = 추 + 새로운 추)
// #3. 추 + 반대쪽에 새로운 추 올리기 (구슬 + 새로운 추 = 추)
// dp[i][j] = i번 까지의 추를 사용하여 무게j를 측정할 수 있는가?
// 무게가 a, b인 추 2개로 측정할 수 있는 무게 -> a, b, a+b, Math.abs(a-b)

package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DP_2629 {
	
	static int[] weight;			// 추의 무게(500이하 자연수)
	static int[] bead;				// 구슬의 무게 (40000이하 자연수)
	static boolean[][] canWeigh;	// canWeigh[i][j] = i번 까지의 추를 사용하여 무게j를 측정 가능한가?
	static int N;					// 추의 개수 (30 이하)
	static int M;					// 구슬의 개수 (7 이하)
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		weight = new int[N];
		canWeigh = new boolean[N+1][15001];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			weight[i] = Integer.parseInt(st.nextToken());
		}
		dfs(0, 0);
		
		M = Integer.parseInt(br.readLine());
		bead = new int[M];
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<M; i++) {
			bead[i] = Integer.parseInt(st.nextToken());
			// 15000이 넘는 무게는 측정할 수 없음. (추의 최대 무게 500 x 추의 최대 개수 30)
			if (bead[i] > 15000) {
				sb.append("N ");
			}
			else {
				if (canWeigh[N][bead[i]]) {
					sb.append("Y ");
				}
				else sb.append("N ");
			}
		}
		System.out.println(sb);
	}
	
	
	static void dfs(int idx, int w) {
		
		if (canWeigh[idx][w]) return;
		
		canWeigh[idx][w] = true;
		
		if (idx == N) return;	// 깊이 우선 탐색 종료
		
		dfs(idx+1, w);					// 기본 추 그대로의 무게
		dfs(idx+1, w + weight[idx]);	// 추 + 같은쪽에 새로운 추 올리기 (구슬 = 추 + 새로운 추)
		dfs(idx+1, Math.abs(w - weight[idx]));	// 추 + 반대쪽에 새로운 추 올리기 (구슬 + 새로운 추 = 추)
	}
	
}
