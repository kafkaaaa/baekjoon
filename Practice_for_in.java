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

/*
 * 확장 for문은 향상된 for문, for-in문, for-each문 이라고도 불린다.
 * 확장 for문의 for(int i : a)에서 콜론(:)은  "~의 안에 있는" 이라는 뜻이다. 따라서 for-in문 이라고 불리는 이유이다.
 * 
 * 확장 for문의 장점은 배열의 요소수의 길이를 알아야 하는 번거로움을 줄여준다.
 * 따라서 배열의 모든 요소를 스캔하는 과정에서 인덱스 자체의 값이 필요하지 않으면 확장 for문을 사용하는 것이 좋다.


 * 출처: https://hyeon424.tistory.com/entry/Java-일반-for문과-확장-for문향상된-for문의-비교
 */
