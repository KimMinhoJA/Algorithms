public class CreateNewString {
	/**
	 * ���ڿ��� �������� �����Ͽ� Ȧ����°�� ���ڿ��� �빮�ڷ� �ٲٴ� �޼ҵ�
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param s
	 * @return
	 */
  public String solution(String s) {
		StringBuilder builder = new StringBuilder();
		char[] chArr = s.toCharArray();
		int len = chArr.length;
		int wordlen = 0;
		for(int i = 0; i < len ; i++) {
			if(chArr[i] == ' ') {
				builder.append(' ');
				wordlen = 0;
			}else {
				builder.append(wordlen++%2 == 0 ? Character.toUpperCase(chArr[i]) : Character.toLowerCase(chArr[i]));
			}
		}
		return builder.toString();
	}
}