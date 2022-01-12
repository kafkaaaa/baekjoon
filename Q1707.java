package stepbystep;

// 백준 DFS & BFS 1707번 : 이분 그래프 판별
// https://www.acmicpc.net/problem/1707

/* 풀이
    이분 그래프 (Bipartite Graph) : 그래프의 정점의 집합을 둘로 분할하여,
    각 집합에 속한 정점끼리는 서로 인접하지 않도록 분할할 수 있다.
    => 인접한 정점은 색깔이 다른 그래프. (색깔 2개)
        => BFS/DFS 알고리즘으로 그래프의 정점들을 탐색하면서
            색이 같은 정점이 연결되어 있으면 -> 이분그래프 아님. (NO)
        **모든 정점이 연결되어 있지 않은 경우를 대비해서 모든 정점을 탐색해야 함.

    1. 두 집합이 있다. (color1, color2)
    2. 주어진 그래프의 인접노드를 방문하면서 (아직 방문하지 않은 노드면) 다른 색으로 표시.
    3. 이미 방문한 노드면 -> 현재 노드와 같은 색이면 이분그래프 아님. (NO)
    4. 그래프의 모든 노드에 대한 탐색이 끝나면 이분그래프. (YES)
*/


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1707 {

    static int V, E;    // vertex, edge
    static int[] color; // 0: 방문x,  1: 1번색 그룹,  2: 2번색 그룹
    static ArrayList<Integer>[] arr;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        while (T --> 0) {
            V = scan.nextInt();
            E = scan.nextInt();

            arr = new ArrayList[V + 1];
            color = new int[V + 1];

            for (int i = 1; i < V + 1; i++) {
                arr[i] = new ArrayList<>();
            }

            for (int i = 0; i < E; i++) {
                int v1 = scan.nextInt();
                int v2 = scan.nextInt();
                arr[v1].add(v2);
                arr[v2].add(v1);
            }
            isBiGraph();
        }
    }

    private static void isBiGraph() {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i < V + 1; i++) {
            if (color[i] == 0) {
                color[i] = 1;
                q.add(i);
            }

            while (!q.isEmpty()) {
                int cur = q.poll();
                for (int next : arr[cur]) {
                    if (color[cur] == color[next]) {    // 같은색이면
                        System.out.println("NO");
                        return;
                    }

                    if (color[next] == 0) {  // 아직 방문하지 않았으면
                        q.add(next);
                        if (color[cur] == 1) color[next] = 2;
                        else color[next] = 1;
                    }
                }
            }
        }

        System.out.println("YES");
    }
}
