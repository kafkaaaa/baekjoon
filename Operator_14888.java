package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Back Tracking
// DFS (Depth First Search)

public class Operator_14888 {
	
	static int[] num;
	static int[] op;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		
		StringTokenizer st;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nOfNums = Integer.parseInt(br.readLine());
		
		num = new int[nOfNums];
		op = new int[4];	// 0~3 : +, -, *, / 연산자의 개수를 담는 배열
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<nOfNums; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<4; i++) {
			op[i] = Integer.parseInt(st.nextToken());
		}
		
		DFS(num, op, num[0], 1);
		
		System.out.println(max);
		System.out.println(min);
		
	}
	
	static void DFS(int[] num, int[] op, int n, int index) {
		
		if (index == num.length) {
			max = Math.max(n, max);
			min = Math.min(n, min);
			return;
		}
		
		for (int i=0; i<4; i++) {
			if (op[i] != 0) {
				op[i]--;
				
				switch(i) {
				case 0: DFS(num, op, n + num[index], index+1); break;
				case 1: DFS(num, op, n - num[index], index+1); break;
				case 2: DFS(num, op, n * num[index], index+1); break;
				case 3: DFS(num, op, n / num[index], index+1); break;
				}
				
				op[i]++;
			}
		}
				
	}
	
}
