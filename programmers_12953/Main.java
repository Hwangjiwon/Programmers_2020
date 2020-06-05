package programmers_12953;

public class Main {
	/*
	 * N개의 최소공배수 => 유클리드 호제법 두 수를 곱핟 뒤 이 두 수의 최대공약수로 나누면 최소공배수
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 10 };
		System.out.println(solution(arr));
	}

	public static int solution(int[] arr) {
		int answer = arr[0];

		for (int i = 1; i < arr.length; i++) {
			answer = lcm(answer, arr[i]);
		}

		return answer;
	}

	public static int lcm(int a, int b) {
		if (a <= 0 || b <= 0)
			return -1;

		return a * b / gcd(a, b);
	}

	public static int gcd(int a, int b) {
		int tmp;
		while (b != 0) {
			tmp = b;
			b = a % b;
			a = tmp;
		}

		return a;
	}
}
