package programmers_12947;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/*
	 * �ϻ��� ��
	 * 
	 * �������� x�� �ڸ����� ������ x�� ������ ���� ��� �ϻ��� ���̴�. 18�� ��� 1+8=9�̰�, 18�� 9�� ���������⿡ �ϻ���
	 * �� �̴� x�� �Է¹޾� �ϻ��� ������ �˻��Ͻÿ�
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		System.out.println(solution(x));
		br.close();
	}

	public static boolean solution(int x) {
		boolean answer = false;
		String num = String.valueOf(x);

		char[] tmp = num.toCharArray();
		int sum = 0;

		for (int i = 0; i < tmp.length; i++) {
			sum += (tmp[i] - '0');
		}
		System.out.println(sum + ",");
		if (x % sum == 0)
			answer = true;

		return answer;
	}

}
