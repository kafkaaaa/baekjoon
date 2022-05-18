package stepbystep;

// 백준 DFS - 4963번
// https://www.acmicpc.net/problem/4963

/* 풀이
    정사각형으로 이루어져 있는 섬과 바다 지도가 주어진다.
    섬의 개수를 세는 프로그램을 작성하시오.
    상하좌우 + 대각이동
    DFS...
*/

import java.io.*;
import java.util.StringTokenizer;

public class Q4963 {

    static int w, h;        // 지도의 너비, 높이  (1<= w, h <= 50)
    static int[][] map;
    static boolean[][] isVisited;
    static int nOfIsland;   // 섬의 개수
    static int[] dx = {0, 0, -1, 1, 1, 1, -1, -1};  // 상하좌우 + 대각4방향
    static int[] dy = {-1, 1, 0, 0, -1, 1, 1, -1};  // 상하좌우 + 대각4방향

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            map = new int[h][w];
            isVisited = new boolean[h][w];
            nOfIsland = 0;

            if (w == 0 && h == 0) break;    // 입력 마지막(종료) 조건

            for (int i=0; i<h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j=0; j<w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i=0; i<h; i++) {
                for (int j=0; j<w; j++) {
                    if (!isVisited[i][j] && map[i][j] == 1) {
                        search(i, j);
                        nOfIsland++;
                    }
                }
            }
            bw.write(nOfIsland + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    static void search(int x, int y) {
        isVisited[x][y] = true;

        for (int i=0; i<8; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX < 0 || newX >= h || newY < 0 || newY >= w) continue;
            if (map[newX][newY] == 1 && !isVisited[newX][newY]) {
                search(newX, newY);
            }
        }
    }
}
