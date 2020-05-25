package programmers_42883;

public class Main {
	/*
	 * ū �� �����
	 * 
	 * � ���ڿ��� k���� ���� ���� ���� �� ���� �� �ִ� ���� ū �� ���ϱ�
	 */

	public static void main(String[] args) {
		String num = "4177252841";
		int k = 4;

		System.out.println(solution(num, k));

	}

	public static String solution(String number, int k) {
		String answer = "";
		StringBuilder sb = new StringBuilder();

		int cnt = number.length() - k;
		int left = 0, right = 0, idx = 0;
		int max = -1;

		while (cnt > 0) {
			max = -1;
			right = number.length() - cnt;

			for (int j = left; j <= right; ++j) {
				int num = number.charAt(j) - '0';
				if (num > max) {
					idx = j;
					max = num;
				}
			}
			sb.append(number.charAt(idx));
			left = idx + 1;
			cnt--;
		}
		answer = sb.toString();
		return answer;
	}
}
