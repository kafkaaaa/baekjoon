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

/*
 * Ȯ�� for���� ���� for��, for-in��, for-each�� �̶�� �Ҹ���.
 * Ȯ�� for���� for(int i : a)���� �ݷ�(:)��  "~�� �ȿ� �ִ�" �̶�� ���̴�. ���� for-in�� �̶�� �Ҹ��� �����̴�.
 * 
 * Ȯ�� for���� ������ �迭�� ��Ҽ��� ���̸� �˾ƾ� �ϴ� ���ŷο��� �ٿ��ش�.
 * ���� �迭�� ��� ��Ҹ� ��ĵ�ϴ� �������� �ε��� ��ü�� ���� �ʿ����� ������ Ȯ�� for���� ����ϴ� ���� ����.


 * ��ó: https://hyeon424.tistory.com/entry/Java-�Ϲ�-for����-Ȯ��-for������-for����-��
 */
