public class IsSquared {
	/**
	 * n�� Ư������ ���������� �Ǻ��Ͽ� �����̸� �������� x���� �� x+1�� ������ ��ȯ
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param n
	 * @return
	 */
	public long solution(long n) {
		int sqr = (int)Math.sqrt(n);
		if(Math.pow(sqr,2) == n) {
			return (long)Math.pow(sqr + 1, 2);
		}
		return -1;
	}
}
