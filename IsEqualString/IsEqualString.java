public class IsEqualString {
	/**
	 * ���ڿ��� 4 Ȥ�� 6�������� �׸��� ���ڷθ� �̷���� �ִ��� Ȯ��
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param s
	 * @return
	 */
	public boolean solution(String s) {
		if (s.length() == 4 || s.length() == 6) {
			try {
				Integer.parseInt(s);
				return true;
			} catch (Exception e) {
				return false;
			}
		}else
			return false;
	}

}
