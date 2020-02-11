public class Test {
	long sum(int[] a) {
		long ans = 0;
		
		/* 정수 n개가 주어졌을 때, n개의 합을 구하는 함수 */
		for	(int i=0; i<a.length; i++) {
			ans += a[i];
		}
		return ans;
	}
}
