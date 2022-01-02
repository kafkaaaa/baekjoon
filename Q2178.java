package stepbystep;

// 백준 DFS & BFS 2178번
// https://www.acmicpc.net/problem/2178

/* 풀이
    미로 최단거리 찾기 -> BFS : (0,0) ~ (N-1, M-1)
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2178 {

    static int N, M;
    static int[][] map;                 // N x M 미로
    static boolean[][] isVisited;       // 방문여부
    static int[] dx = {0, 0, -1, 1};  // 상하좌우 좌표 이동 값
    static int[] dy = {-1, 1, 0, 0};  // 상하좌우 좌표 이동 값

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        isVisited = new boolean[N][M];
        isVisited[0][0] = true; // 시작점

        for (int i = 0; i < N; i++) {   // Input Maze Array
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        BFS(0, 0);
        System.out.println(map[N - 1][M - 1]);
    }


    static void BFS(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});

        while (!q.isEmpty()) {
            int[] target = q.poll();

            for (int i = 0; i < 4; i++) {
                int xx = target[0] + dx[i]; // 이동할 노드의 x좌표
                int yy = target[1] + dy[i]; // 이동할 노드의 y좌표

                // 주어진 미로의 범위를 벗어나는 경우
                if (xx < 0 || xx >= N || yy < 0 || yy >= M) continue;

                // 방문가능하지 않은 경우 (0)
                if (map[xx][yy] == 0) continue;

                // 이미 방문한 경우
                if (isVisited[xx][yy]) continue;

                q.add(new int[] {xx, yy});
                map[xx][yy] = map[target[0]][target[1]] + 1;    // 거리 + 1
                isVisited[xx][yy] = true;
            }
        }
    }
}
