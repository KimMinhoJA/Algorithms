public class AppendString {
	/**
	 * ���ڿ� n��ŭ �̾���̱�
	 * @param n
	 * @return
	 */
	/*3�׿����� ���
	public String solution(int n) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < n; i++) {
				builder.append(i % 2 == 0 ? "��" : "��");
		}
		return builder.toString();
	}
	*/
	//2���� �̾� ���̱�
	public String solution(int n) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < n/2; i++) {
				builder.append("����");
		}
        if(n % 2 == 1){
            builder.append("��");
        }
		return builder.toString();
	}
}
