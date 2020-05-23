package programmers_42840;

import java.util.LinkedList;

public class Main {

	/*
	 * 모의고사
	 * 
	 * 1번: 12345/12345/... 2번: 21232425/21232425/... 3번: 3311224455/3311224455/...
	 * 
	 * 정답이 answers로 주어졌을 때 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers = { 1, 3, 2, 4, 2 };

		System.out.println(solution(answers));
	}

	public static int[] solution(int[] answers) {
		int[] answer = {};
		int[] num1 = { 1, 2, 3, 4, 5 };
		int[] num2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] num3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int[] cnt = { 0, 0, 0 };
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < answers.length; i++) {
			if (num1[i % num1.length] == answers[i])
				cnt[0]++;

			if (num2[i % num2.length] == answers[i])
				cnt[1]++;

			if (num3[i % num3.length] == answers[i])
				cnt[2]++;
		}

		max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
		LinkedList<Integer> tmp = new LinkedList<>();
		for (int i = 0; i < 3; i++) {
			if (cnt[i] == max) {
				tmp.add(i + 1);
			}
		}
		
		answer = new int[tmp.size()];
		for (int i = 0; i < tmp.size(); i++) {
			answer[i] = tmp.get(i);
		}
		return answer;
	}
}
