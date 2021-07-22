
// https://www.acmicpc.net/problem/1520
// DP : Memoization & DFS

package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DP_1520 {
	
	static int[][] map;
	static int[][] memo;		// memo[x][y] = (x,y)에서 도착점까지의 경로의 개수 저장
	static boolean[][] isVisit;	// 해당 지점 방문여부 저장
	static int endX, endY;		// 도착지점 (x,y) 좌표

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		endX = Integer.parseInt(st.nextToken());
		endY = Integer.parseInt(st.nextToken());
		
		map = new int[endX+1][endY+1];
		memo = new int[endX+1][endY+1];
		isVisit = new boolean[endX+1][endY+1];
		for (boolean e[] : isVisit) {
			Arrays.fill(e, false);
		}
		
		for (int i=1; i<=endX; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=1; j<=endY; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(countRoute(1,1));
	}
	
	// DFS
	static int countRoute(int x, int y) {
		
		// 목적지에 도착하면..
		if (x == endX && y == endY) return 1;

		// 이미 방문(계산)한 경우..
		if (isVisit[x][y] == true) {
			return memo[x][y];
		}
		// 아직 방문(계산)하지 않은 경우..
		else {
			isVisit[x][y] = true;
			// 아래로 한 칸 이동
			if (x <= endX-1 && map[x+1][y] < map[x][y]) {
				memo[x][y] += countRoute(x+1, y);
			}
			// 오른쪽으로 한 칸 이동
			if (y <= endY-1 && map[x][y+1] < map[x][y]) {
				memo[x][y] += countRoute(x, y+1);
			}
			// 왼쪽으로 한 칸 이동
			if (y >= 1 && map[x][y-1] < map[x][y]) {
				memo[x][y] += countRoute(x, y-1);
			}
			// 위로 한 칸 이동
			if (x >= 1 && map[x-1][y] < map[x][y]) {
				memo[x][y] += countRoute(x-1, y);
			}
			return memo[x][y];
		}
	}
	
}
