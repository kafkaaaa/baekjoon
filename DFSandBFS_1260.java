
// https://www.acmicpc.net/problem/1260
// DFS & BFS

package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSandBFS_1260 {
	
	static int V;	// Vertex 개수 (1 <= V <= 1000)
	static int E;	// Edge 개수 (1 <= E <= 10000)
	
	static boolean[][] graph;		// 두 정점 연결 유무
	static boolean[] isVisit;		// 방문 여부
	
	static StringBuilder sb = new StringBuilder();

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());	// 탐색을 시작할 정점의 번호
		
		graph = new boolean[V+1][V+1];
		isVisit = new boolean[V+1];
		for (int i=1; i<=E; i++) {
			st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			graph[v1][v2] = true;
			graph[v2][v1] = true;		// 양방향 연결이므로
		}
		
		DFS(start);
		sb.append("\n");
		Arrays.fill(isVisit, false);	// 다른 탐색을 위해 방문여부 초기화
		BFS(start);
		
		System.out.println(sb);
	}
	
	
	// Depth First Search  (Recursive)
	static void DFS(int start) {
		isVisit[start] = true;	// 노드 방문 표시
		sb.append(start + " ");
		
		for (int i=1; i<=V; i++) {
			// 두 정점이 연결되어 있고, 아직 방문하지 않았다면..
			if (graph[start][i] == true && isVisit[i] == false) {
				DFS(i);
			}
		}
	}
	
	// Breadth First Search  (Queue)
	static void BFS(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		isVisit[start] = true;	// 노드 방문 표시
		
		while (!q.isEmpty()) {
			int temp = q.poll();	// 방문한 노드는 큐에서 제거
			sb.append(temp + " ");
			
			for (int i=1; i<=V; i++) {
				// 두 정점이 연결되어 있고, 아직 방문하지 않았다면..
				if (graph[temp][i] == true && isVisit[i] == false) {
					q.add(i);
					isVisit[i] = true;
				}
			}
		}
	}
	
}
