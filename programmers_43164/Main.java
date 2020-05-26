package programmers_43164;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {

	/*
	 * ���� ���
	 * 
	 * ICN���� ����ؼ� ��� �װ����� �̿��Ͽ� ������ ¥�� --> dfs 2�� �̻��� ��ΰ� ������ ��� ���ĺ������� �ռ� ������
	 * ����
	 * 
	 */

	public static LinkedList<String> link = new LinkedList<>();
	public static boolean[] visited;
	public static String router = "";

	public static void main(String[] args) {
		// String[][] tickets = { { "ICN", "COO" }, { "ICN", "BOO" }, { "COO",
		// "ICN" }, { "BOO", "DOO" } };
		// String[][] tickets = { { "ICN", "SFO" }, { "ICN", "ATL" }, { "SFO",
		// "ATL" }, { "ATL", "ICN" }, { "ATL", "SFO" } };
		String[][] tickets = { { "ICN", "SFO" }, { "SFO", "ICN" }, { "ICN", "SFO" }, { "SFO", "QRE" } };

		visited = new boolean[tickets.length];
		System.out.print(solution(tickets));

	}

	public static String[] solution(String[][] tickets) {
		String[] answer = new String[tickets.length + 1];
		visited = new boolean[tickets.length];

		// to �κ� ���ĺ� ������ ����
		Arrays.sort(tickets, new Comparator<String[]>() {
			public int compare(String[] arr1, String[] arr2) {
				if (((Comparable) arr1[1]).compareTo(arr2[1]) > 0)
					return 1;
				else
					return -1;
			}
		});

		for (int i = 0; i < tickets.length; i++) {
			System.out.println(tickets[i][0] + " : " + tickets[i][1]);
		}

		for (int i = 0; i < tickets.length; i++) {
			String from = tickets[i][0];
			String to = tickets[i][1];

			if (from.equals("ICN")) {
				visited[i] = true;
				router = from + "->";
				dfs(to, tickets, 1);
				visited[i] = false;
			}
		}

		answer = link.get(0).split("->");

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		return answer;
	}

	public static void dfs(String go, String[][] tickets, int cnt) {
		router += (go + "->");

		if (cnt == tickets.length) {
			if (link.size() == 0)
				link.add(router);
			return;
		}

		for (int i = 0; i < tickets.length; i++) {
			String from = tickets[i][0];
			String to = tickets[i][1];

			if (!visited[i] && go.equals(from)) {
				visited[i] = true;
				dfs(to, tickets, cnt + 1);
				visited[i] = false;
			}
		}
	}
}
