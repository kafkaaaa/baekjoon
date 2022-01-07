package stepbystep;

// 백준 DFS & BFS 2206번
// https://www.acmicpc.net/problem/2206

/* 풀이
   N x M 행렬에서 (1,1) ~ (N,M) 최단경로 이동
   이동 : 상/하/좌/우  (대각x)
   0 : 이동 가능한 곳
   1 : 이동할 수 없는 벽
        * 벽을 1개 부수고 이동할 수 있음
        * (1,1)과 (N,M)은 항상 0
   ---------------------------------------------
   벽을 부수고 이동했을 때가 항상 최단경로가 되는 것은 아니다.
   1. 벽을 부수지 않고 진행한 최단경로
   2. 벽을 (1개만) 부수고 진행한 최단경로
   위 2개 중 더 짧은 경로가 최종적으로 전체의 최단경로가 된다.
   -> 1번과 2번을 각각 따로 기록해 나가야 함.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2206 {

    private static class Node {
        int r, c;   // (row, column)
        int dist;   // 이동거리
        int chance; // 벽 부수기 사용여부 (0 or 1)

        Node(int row, int column, int distance, int chance) {
            this.r = row;
            this.c = column;
            this.dist = distance;
            this.chance = chance;
        }
    }

    // 상하좌우 이동 (일반적으로 수학에서 사용하는 (x,y)좌표평면과 헷갈리지 말자)
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static int row, col;
    static int[][] map;     // row x col 행렬
    static boolean[][][] isVisited;
    static Queue<Node> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

        map = new int[row][col];
        isVisited = new boolean[row][col][2];   // 0: 벽 부수기X, 1: 벽 부수기O

        for (int r = 0; r < row; r++) {
            char[] input = br.readLine().toCharArray();
            for (int c = 0; c < col; c++) {
                map[r][c] = input[c] - '0';
            }
        }

        System.out.println(BFS());
    }


    private static int BFS() {

        // 탐색 시작
        q.add(new Node(0, 0, 1, 0));
        isVisited[0][0][0] = true;  // 벽을 부수지 않고 방문
        isVisited[0][0][1] = true;  // 벽을 부수고 방문

        while (!q.isEmpty()) {
            Node cur = q.poll();

            // (row, col) 도착. 탐색 종료
            if (cur.r == row - 1 && cur.c == col - 1) {
                return cur.dist;
            }

            for (int i = 0; i < 4; i++) {
                int rr = cur.r + dr[i];
                int cc = cur.c + dc[i];

                // 범위 검사
                if (rr < 0 || rr >= row || cc < 0 || cc >= col) continue;

                // 방문여부 검사
                if (isVisited[rr][cc][cur.chance]) continue;

                // 0 -> 이동
                if (map[rr][cc] == 0) {
                    isVisited[rr][cc][cur.chance] = true;   // 방문 표시
                    q.add(new Node(rr, cc, cur.dist + 1, cur.chance));
                }
                // 벽 -> 아직 벽 부수기를 사용하지 않았고 아직 방문하지 않았으면 방문
                else if (map[rr][cc] == 1 && cur.chance == 0) {
                    isVisited[rr][cc][cur.chance] = true;   // 방문 표시
                    q.add(new Node(rr, cc, cur.dist + 1, cur.chance + 1));
                }
            }
        }

        return -1;  // 길이 없는 경우
    }

}
