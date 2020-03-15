
public class CenterString {
	/**
	 * ���ڷ� ���� ���ڿ��� ��� ���ڸ� ��ȯ
	 * ���ڿ��� ���̰� Ȧ���̸� ���� 1��, ¦���̸� ���� 2���� ��ȯ
	 * @param s
	 * @return
	 */
	public String solution(String s) {
		int len = s.length();
		int even = len%2 == 0 ? 1 : 0;
		String answer = s.substring(len / 2 - even, len / 2 + len % 2 + even);
		return answer;
	}
	
	public static void main(String[] args) {
		CenterString cs = new CenterString();
		System.out.println(cs.solution("1234"));
	}
}
