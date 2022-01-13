package stepbystep;

// 백준 1753번 - 최단경로
// https://www.acmicpc.net/problem/1753

/* 풀이
    방향그래프가 주어지면 주어진 시작점에서 다른 모든 정점으로의 최단 경로를 구하는 프로그램
    Dijkstra Algorithm - Adjacency List, Priority queue
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q1753 {

    static int V, E, start;
    static int[] dist;  // 주어진 시작점으로부터 각 정점까지의 최단거리 저장
    static ArrayList<Node>[] list;  // 인접리스트

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        V = scan.nextInt(); // 1 <= V <= 20,000
        E = scan.nextInt(); // 1 <= E <= 300,000
        start = scan.nextInt(); // 시작 정점의 번호 (1 <= K <= V)

        dist = new int[V+1];
        list = new ArrayList[V+1];
        for (int i=1; i<=V; i++) {  // 정점 1번 ~ V번
            list[i] = new ArrayList<>();
        }

        // 초기화
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;    // 시작점 ~ 시작점 거리는 0.

        // Edge 입력 (u -> v로 가는 가중치 w인 간선)
        for (int i=0; i<E; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            int w = scan.nextInt();
            list[u].add(new Node(v, w));
        }

        Dijkstra();

        for (int i=1; i<=V; i++) {
            if (dist[i] == Integer.MAX_VALUE) System.out.println("INF");
            else System.out.println(dist[i]);
        }

    }


    private static void Dijkstra() {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
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
