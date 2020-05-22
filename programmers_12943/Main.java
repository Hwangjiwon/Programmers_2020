package programmers_12943;

import java.util.Scanner;

public class Main {
	/*
	 * 콜라츠 추측
	 * 
	 * 주어진 수가 1이 될 때까지 작업을 반복할 것 1-1) 입력된 수가 짝수라면 2로 나눈다 1-2) 입력된 수가 홀수라면 3을 곱하고
	 * 1을 더한다
	 * 
	 * 몇번이나 반복해야 하는가? 단, 500번을 반복해도 1이 나오지 않을 경우 -1을 반환
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();

		System.out.println(solution(num));
	}

	public static int solution(long n) {
		int cnt = 0;
		while (n != 1) {
			if (cnt >= 500) {
				cnt = -1;
				return cnt;
			}
			if (n % 2 == 0)
				n /= 2;
			else
				n = n * 3 + 1;
			cnt++;
		}

		return cnt;
	}

}
