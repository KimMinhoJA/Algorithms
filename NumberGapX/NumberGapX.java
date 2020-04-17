public class NumberGapX {
	/**
	 * x�������� n��ŭ�� �迭 ����
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param x
	 * @param n
	 * @return
	 */
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		for(int i = 1; i <= n; i++) {
			answer[i - 1] = (long)(x) * i;
		}
		return answer;
	}
}
