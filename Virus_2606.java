
// https://www.acmicpc.net/problem/2606
// BFS

package stepbystep;

import java.util.*;

public class Virus_2606 {
	
	static boolean[][] network;
	static boolean[] isVisit;
	static int count = 0;	// 바이러스에 걸린 컴퓨터의 수

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();	// 컴퓨터의 수 (1~100 이하)
		int M = scan.nextInt();	// 연결되어 있는 컴퓨터 쌍의 수 (간선의 수)
		
		network = new boolean[N+1][N+1];
		isVisit = new boolean[N+1];
		
		for (int i=1; i<=M; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			network[a][b] = true;
			network[b][a] = true;
		}
		scan.close();
		
		BFS(1);
		System.out.println(count);
	}
	
	
	// Breadth First Search  (Queue)
	static void BFS(int start) {
		Queue<Integer> q = new LinkedList<>();
		isVisit[start] = true;
		q.add(start);
		
		while (!q.isEmpty()) {
			int tmp = q.poll();
			
			// 1번 컴퓨터부터 BFS 시작
			for (int i=1; i<network.length; i++) {
				// 연결되어 있고 아직 방문하지 않았다면..
				if (network[tmp][i] == true && isVisit[i] == false) {
					q.add(i);
					isVisit[i] = true;
					count++;
				}
			}
		}
	}

}
