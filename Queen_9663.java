package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Back Tracking
// DFS (Depth First Search)

public class Queen_9663 {

	public static int N;
	public static int count = 0;
	public static int[] arr;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];

		DFS(0);
		System.out.println(count);

	}

	public static void DFS(int depth) {

		if (depth == N) {
			count++;
			return;
		}

		for (int i = 0; i < N; i++) {
			arr[depth] = i;

			if (isPossible(depth)) {
				DFS(depth + 1);
			}
		}

	}

	public static boolean isPossible(int col) {

		for (int i = 0; i < col; i++) {

			if (arr[col] == arr[i]) {
				return false;
			}
			else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}

		return true;
	}

}
