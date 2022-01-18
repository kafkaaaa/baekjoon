package stepbystep;

// 백준 최단경로 11657번 - 타임머신
// https://www.acmicpc.net/problem/11657

/* 풀이
    -시작점에서 다른 모든 정점까지의 최단거리를 구하는 문제인데,
    ※가중치가 음수인 간선이 존재할 수 있음.
        -> Bellman-Ford Algorithm.
            : dist[] : 시작정점에서 각 정점까지의 최단거리.
            : (0) dist[] 값을 초기값 INF로 설정.
            : (1) (V-1번 반복)간선의 개수만큼 dist[2] ~ dist[V] 갱신 (출발점 1로 가정)
            : (2) (마지막 1번) dist[V] 갱신
                (2-1) 갱신이 되는 경우 -> 음수 cycle 존재
                (2-2) 갱신x -> 해당 dist[]는 최단거리.

    <출력>
    만약 1번 도시에서 출발해 어떤 도시로 가는 과정에서
    시간을 무한히 오래 전으로 되돌릴 수 있다면 첫째 줄에 -1을 출력.
        -> 음의 사이클이 존재하는 그래프이면 -1을 출력.
            *음의 사이클: 최단경로에 가중치가 음수인 간선이 포함되어 계속 거리가 감소됨.
    그렇지 않다면 N-1개 줄에 걸쳐 각 줄에 1번 도시에서 출발해
    2번, 3번, ... N번 도시로 가는 가장 빠른 시간을 출력.
    (만약 해당 도시로 가는 경로가 없다면 대신 -1을 출력)
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11657 {

    static int V;       // 도시(정점)의 개수  (1 <= V <= 500)
    static int E;       // 버스노선(간선)의 개수  (1 <= E <= 6000)
    static int A, B;    // A: 시작도시, B: 도착도시  (1 <= A,B <= N)
    static int C;       // C=0: 순간이동,  C<0: 타임머신으로 시간을 되돌아가는 경우
                        // (-10000 <= C <= 10000)

    static long dist[];
    static Edge[] edgeList;
    static boolean hasNegativeCycle;
    final static int INF = Integer.MAX_VALUE;


    private static class Edge {
        int start, end, weight;

        public Edge(int start, int end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // Input
        st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        edgeList = new Edge[E+1];   // 1~E번 간선 저장
        for (int i=1; i<=E; i++) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            edgeList[i] = new Edge(A, B, C);
        }

        // Bellman-Ford
        dist = new long[V+1];
        for (int i=2; i<=V; i++) {  // init
            dist[i] = INF;
        }

        BellmanFord();

        // Output
        if (hasNegativeCycle) {
            System.out.println(-1);
            return;
        }
        else {
            StringBuilder ans = new StringBuilder();
            for (int i=2; i<=V; i++) {
                if (dist[i] == INF) {   // 초기값 그대로면 -1
                    ans.append("-1\n");
                } else {
                    ans.append(dist[i] + "\n");
                }
            }
            System.out.println(ans);
        }
    }


    private static void BellmanFord() {

        for (int i=1; i<V; i++) {
            for (int j=1; j<=E; j++) {
                Edge cur = edgeList[j];
                if (dist[cur.start] == INF) continue;
                dist[cur.end] = Math.min(dist[cur.end], dist[cur.start] + cur.weight);
            }
        }


        for (int i=1; i<=E; i++) {
            Edge cur = edgeList[i];
            if (dist[cur.start] == INF) continue;

            //
            if (dist[cur.start] + cur.weight < dist[cur.end]) {
                hasNegativeCycle = true;
                return;
            }
        }

    }

}
