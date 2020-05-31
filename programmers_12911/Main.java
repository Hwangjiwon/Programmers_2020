package programmers_12911;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		int answer = n;
		String target = Integer.toBinaryString(n);
		int cnt = 0;
//		for (int i = 0; i < target.length(); i++) {
//			if (target.charAt(i) == '1')
//				cnt++;
//		}
		
		cnt = Integer.bitCount(n);
		
		while (true) {
			answer++;
			int tmp = 0;
//			String tmpB = Integer.toBinaryString(answer);
//			for (int i = 0; i < tmpB.length(); i++) {
//				if (tmpB.charAt(i) == '1')
//					tmp++;
//			}
			tmp = Integer.bitCount(answer);
			
			if(cnt == tmp)
				break;
		}
		return answer;
	}
}
