package programmers_42839;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Main {
	/*
	 * 소수찾기
	 * 
	 * 숫자 하나씩 뭍여서 몇개 소수 만들 수 있는가
	 */

	public static boolean[] visited;
	public static int cnt;
	public static Set<Integer> num = new LinkedHashSet<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numbers = "011";
		solution(numbers);
	}

	public static int solution(String numbers) {
		int answer = 0;
		visited = new boolean[numbers.length()];

		dfs(numbers.length(), numbers, "0");
		System.out.println(num.size());

//		Iterator<Integer> e = num.iterator();
//		while (e.hasNext()) {
//			System.out.println(e.next());
//		}
		answer = num.size();
		return answer;
	}

	public static void dfs(int len, String numbers, String result) {

		for (int i = 0; i < len; i++) {
			if (!visited[i]) {
				visited[i] = true;
				dfs(len, numbers, result + numbers.charAt(i));
				visited[i] = false;
			}
		}
		// System.out.println(result);
		// 숫자로 변환 후 소수인지 판별 하고 cnt증가
		// System.out.println(Integer.parseInt(result));
		// System.out.println();
		if (chk(Integer.parseInt(result))) {
			num.add(Integer.parseInt(result));
		}

	}

	public static boolean chk(int number) {
		if (number <= 1)
			return false;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
