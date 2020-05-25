package programmers_42883;

public class Main {
	/*
	 * 큰 수 만들기
	 * 
	 * 어떤 숫자에서 k개의 수를 제거 했을 때 얻을 수 있는 가장 큰 수 구하기
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
