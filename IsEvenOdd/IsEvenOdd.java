public class IsEvenOdd {
	/**
	 * ���ڷ� ���� ���ڰ� ¦���̸� "Even" Ȧ���̸� "Odd"�� ��ȯ
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param num
	 * @return
	 */
	public String solution(int num) {
		return Math.abs(num) % 2 == 1 ? "Odd" : "Even";
	}
	
	public static void main(String[] args) {
		IsEvenOdd is = new IsEvenOdd();
		System.out.println(is.solution(-3));
	}
}
