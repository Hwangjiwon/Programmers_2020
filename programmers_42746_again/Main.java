package programmers_42746_again;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 5300, 3, 340, 5, 9 };
		System.out.println(solution(numbers));
	}

	public static String solution(int[] numbers) {
		String answer = "";
		String[] num = new String[numbers.length];

		for (int i = 0; i < num.length; i++) {
			num[i] = String.valueOf(numbers[i]);
		}

		// Arrays.sort(num, new Comparator<String>() {
		// @Override
		// public int compare(String o1, String o2) {
		// return (o2 + o1).compareTo(o1 + o2);
		// }
		// });
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("====================");

		Arrays.sort(num, Collections.reverseOrder());
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		System.out.println("******************");
		
		Arrays.sort(num, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		if (num[0].equals("0"))
			return "0";

		for (int i = 0; i < num.length; i++) {
			answer += num[i];
		}
		return answer;
	}
}
