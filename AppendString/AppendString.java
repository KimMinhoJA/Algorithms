public class AppendString {
	/**
	 * ���ڿ� n��ŭ �̾���̱�
	 * @param n
	 * @return
	 */
	public String solution(int n) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < n; i++) {
				builder.append(i % 2 == 0 ? "��" : "��");
		}
		return builder.toString();
	}
}
