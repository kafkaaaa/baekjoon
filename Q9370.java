package stepbystep;

// 백준 최단경로 9370번 - 미확인 도착지
// https://www.acmicpc.net/problem/9370

/* 풀이
    start -> destination 최단거리를 구하는데, 어떤 edge를 지나야 하는 경우.
    (1) start -> g -> h -> dest
    (2) start -> h -> g -> dest
    (1), (2) 중에 짧은 경로가 최단거리
    무방향 그래프 Dijkstra 알고리즘
    Adjacency List, Priority Queue
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q9370 {

    static int n, m, t; // 교차로, 도로, 목적지 후보의 개수
    static int s, g, h; // s: 출발지,  g와 h 교차로 사이에 있는 도로를 지나갔음
    static int a, b, d; // a와 b 사이에 길이가 d인 양방향 도로가 있음
    static int[] destination;  // 목적지 후보들
    static ArrayList<Node>[] list;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = scan.nextInt();

        while (T --> 0) {
            n = scan.nextInt();     // 2 <= n <= 2000
            m = scan.nextInt();     // 1 <= m <= 50000
            t = scan.nextInt();     // 1 <= t <= 100

            list = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                list[i] = new ArrayList<Node>();
            }

            s = scan.nextInt();
            g = scan.nextInt();     // 1 <= s, g, h <= n
            h = scan.nextInt();     // g != h

            for (int j = 0; j < m; j++) {
                a = scan.nextInt();
                b = scan.nextInt();
                d = scan.nextInt();
                list[a].add(new Node(b, d));
                list[b].add(new Node(a, d));
            }

            destination = new int[t];
            for (int k = 0; k < t; k++) {
                destination[k] = scan.nextInt();
            }

            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int dest : destination) {
                long distance1 = Dijkstra(s, h) + Dijkstra(h, g) + Dijkstra(g, dest);
                long distance2 = Dijkstra(s, g) + Dijkstra(g, h) + Dijkstra(h, dest);
                long distance3 = Dijkstra(s, dest);

                // s -> dest로 가는 최단경로가 g,h 혹은 h,g를 지나는 경로면 큐에 추가
                if (Math.min(distance1, distance2) == distance3) {
                    pq.add(dest);
                }
            }

            while (!pq.isEmpty()) {
                sb.append(pq.poll() + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }


    private static long Dijkstra(int start, int end) {

        boolean[] isVisited = new boolean[n + 1];
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Node> q = new PriorityQueue<>();
        q.add(new Node(start, 0));
        dist[start] = 0;

        while (!q.isEmpty()) {
            Node cur = q.poll();
            int v = cur.vertex;

            if (isVisited[v]) continue;
            isVisited[v] = true;

            for (Node node : list[v]) {
                if (dist[node.vertex] > dist[v] + node.weight) {
                    dist[node.vertex] = dist[v] + node.weight;
                    q.add(new Node(node.vertex, dist[node.vertex]));
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
