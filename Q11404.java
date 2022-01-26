package stepbystep;

// 백준 최단경로 11404번 - 플로이드
// https://www.acmicpc.net/problem/11404

/* 풀이
    <Floyd Warshall 알고리즘>
    : 모든 정점 -> 모든 정점 최단 경로  (Dijkstra: 한 정점 -> 다른 모든 정점 최단경로)
    : 중간에 거쳐가는 정점을 고려해서 두 정점 간의 최단거리를 구한다.
        (A -> B  vs  A -> X  +  X -> B)
    : 2x2 테이블을 만들어서 모든 정점 -> 모든 정점에 대한 최단거리를 갱신
    : 3중 for문 -> O(V^3)

    A도시 -> B도시  비용의 최소값 구하기
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11404 {

    static int n;       // 도시의 개수 2 <= n <= 100
    static int m;       // 버스의 개수 1 <= m <= 100,000
    static int[][] c;   // 버스 비용   1 <= c <= 100,000
    static int INF = 9999999;   // Integer.MAX_VALUE로 설정하면 비용 계산 과정에서 오류 발생

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        c = new int[n+1][n+1];
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                if (i == j) {
                    c[i][j] = 0;    // A도시 -> A도시 거리는 0으로 초기화
                }
                else {
                    c[i][j] = INF;  // 나머지 경우는 INF 값으로 초기화
                }
            }
        }

        int start, end, cost; // 목적지, 도착지, 비용
        StringTokenizer st;

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            cost = Integer.parseInt(st.nextToken());
            c[start][end] = Math.min(c[start][end], cost);
        }


        // floyd warshall  algorithm
        for (int k=1; k<=n; k++) {
            for (int i=1; i<=n; i++) {
                for (int j=1; j<=n; j++) {
                    // (i -> j  vs  i -> k  +  k -> j)
                    c[i][j] = Math.min(c[i][k] + c[k][j],  c[i][j]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                if (c[i][j] >= INF) sb.append("0 ");
                else sb.append(c[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

}
