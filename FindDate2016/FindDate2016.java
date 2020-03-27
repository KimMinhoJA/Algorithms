public class FindDate2016 {
	/**
	 * 2016���� a�� b���� ���� ������ ���� ��ȯ
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param a
	 * @param b
	 * @return
	 */
	public String solution(int a, int b) {
		String[] days = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
		int first = 5;
		int gap = 0;
		for(int i = 0; i < a - 1; i++) {
			gap += months[i];
		}
		gap = gap + first + (b - 1);
		return days[gap % 7];
	}
}
