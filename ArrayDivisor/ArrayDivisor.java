import java.util.ArrayList;
import java.util.List;

public class ArrayDivisor {
	/**
	 * �迭�� ���� divisor�� ������ �� ���� �������� ������ �迭�� ��Ƽ� ��ȯ
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param arr
	 * @param divisor
	 * @return
	 */
	public int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<>();
		for (int i : arr) {
			if (i % divisor == 0)
				list.add(i);
		}
		list.sort(null);

		int[] answer = null;
		int len = list.size();
		if (len == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[len];
			for (int i = 0; i < len; i++) {
				answer[i] = list.get(i);
			}
		}

		return answer;
	}
}
