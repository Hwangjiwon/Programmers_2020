package programmers_12948;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "01033334444";
		String result = solution(p);
		System.out.println(result);
	}

	public static String solution(String phone_number) {
		String answer = "";
		int len = phone_number.length();
		for (int i = 0; i < len - 4; i++) {
			answer += "*";
		}
		for (int i = len - 4; i < len; i++) {
			answer += phone_number.charAt(i);
		}

		return answer;
	}
}
