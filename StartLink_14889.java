package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Back Tracking

public class StartLink_14889 {
	
	static int N;					// 총 인원수 : N명
	static int[][] stats;			// 각 능력치 저장 2차원 배열
	static boolean[] isStartTeam;	// Start팀 여부 플래그
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		isStartTeam = new boolean[N];
		
		stats = new int[N][N];
		// stats 2차원배열에 각 능력치 입력받기
		for (int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j=0; j<N; j++) {
				stats[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		backTracking(0, 0);
		System.out.println(min);
	}
		
	static void backTracking(int idx, int person) {
		// Start와 Link팀은 N/2 명씩 나뉜다 (N은 항상 짝수로 주어짐)
		if (person == N/2) {	// 인원수가 반절이 되면
			divideTeam();		// Start와 Link 팀으로 나눈다.
		}
		
		for (int i=idx; i<N; i++) {
			isStartTeam[i] = true;
			backTracking(i+1, person+1);
			isStartTeam[i] = false;
		}
		
	}
	
	static void divideTeam() {
		
		int sumOfStart = 0;
		int sumOfLink = 0;
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				// i번 사람과 j번 사람이 같은팀이면 능력치를 더해준다
				// ** i번 사람과 j번사람이 같은팀일때 더해지는 능력치는 S(ij), S(ji) 총 2개로 다를 수 있다.
				
				// 둘다 Start팀인 경우
				if (isStartTeam[i] && isStartTeam[j]) {
					sumOfStart += stats[i][j];
				}
				// 둘다 Link팀인 경우
				if (!isStartTeam[i] && !isStartTeam[j]) {
					sumOfLink += stats[i][j];
				}
			}
		}		// 최소값 갱신
		min = Math.min(min, Math.abs(sumOfStart - sumOfLink));
	}
	
}
