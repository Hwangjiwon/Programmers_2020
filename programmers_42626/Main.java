package programmers_42626;

import java.util.PriorityQueue;

public class Main {

	/*
	 * �� �ʰ�
	 * 
	 * ���� ���� = ���� �ȸ� + �ι�° �� ��*2 ��� ������ K�̻��� �� �� ���� �ݺ� �ּ� Ƚ��? --> �켱���� ť
	 */

	public static void main(String[] args) {
		int[] s = { 1, 2, 3, 9, 10, 12 };
		int k = 7;

		System.out.println(solution(s, k));

	}

	public static int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> heap = new PriorityQueue<>();

		for (int s : scoville) {
			heap.add(s);
		}

		while (heap.peek() <= K) {
			if (heap.size() == 1) {
				return -1;
			}

			int a = heap.poll();
			int b = heap.poll();

			int mix = a + b * 2;
			heap.add(mix);

			answer++;
		}

		return answer;
	}
}
