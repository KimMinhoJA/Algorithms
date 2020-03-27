import java.util.List;
import java.util.ArrayList;

public class UniqueNumber {
	/**
	 * arr�迭���� ��� ������ ������ ���� ������ �Ѵ�.
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param arr
	 * @return
	 */
	public int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		int[] answer = null;
		int cur = 10;
		for (int i : arr) {
			if (cur != i) {
				cur = i;
				list.add(cur);
			} else {
				continue;
			}
		}
		int len = list.size();
		answer = new int[len];

		for (int i = 0; i < len; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

}
