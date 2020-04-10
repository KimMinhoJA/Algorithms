import java.util.Arrays;

public class DigitSort {
	/**
	 * ���ڷ� ���� ���� ���� �� �ڸ� ���� ū ������� �����Ͽ� ����Ѵ�.
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param n
	 * @return
	 */
	public long solution(long n) {
		long answer = 0;
		char[] charArr = Long.toString(n).toCharArray();
		
		Arrays.sort(charArr);
		for(int i = charArr.length - 1; i >= 0; i--) {
			answer *= 10;
			answer += charArr[i] - 48;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		DigitSort ds = new DigitSort();
		long a = 578819811;
		System.out.println(ds.solution((a)));
	}
}
