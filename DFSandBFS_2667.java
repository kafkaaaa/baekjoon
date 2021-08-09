
// https://www.acmicpc.net/problem/2667
// DFS & BFS

package stepbystep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DFSandBFS_2667 {
	
	static int N;				// 지도의 크기 (5 <= N <= 25)
	static int[][] map;			// 정사각형 모양의 지도
	static boolean[][] isVisit;	// 방문 여부
	static int cnt = 1;			// 단지 번호 (1, 2, 3, ...)
	
	public static void main(String[] args) {
		// Input
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		map = new int[N][N];
		isVisit = new boolean[N][N];
		
		for (int i=0; i<N; i++) {
			String input = scan.next();
			for (int j=0; j<N; j++) {
				map[i][j] = input.charAt(j) - '0';
			}
		}
		
		ArrayList<Integer> a = new ArrayList<>();
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (map[i][j] == 1 && isVisit[i][j] == false) {
					cnt = 1;
					dfs(i, j);
					a.add(cnt);
				}
			}
		}
		
		System.out.println(a.size());	// 총 단지 수 출력
		
		// 각 단지 내 집의 수를 오름차순 정렬하여 출력
		Collections.sort(a);
		for (int i : a) {
			System.out.println(i);
		}
		
	}
	
	
	static void dfs(int x, int y) {
		isVisit[x][y] = true;
		
		// 오른쪽 방향 탐색
		if (y<N-1 && map[x][y+1] == 1 && isVisit[x][y+1] == false) {
			cnt++;
			dfs(x, y+1);
		}
		
		// 왼쪽 방향 탐색
		if (y>0 && map[x][y-1] == 1 && isVisit[x][y-1] == false) {
			cnt++;
			dfs(x, y-1);
		}

		// 아래쪽 방향 탐색
		if (x<N-1 && map[x+1][y] == 1 && isVisit[x+1][y] == false) {
			cnt++;
			dfs(x+1, y);
		}
		
		// 위쪽 방향 탐색
		if (x>0 && map[x-1][y] == 1 && isVisit[x-1][y] == false) {
			cnt++;
			dfs(x-1, y);
		}
		
	}
	
}
