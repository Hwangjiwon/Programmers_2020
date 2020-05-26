package programmers_43163;

import java.util.LinkedList;
import java.util.Queue;

class Link {
	String from;
	int cnt;

	Link(String from, int cnt) {
		this.from = from;
		this.cnt = cnt;
	}
}

public class Main {
	/*
	 * 단어 변환
	 * 
	 * 한번에 한 개의 알파벳만 바꿀 수 있음 words에 있는 단어로만 변환 가능
	 * 
	 */

	public static void main(String[] args) {
		String be = "hit";
		String tar = "cog";
		String[] words = { "hot", "dot", "dog", "lot", "log", "cog" };

		System.out.println(solution(be, tar, words));
	}

	public static int solution(String begin, String target, String[] words) {
		int answer = 0;

		Queue<Link> q = new LinkedList<Link>();
		boolean[] visited = new boolean[words.length];

		q.add(new Link(begin, 0));

		while (!q.isEmpty()) {
			Link l = q.poll();
			String dw = l.from;
			int dc = l.cnt;

			if (dw.equals(target)) {
				answer = dc;
				break;
			}

			for (int i = 0; i < words.length; i++) {
				if (!visited[i] && isOk(dw, words[i])) {
					visited[i] = true;
					q.add(new Link(words[i], dc + 1));
				}
			}
		}

		return answer;
	}

	public static boolean isOk(String w1, String w2) {
		int cnt = 0;
		for (int i = 0; i < w1.length(); i++) {

			if (w1.charAt(i) != w2.charAt(i))
				cnt++;

			if (cnt >= 2)
				return false;

		}
		return true;
	}

}
