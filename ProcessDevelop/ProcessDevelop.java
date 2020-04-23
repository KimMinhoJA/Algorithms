import java.util.Arrays;

public class ProcessDevelop {
	/**
	 * ���� �۾����� ó���� progresses�� �� �۾����� ó���ӵ� speeds�� ���� �� ���� �۾��� �� ���� ó���� �� �ֵ��� ����� �����Ѵ�.
	 * round robin������ �۾� �����ٸ����� ó�� �Ϸ��ϴ� �κ��� ���Ӱ� �Ѵ�.
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param progresses
	 * @param speeds
	 * @return
	 */
	public int[] solution(int[] progresses, int[] speeds) {
        int len = progresses.length;
        int[] answer = new int[len];
        int cur = -1;
        int count = 0;
        int cursor = 0;
        
        for(int i = 0; i < len; i++) {
        	//�ܿ��� ��
        	progresses[i] = (100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] == 0 ? 0 : 1);
        	if(cur == -1) {
        		cur = progresses[i];
        		count++;
        	}else {
        		if(cur < progresses[i]) {
        			cur = progresses[i];
        			answer[cursor++] = count;
        			count = 1;
        		}else {
        			count++;
        		}
        	}
        }
        
        answer[cursor] = count;
        
        return Arrays.copyOf(answer, cursor + 1);
    }
}
