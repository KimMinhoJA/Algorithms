package date0402;

public class AverageArray {
	/**
	 * �迭�� ������ ��� ���ϱ�
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param arr
	 * @return
	 */
	public double solution(int[] arr) {
		double answer = 0;
		for(int i : arr) {
			answer += i;
		}
		return answer / arr.length;
	}
}
