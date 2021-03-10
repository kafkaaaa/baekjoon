package stepbystep;

import java.util.Scanner;

// Binary Search
// https://www.acmicpc.net/problem/1300

public class Q_1300 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        scan.close();
 
        long left = 1;
        long right = K;
        long mid;
        long result = 0;
        
        // binary search
        while (left <= right) {
            mid = (left + right) / 2;
            long cnt = 0;
            
            // mid 이하의 수의 개수를 카운트
            for (int i = 1; i <= N; i++) {
                cnt += Math.min(mid / i, N);
            }
 
            if (cnt < K) {
                left = mid + 1;
            }
            else {
                result = mid;
                right = mid - 1;
            }
            
        }
        System.out.println(result);
        
    }
}

