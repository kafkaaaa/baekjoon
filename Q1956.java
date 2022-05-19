package stepbystep;

// 백준 최단경로 1956번
// https://www.acmicpc.net/problem/1956

/* 풀이
    #최단 거리 알고리즘 응용 : 최단 cycle 찾기
    : Floyd-Warshall 알고리즘  (모든 정점 -> 모든 정점   최단 경로)

    #idea : (v1 -> v2 최단경로) + (v2 -> v1 최단경로) = v1, v2가 포함된 사이클의 최단경로
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1956 {

    static final int INF = 400 * 10000 + 1;   // 2 <= V <= 400,  E <= 10,000

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        int[][] dist = new int[V+1][V+1];   // 마을은 1번부터 시작.
        for (int i=1; i<=V; i++)
            Arrays.fill(dist[i], INF);

        // Input : a -> b 로 가는 거리가 c인 도로가 있다
        while (E --> 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            dist[a][b] = c;
        }

        // floyd-warshall
        for (int k=1; k<=V; k++)
            for (int i=1; i<=V; i++)
                for (int j=1; j<=V; j++)
                    // (i -> j  vs  i -> k  +  k -> j)
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);

        // 최단 cycle 구하기  (cycle : 한 마을에서 출발하여 같은 마을로 돌아오는 것)
        int minDist = INF;
        for (int i=1; i<=V; i++)
            minDist = Math.min(dist[i][i], minDist);

        // 최단 cycle의 도로 길이의 합 출력  (없으면 -1)
        System.out.println( (minDist == INF) ? -1 : minDist );
    }

}
