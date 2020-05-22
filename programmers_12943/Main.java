package programmers_12943;

import java.util.Scanner;

public class Main {
	/*
	 * �ݶ��� ����
	 * 
	 * �־��� ���� 1�� �� ������ �۾��� �ݺ��� �� 1-1) �Էµ� ���� ¦����� 2�� ������ 1-2) �Էµ� ���� Ȧ����� 3�� ���ϰ�
	 * 1�� ���Ѵ�
	 * 
	 * ����̳� �ݺ��ؾ� �ϴ°�? ��, 500���� �ݺ��ص� 1�� ������ ���� ��� -1�� ��ȯ
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();

		System.out.println(solution(num));
	}

	public static int solution(long n) {
		int cnt = 0;
		while (n != 1) {
			if (cnt >= 500) {
				cnt = -1;
				return cnt;
			}
			if (n % 2 == 0)
				n /= 2;
			else
				n = n * 3 + 1;
			cnt++;
		}

		return cnt;
	}

}
