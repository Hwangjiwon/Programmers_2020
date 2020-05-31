package programmers_12951;

public class Main {
	/*
	 * JadenCase 문자열 만들기
	 * 
	 * 모든단어의 첫문자가 대문자, 그외에는 소문자
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "for    the last week";
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		String answer = "";
		s = s.toLowerCase();
		char[] tmp = s.toCharArray();

		for (int i = 0; i < tmp.length; i++) {
			if (i == 0 || tmp[i - 1] == ' ') {
				tmp[i] = String.valueOf(tmp[i]).toUpperCase().charAt(0);
			}
			answer += String.valueOf(tmp[i]);
		}

		return answer.trim();
	}
}
