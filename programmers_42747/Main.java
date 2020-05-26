package programmers_42747;

import java.util.Arrays;

public class Main {

	/*
	 * 문제 실행
	 * 
	 * 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 h-Index이다 논문의
	 * 인용 횟수를 담은 배열이 매개변수로 주어질 때 h-index를 return하라
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
