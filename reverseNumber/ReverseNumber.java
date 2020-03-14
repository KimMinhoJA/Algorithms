
public class ReverseNumber {
	/**
	 * ���α׷��ӽ� �������� Ǯ��
	 * https://programmers.co.kr/learn/challenges
	 * ���ڷ� �Է¹��� ���ڸ� �迭 ���·� ����� ��ȯ�Ѵ�.
	 * @param n
	 * @return
	 */
	public int[] solution(long n) {
	      int len = Long.toString(n).length();
	      int[] answer = new int[len];
	      
	      int cur = 0;
	      while(n > 0){
	          answer[cur++] = (int)(n % 10);
	          n /= 10;
	         }
	      
	      return answer;
	  }
}
