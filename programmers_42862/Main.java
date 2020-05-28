package programmers_42862;

public class Main {
	/*
	 * 체육복
	 * 
	 * 전체 학생수 n 여벌 체육복이 있는 reserve사람이 바로 앞사람 또는 뒷사람의 lost에게 체육복 빌려줄 수 있음 체육수업 들을
	 * 수 있는 학생의 최댓값을 구하라 체육복 가져온 사람이 도난당했을 수도 있음 이 경우에는 체육복 빌려줄 수 없음
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 1, 3, 5 };

		System.out.println(solution(n, lost, reserve));
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int lost1 = 0;
		int count = 0;

		// 여벌 옷을 가지고 있는 학생이 도난 당하면 빌려줄 수 없도록 만든다.
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					lost1++;
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}

		// 옷을 빌려주고 -1로 만들어 뒤의 학생에게 빌려주지 않게 한다.
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) {
					count++;
					reserve[j] = -1;
					break;
				}
			}
		}
		// answer은 전체 학생수에서 잃어버린 학생 수를 뺀다.
		// 후에 여벌옷을 가진 학생이 도난 당했으면 그 수만큼 더해주고 옷을 빌려준 학생 수 만큼 다시 더해준다.
		answer = n - lost.length + lost1 + count;

		return answer;
	}

}
