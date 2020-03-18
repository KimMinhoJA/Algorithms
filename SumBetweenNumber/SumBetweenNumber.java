
public class SumBetweenNumber {
	/**
	 * �� ���� a,b ������ ��� ������ �� ���ϱ�
	 * ��ó :  https://programmers.co.kr/learn/challenges
	 * @param a
	 * @param b
	 * @return
	 */
	public long solution(int a, int b) {
	      long answer = 0;
	      long counts = a > b ? a - b + 1 : b - a + 1;
	      if(counts % 2 == 1) {
	    	  answer = (a + b) / 2 * counts;
	      }else {
	    	  answer = (a + b) * counts / 2; 
	      }
	      return answer;
	  }
}
