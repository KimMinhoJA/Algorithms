public class ChangeInteger {
	/**
	 * ���ڿ��� ���� ���� ���ڷ� ��ȯ�ϱ�
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param s
	 * @return
	 */
	public int solution(String s) {
		try {
			return Integer.parseInt(s);
		}catch (Exception e) {
			if(s.charAt(0) == '-') {
				return Integer.parseInt(s.substring(1)) * -1;
			}
			return Integer.parseInt(s.substring(1));
		}
	}
}
