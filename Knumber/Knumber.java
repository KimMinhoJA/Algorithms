import java.util.Arrays;
public class Knumber {
	/**
	 * commands�� n * 3���� ������ ������ �迭�̴�.
	 * �� �ึ�� ù ��°���� �� ��° ���ڱ����� array�迭���� ���� �� �����ϰ�
	 * ������ �迭�� �� ��° ������ �ε����� �̿��� ���� ���� ��ȯ�Ѵ�.
	 * 
	 * @param array
	 * @param commands
	 * @return
	 */
	public int[] solution(int[] array, int[][] commands) {
		int[] sortArr = null;
		int len = commands.length;

		int[] answer = new int[len];
        for(int i = 0; i < len; i++) {
        	sortArr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
        	Arrays.sort(sortArr);
        	int a = sortArr[commands[i][2] - 1];
        	answer[i] = a;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Knumber k = new Knumber();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int [] result = k.solution(array, commands);
		for(int i : result) {
			System.out.println(i);
		}
	}
}
