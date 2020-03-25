public class FindKim {
	/**
	 * ���ڿ� �迭���� "Kim"�� �ε��� ã��
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param seoul
	 * @return
	 */
	public String solution(String[] seoul) {
		StringBuilder builder = new StringBuilder();
		builder.append("�輭���� ");
		int index = 0;
		for(String str : seoul) {
			if("Kim".equals(str))
				break;
			index++;
		}
		builder.append(index);
		builder.append("�� �ִ�");
		return builder.toString();
	}

	public static void main(String[] args) {
		FindKim fk = new FindKim();
		String[] seoul = { "kim123", "kim", "Kim", "fff" };
		System.out.println(fk.solution(seoul));
	}
}
