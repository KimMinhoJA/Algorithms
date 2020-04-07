public class FindGCDLCM {
	/**
	 * ���ڷ� ���� �� ���� �ּҰ������ �ִ����� ���ϱ�
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param n
	 * @param m
	 * @return
	 */
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		answer[1] = m * n;
		int temp = 0;
		while(m % n != 0) {
			temp = n;
			n = m % n;
			m = temp;
		}
		answer[0] = n;
		answer[1] = answer[1] / n;
		
		return answer;
	}
}
