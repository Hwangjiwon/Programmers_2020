package programmers_42587;

import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pri = { 1, 1, 9, 1, 1, 1 };
		int loc = 0;
		int result = solution(pri, loc);

		System.out.println(result);
	}

	/*
	 * 프린터
	 * 1. 인쇄 대기 목록의 가장 앞에 있는 문서를 꺼낸다 
	 * 2. 나머지 인쇄 대기 목록에서 J보다 높은 문서가 한개라도 존재하면 J를 맨 뒤로 보낸다 중요도가 클 수록 중요
	 */
	public static int solution(int[] priorities, int location) {
		int answer = 1;
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (int i = 0; i < priorities.length; i++) {
			q.add(priorities[i]);
		}
		
		while (!q.isEmpty()) {
			for (int i = 0; i < priorities.length; i++) {
				if (priorities[i] == q.peek()) {
					if (i == location) {
						return answer;
					}
					q.poll();
					answer++;
				}
			}
		}
		return answer;
	}

}
