package stepbystep;

public class Practice_for_in {

	public static void main(String[] args) {
		
		int[] a = { 1, 2, 3, 4, 5 };
		int sum1 = 0, sum2 = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum1 += a[i];
		}
		
		System.out.println("기본 for문을 활용한 배열 a의 모든 요소의 합은 " + sum1 + "입니다.");
		
		for (int i : a) {
			sum2 += i;
		}
		
		System.out.println("확장 for문을 활용한 배열 a의 모든 요소의 합은 " + sum2 + "입니다.");
	}
}
