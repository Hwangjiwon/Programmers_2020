package programmers_12947;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/*
	 * 하샤드 수
	 * 
	 * 양의정수 x의 자릿수의 합으로 x가 나누어 지는 경우 하샤드 수이다. 18의 경우 1+8=9이고, 18은 9로 나누어지기에 하샤드
	 * 수 이다 x를 입력받아 하샤드 수인지 검사하시오
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		System.out.println(solution(x));
		br.close();
	}

	public static boolean solution(int x) {
		boolean answer = false;
		String num = String.valueOf(x);

		char[] tmp = num.toCharArray();
		int sum = 0;

		for (int i = 0; i < tmp.length; i++) {
			sum += (tmp[i] - '0');
		}
		System.out.println(sum + ",");
		if (x % sum == 0)
			answer = true;

		return answer;
	}

}
