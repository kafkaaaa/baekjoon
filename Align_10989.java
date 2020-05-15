package stepbystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// �ð����� : 3��
public class Align_10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());	// cnt : �Է¹޴� ������ ����
		int [] num = new int[10001];	// 10000���� �ڿ���
		
		for (int i=0; i<cnt; i++) {		// num[�Է¹��� ��] �迭�� ++
			num[Integer.parseInt(br.readLine())]++;
		}
		
		for (int i=0; i<num.length; i++) {
			if(num[i] > 0) {	// ����� ���ڰ� �ִ� �迭�̸�...
				for (int j=0; j<num[i]; j++) {
					bw.write(Integer.toString(i) + "\n");
				}
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}