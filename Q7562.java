package stepbystep;

// 백준 DFS & BFS 7562번
// https://www.acmicpc.net/problem/7562

/* 풀이
    나이트가 이동할 수 있는 8방향 dx, dy
    (x1, y1) -> (x2, y2)
    각 테스트 케이스마다 나이트가 최소 몇 번만에 이동할 수 있는지
    BFS
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7562 {

    static int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[] dy = {-2, -1, 1, 2, 2, 1, -1 ,-2};
    static int[][] board;       // 체스판
    static boolean[][] isVisited;
    static int l;               // 체스판 한 변의 길이
    static int x1, y1, x2, y2;  // 나이트 (x1, y1) -> (x2, y2)


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        while (T --> 0) {
            l = Integer.parseInt(br.readLine());
            board = new int[l][l];
            isVisited = new boolean[l][l];

            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            BFS();
            System.out.println(board[x2][y2]);
        }

    }


    private static void BFS() {
        Queue<Pos> q = new LinkedList<>();
        q.add(new Pos(x1, y1));
        isVisited[x1][y1] = true;

        while (!q.isEmpty()) {
            Pos start = q.poll();
            int x = start.x;
            int y = start.y;
            if (x == x2 && y == y2) break;

            for (int i=0; i<8; i++) {
                int xx = x + dx[i];
                int yy = y + dy[i];

                // 체스판 범위 검사
                if (xx < 0 || xx >= l || yy < 0 || yy >= l) continue;

                // 이미 방문했는지 검사
                if (isVisited[xx][yy]) continue;

                q.add(new Pos(xx, yy));
                isVisited[xx][yy] = true;
                board[xx][yy] = board[x][y] + 1;
            }
        }
    }


    private static class Pos {
        int x;
        int y;

         public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
