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
	 * ������
	 * 1. �μ� ��� ����� ���� �տ� �ִ� ������ ������ 
	 * 2. ������ �μ� ��� ��Ͽ��� J���� ���� ������ �Ѱ��� �����ϸ� J�� �� �ڷ� ������ �߿䵵�� Ŭ ���� �߿�
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
