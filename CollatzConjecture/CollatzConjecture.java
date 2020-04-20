public class CollatzConjecture {
	/**
	 * �ݶ��� �������� �ݺ�Ƚ���� ��ȯ�Ѵ�. �ݺ�Ƚ���� 500�� �Ѿ�� -1�� ��ȯ�Ѵ�.
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param num
	 * @return
	 */
	public int solution(int num) {
		int index = 0;
		for(;index < 500 && num != 1; index++) {
			num = num % 2 == 1 ? num * 3 + 1 : num / 2;
		}
		if(index == 500)
			return -1;
		return index;
	}
}
