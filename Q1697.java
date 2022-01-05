package stepbystep;

// 백준 DFS & BFS 1697번
// https://www.acmicpc.net/problem/1697

/* 풀이
    위치 N, K가 주어지고, N에서 1초에 +-1 또는 x2로 이동할 수 있다.
    N == K가 되는 최소 시간을 구하면 된다.
    이동 가능한 위치들을 BFS 알고리즘으로 방문해나가는데,
    현재 위치에서 이동 가능한 후보군들을 이전에 방문했는지 확인하고,
    방문하지 않았으면 -> 현재 위치까지 가는 데 최소 시간 +1초를 저장해둔다.
    **예외1 : N > K로 시작하는 경우 (수빈이의 위치 > 동생의 위치)
            -> 1초에 -1씩 이동하는 것이 최소임. (time = N - K)
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1697 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        if(N >= K)  System.out.println(N- K);   // 예외1
        else
            System.out.println(BFS(N, K));
    }


    static int BFS(int n, int k) {

        Queue<Integer> q = new LinkedList<>();
        int[] arr = new int[100001];   // 0 <= N,K <= 100000
        q.add(n);
        arr[n] = 1;

        while (!q.isEmpty()) {
            int cur = q.poll();

            // +1, -1, x2
            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) next = cur - 1;
                else if (i == 1) next = cur + 1;
                else next = cur * 2;

                if (next == k)
                    return arr[cur];    // 탐색 종료

                if (0 <= next && next <= 100000) {
                    if (arr[next] == 0) {   // 아직 방문하지 않았으면
                        q.add(next);        // 큐에 삽입
                        arr[next] = arr[cur] + 1;   // +1초
                    }
                }
            }
        }
        return 0;
    }

}
