package stepbystep;

// 백준 DFS & BFS 7576번
// https://www.acmicpc.net/problem/7576

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato_7576 {

    static int M, N;
    static int[][] map;     // 토마토 배열 (M x N)
    static int[][] days;    // 익을때 까지 걸린 날짜 저장
    static Queue<Tomato> q = new LinkedList<>();

    static int[] dx = {0, 0, -1, 1};  // 상하좌우 좌표 이동 값
    static int[] dy = {-1, 1, 0, 0};  // 상하좌우 좌표 이동 값

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        days = new int[N][M];

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                // 익지 않은(0) 토마토인 경우..
                if (map[i][j] == 0) {
                    days[i][j] = -1;   // 아직 방문x 표시
                }
                // 익은(1) 토마토인 경우..
                else if (map[i][j] == 1) {
                    q.add(new Tomato(i, j));    // 큐에 Tomato(x,y) 삽입
                }
            }
        }

        while (!q.isEmpty()) {
            Tomato t = q.poll();    // 큐에서 토마토 하나 꺼내기
            for (int i=0; i<4; i++) {
                int xx = t.x + dx[i]; // 이동할 노드의 x좌표
                int yy = t.y + dy[i]; // 이동할 노드의 y좌표
                // 주어진 좌표의 범위를 벗어난 경우
                if (xx < 0 || xx >= N || yy <0 || yy >=M) continue;

                // 이미 방문했거나 방문할 필요가 없는 경우
                if (days[xx][yy] >= 0) continue;

                days[xx][yy] = days[t.x][t.y] + 1;  // 날짜 + 1일
                q.add(new Tomato(xx, yy));
            }
        }

        int maxDay = 0;
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (days[i][j] == -1) {
                    System.out.println(-1); // 토마토가 모두 익지 못하는 경우
                    return;
                }
                maxDay = Math.max(maxDay, days[i][j]);
            }
        }
        System.out.println(maxDay);
    }
}

class Tomato {
    int x, y;

    Tomato(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
