package stepbystep;

public class Practice_for_in {

	public static void main(String[] args) {
		
		int[] a = { 1, 2, 3, 4, 5 };
		int sum1 = 0, sum2 = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum1 += a[i];
		}
		
		System.out.println("�⺻ for���� Ȱ���� �迭 a�� ��� ����� ���� " + sum1 + "�Դϴ�.");
		
		for (int i : a) {
			sum2 += i;
		}
		
		System.out.println("Ȯ�� for���� Ȱ���� �迭 a�� ��� ����� ���� " + sum2 + "�Դϴ�.");
	}
}
