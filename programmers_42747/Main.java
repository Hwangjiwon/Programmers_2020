package programmers_42747;

import java.util.Arrays;

public class Main {

	/*
	 * ���� ����
	 * 
	 * �� n�� ��, h�� �̻� �ο�� ���� h�� �̻��̰� ������ ���� h�� ���� �ο�Ǿ��ٸ� h�� �ִ��� h-Index�̴� ����
	 * �ο� Ƚ���� ���� �迭�� �Ű������� �־��� �� h-index�� return�϶�
	 */

	public static void main(String[] args) {
		int[] arr = { 22, 42 }; // 0 1 3 5 6
		System.out.println(solution(arr));
	}

	public static int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);

		for (int i = 0; i <= citations[citations.length - 1]; i++) {
			int h = i;
			int cnt = 0;
			for (int j = 0; j < citations.length; j++) {
				if (citations[j] >= h) {
					cnt++;
				}
			}
			if (cnt >= h) {
				// System.out.println(cnt);
				answer = Math.max(answer, h);
			}
		}

		return answer;
	}
}
