package programmers_12901;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 29;
		System.out.println(solution(a, b));
	}

	public static String solution(int a, int b) {
		String answer = "";
		String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int sum = 0;
		for (int i = 0; i < a - 1; i++) {
			sum += date[i];
		}
		sum += (b - 1);
		sum %= 7;
		answer = day[sum];

		return answer;
	}
}
