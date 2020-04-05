import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FailRate {
	/**
	 * 2019īī���� ����ε� �׽�Ʈ ������ ���ϱ�
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param N  ��ü �������� ��
	 * @param stages  ���� �������� ������ �������� �迭
	 * @return
	 */
	public int[] solution(int N, int[] stages) {
		Arrays.sort(stages);	//�������� ����
		double user = stages.length;	//��ü ���� ��
		List<Double> failRate = new ArrayList<Double>();	//���������� ������ ���
		List<Integer> stageList = new ArrayList<Integer>();	//������ ������ �������� ����
		int count = 0;	// �ӹ����ִ� ��� ��
		int cur = 0;	// stages�迭�� Ŀ��
		
		//i�� ��������
		for(int i = 0; i < N; i++) {
			for(; cur < stages.length;) {
				if(!(stages[cur] == i + 1)) {
					break;
				}
				count++;
				cur++;
			}
			
			//������ ���ٸ� �������� 0
			if(count == 0) {
				failRate.add((double) 0);
				stageList.add(i + 1);
				continue;
			}
			
			double rate = count / user;
			int order = 0;
			for(double d : failRate) {
				if(rate > d) {
					break;
				}
				order++;
			}
			
			failRate.add(order, rate);
			stageList.add(order, i + 1);
			user -= count;
			count = 0;
		}
		
		int [] answer = new int [N];
		for(int i = 0 ; i < N ; i++) {
			answer[i] = stageList.get(i);
			System.out.println(answer[i] + " : " + failRate.get(i));
		}
		
		return answer;
    }
}
