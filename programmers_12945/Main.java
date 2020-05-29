package programmers_12945;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

		System.out.println(solution(n));
	}

	public static int solution(int n) {
		int answer = 0;
		int[] d = new int[n + 1];
		int mod = 1234567;

		d[0] = 0;
		d[1] = 1;

		for (int i = 2; i <= n; i++) {
			d[i] = (d[i - 2] + d[i - 1]) % mod;
		}

		answer = d[n] % mod;
		return answer;
	}
}