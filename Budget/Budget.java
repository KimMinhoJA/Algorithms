import java.util.Arrays;

public class Budget {
	/**
	 * ���� budget������ �μ��� ��û�ݾ��� ��� d�迭�� ���� ���� �����ֵ��� �Ѵ�.
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param d
	 * @param budget
	 * @return
	 */
	public int solution(int[] d, int budget) {
		int answer = 0;
		
		Arrays.sort(d);
		
		for(int i : d) {
			budget -= i;
			if(budget >= 0) {
				answer++;
			}else {
				break;
			}
		}
		return answer;
	}
}
