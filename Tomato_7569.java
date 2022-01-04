package stepbystep;

// 백준 DFS & BFS 7569번
// https://www.acmicpc.net/problem/7569

/* 풀이
    -7576번과 유사하나 높이 추가 (3차원)
    -큐에서 익은 토마토 하나를 꺼내어 6방향을 탐색해야 함.
    -(6방향 중에서) 영향을 받는 토마토는 +1 day.
    -큐가 공백이 될 때까지 반복.
    -토마토가 모두 익지 못하는 상황  ->  -1을 출력.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato_7569 {

    static class Tomato {
        int x, y, z;    // x,y,z 좌표

        Tomato(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    static int M, N, H; // 가로 x 세로 x 높이
    static int[][][] map;
    static int days = 0;
    static boolean alreadyRipen = true;

    // 6방향(상.하.좌.우.윗면.아랫면) 좌표 이동 값
    static int[] dx = {-1, 1, 0, 0, 0, 0};  // (3차원) x좌표
    static int[] dy = {0, 0, -1, 1, 0, 0};  // (3차원) y좌표
    static int[] dz = {0, 0, 0, 0, 1, -1};  // (3차원) z좌표

    static Queue<Tomato> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        map = new int[H][N][M];

        // H -> N -> M  순서 주의
        for (int z = 0; z < H; z++) {
            for (int y = 0; y < N; y++) {
                st = new StringTokenizer(br.readLine());
                for (int x = 0; x < M; x++) {
                    map[z][y][x] = Integer.parseInt(st.nextToken());
                    if (map[z][y][x] == 1) {    // 익은 토마토 -> 큐에 삽입
                        q.add(new Tomato(x, y, z));
                    }
                    alreadyRipen = false;
                }
            }
        }

        // 저장될 때부터 모든 토마토가 익어있는 상태이면 0을 출력
        if (alreadyRipen) {
            System.out.println(0);
            return;
        }

        // BFS
        while (!q.isEmpty()) {
            Tomato t = q.poll();
            int x = t.x;
            int y = t.y;
            int z = t.z;

            for (int i = 0; i < 6; i++) {
                int xx = x + dx[i];
                int yy = y + dy[i];
                int zz = z + dz[i];

                // 범위 밖을 벗어나는 경우
                if (xx < 0 || yy < 0 || zz < 0 || xx >= M || yy >= N || zz >= H)
                    continue;

                if (map[zz][yy][xx] == 0) {
                    map[zz][yy][xx] = map[z][y][x] + 1; // +1 day
                    q.add(new Tomato(xx, yy, zz));
                }
            }
        }

        // 토마토가 모두 익을 때까지 최소 며칠이 걸리는지를 계산
        int max = 0;

        for (int z = 0; z < H; z++) {
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if (map[z][y][x] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    max = Math.max(max, map[z][y][x]);
                }
            }
        }
        System.out.println(max-1);
    }
}
