package stepbystep;

// 백준 1504번 - 특정한 최단경로
// https://www.acmicpc.net/problem/1504

/* 풀이
    1번 정점 -> N번 정점으로 최단거리로 이동하려고 한다.
    조건1. 임의로 주어진 두 정점은 반드시 통과해야 한다.
        즉, 최단거리는
        (1) 1 -> v1 -> v2 -> N
        (2) 1 -> v2 -> v1 -> N
                   두 개중에서 더 짧은 경로가 최단거리다.
    조건2. 한번 이동했던 정점/간선을 다시 이동할 수 있다.
    2 <= Number of Vertex <= 800
    0 <= Number of Edge <= 200,000
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q1504 {

    static int V, E;    // 정점의 개수, 간선의 개수
    static int v1, v2;  // 반드시 거쳐야 하는 두 정점
    static int[] dist;  // 시작정점에서 x번 정점까지의 최단거리
    static ArrayList<Node>[] list;  // 정점 인접리스트

    final static int INF = 200000000;   // Integer.MAX_VALUE 로 설정하면 overflow 발생.
    // 간선의 최대 개수 200000 * 가중치 최대값 1000 = 200,000,000


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        V = scan.nextInt();
        E = scan.nextInt();

        list = new ArrayList[V+1];  // 정점 인접리스트
        for (int i=1; i<=V; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i=0; i<E; i++) {
            // a번 정점 -> b번 정점 양방향 경로 존재 (거리: c)
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            list[a].add(new Node(b, c));
            list[b].add(new Node(a, c));
        }

        // 반드시 거쳐야 하는 두 정점
        v1 = scan.nextInt();
        v2 = scan.nextInt();

        // (1)   1 -> v1 -> v2 -> N
        int dist1 = 0;
        dist1 += Dijkstra(1, v1);
        dist1 += Dijkstra(v1, v2);
        dist1 += Dijkstra(v2, V);

        // (2)   1 -> v2 -> v1 -> N
        int dist2 = 0;
        dist2 += Dijkstra(1, v2);
        dist2 += Dijkstra(v2, v1);
        dist2 += Dijkstra(v1, V);

        int answer = Math.min(dist1, dist2);
        if (answer >= INF) System.out.println(-1);
        else System.out.println(answer);
    }


    private static int Dijkstra(int start, int end) {

        dist = new int[V + 1];

        Arrays.fill(dist, INF);
        dist[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));

        while (!pq.isEmpty())
        {
            Node current = pq.poll();
            int v = current.vertex;
            int w = current.weight;

            // 최단경로가 아니면 넘어감
            if (dist[v] < w) continue;

            // 현재 정점과 연결된 정점 탐색
            for (int i = 0; i < list[v].size(); i++) {
                int vv = list[v].get(i).vertex;
                int ww = list[v].get(i).weight + w;

                // 현재 경로가 더 짧은 경로이면 갱신
                if (dist[vv] > ww) {
                    dist[vv] = ww;
                    pq.add(new Node(vv, ww));
                }
            }
        }
        return dist[end];
    }


    private static class Node implements Comparable<Node> {

        int vertex;
        int weight;

        public Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return weight - o.weight;
        }

    }

}
