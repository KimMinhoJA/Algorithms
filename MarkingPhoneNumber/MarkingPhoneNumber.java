import java.util.Arrays;

public class MarkingPhoneNumber {
	/**
	 * ���ڷ� ���� �ڵ�����ȣ�� ��4�ڸ��� ������ ��ȣ�� *�� �ٲٱ� 
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param phone_number
	 * @return
	 */
	public String solution(String phone_number) {
		StringBuilder builder = new StringBuilder();
		int len = phone_number.length();
		char [] charArr = new char[len - 4];
		Arrays.fill(charArr,'*');
		builder.append(charArr);
		builder.append(phone_number.substring(len - 4));
		return builder.toString();
	}
}
