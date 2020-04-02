import java.util.Arrays;

public class RetirePeople {
	/**
	 * �������� ���� �� ���� ã��
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param participant ��ü��������
	 * @param completion �����Ѽ���
	 * @return
	 */
	public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i < completion.length; i++) {
        	if(participant[i].equals(completion[i]))
        		continue;
        	return participant[i];
        }
        return participant[participant.length - 1];
    }
}
