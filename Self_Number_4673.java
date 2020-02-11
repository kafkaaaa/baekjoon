package stepbystep;

public class Self_Number_4673 {

	public static void main(String[] args) {
		
		int[] arr = new int[10001];
		
		for (int i=1; i<=arr.length; i++) {
			int result = self_num(i);
			if(result <= 10000) {
				arr[result] = 1;
			}
		}
		
		for (int i=1; i<arr.length; i++) {
			if (arr[i] != 1) {					// arr[i]가  셀프넘버 이면 출력
				System.out.println(i);
			}
		}
}
				
		
public static int self_num(int num) {
		int result = num;
	
		while (num > 0) {
			result += num % 10;
			num /= 10;
		}
	
		return result;
}
}