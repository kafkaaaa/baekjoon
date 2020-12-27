package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Back Tracking
// DFS (Depth First Search)

public class NM_15652 {

	public static int N, M;
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[M];

		DFS(1, 0);
		System.out.println(sb);
	}

	public static void DFS(int start, int depth) {

		if (depth == M) {
			for (int value : arr) {
				sb.append(value).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = start; i <= N; i++) {

			arr[depth] = i;
			DFS(i, depth + 1);
		}

	}

}
