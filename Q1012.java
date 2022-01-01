package stepbystep;

// 백준 DFS & BFS 1012번
// https://www.acmicpc.net/problem/1012

/* 풀이
아직 방문하지 않았고, 값이 1인 노드를 만나면 인접한(상하좌우) 노드로 DFS 탐색
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1012 {

    static int M, N;    // 가로,세로 길이
    static int[][] map; // 배추밭

    // 상하좌우 좌표 이동 값
    static int[] dx = { 0, 0, -1, 1 };
    static int[] dy = { -1, 1, 0, 0 };
    static int cnt;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            // Input
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());   // 가로 길이
            N = Integer.parseInt(st.nextToken());   // 세로 길이
            int K = Integer.parseInt(st.nextToken());
            map = new int[N][M];
            cnt = 0;

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }

            // Search
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] == 1) {
                        DFS(i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    static void DFS(int x, int y) {
        map[x][y] = -1; // mark visit
        for (int i=0; i<4; i++) {
            int tempX = x + dx[i];
            int tempY = y + dy[i];

            // 배추밭 범위를 벗어나면..
            if (tempX < 0 || tempY < 0 || tempX >= N || tempY >= M)
                continue;

            if (map[tempX][tempY] == 1) {
                DFS(tempX, tempY);
            }
        }
    }

}
