package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// Greedy Algorithm
// https://www.acmicpc.net/problem/1931

public class MeetingRoom_1931 {

	public static void main(String[] args) throws IOException {
		
		// Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		// time[i][0] = 시작시간,  time[i][1] = 종료시간
		int[][] time = new int[N][2];
		
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			time[i][0] = Integer.parseInt(st.nextToken()); 
			time[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// Solve
		Arrays.sort(time, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] start, int[] end) {
				if (start[1] == end[1]) {		// 시작시간 == 종료시간인 경우 예외처리 :
					return start[0] - end[0];	// 시작시간 순으로 오름차순 정렬
				}
				return start[1] - end[1];		// 종료시간 순으로 오름차순 정렬
			}
		});
					
		int cnt = 0;			// 회의 진행 수
		int currentTime = 0;	// 현재 회의가 끝난 시간
		
		for (int i=0; i<N; i++) {
			// 현재 회의시간 갱신
			if (currentTime <= time[i][0]) {
				currentTime = time[i][1];
				cnt++;
			}
		}
		
		// Output
		System.out.println(cnt);
	}

}
