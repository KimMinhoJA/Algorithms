import java.util.ArrayList;
import java.util.List;

public class LendUniform {
	/**
	 * ��ü �л� n�� �� ���� lost�� �л��鿡�� �ִ��� ���� �����־� �� �ִ��� ��ȯ lost�� �л����� ������ �ִ� reserve�л���
	 * ������ �� ������ �� (+-1)�� �ش��ϴ� ��츸 ������ �� �ִ�. 
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param n
	 * @param lost
	 * @param reserve
	 * @return
	 */
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		
		//lost�� �л��� ���� �������
		List<Integer> notLost = new ArrayList<>();
		//���� �̹� ������ ���
		List<Integer> notRe = new ArrayList<>();
		
		//lost�� �л��� reserve�� �ִ°��
		for(int i : lost) {
			for(int j: reserve) {
				if(i == j) {
					notLost.add(i);
					notRe.add(j);
					answer++;
				}
			}
		}
		
		//lost�� �л��� �ֺ��� reserve�� �ִ°��
		for(int i : lost) {
			if(notLost.contains(i))
				continue;
			for(int j: reserve) {
				if(notRe.contains(j))
					continue;
				if(i - 1 == j || i + 1 == j) {
					notRe.add(j);
					answer++;
					break;
				}
			}
		}

		return answer;
		
		
	}

	public static void main(String[] args) {
		LendUniform ob = new LendUniform();
		int[] lost = {3,9,10};
		int[] reser = {3,8,9};
		System.out.println(ob.solution(10, lost, reser));
		
	}

/* Map�� �̿��ؼ� ����Ǯ��
import java.util.Map;
import java.util.HashMap;
class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n;
		Map<Integer,Integer> lostList = new HashMap<>();
		Map<Integer,Integer> reserveList = new HashMap<>();
		
		for(int i : lost) {
			lostList.put(i,i);
		}
		for(int j: reserve) {
			if(lostList.containsValue(j)) {
				lostList.remove(j);
			}else {
				reserveList.put(j,j);
			}
		}
		
		for(int i : lostList.keySet()) {
			if(reserveList.containsValue(i - 1)) {
				reserveList.remove(i - 1);
			}else if(reserveList.containsValue(i + 1)) {
				reserveList.remove(i + 1);
			}else {
				answer--;
			}
		}
		return answer;		
	}
}*/
/* �迭�� �����Ͽ� ����Ǯ��
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
		int answer = n;
		int[] allStu = new int[n];
		
		for(int i : lost) {
			allStu[i - 1]--;
		}
		
		for(int i : reserve) {
			allStu[i - 1]++;
		}
		
		for(int i = 0; i < n; i++) {
			if(allStu[i] == -1) {
				if(i > 0 && i < n - 1) {
					if(allStu[i - 1] == 1) {
						allStu[i]++;
						allStu[i - 1]--;
					}else if(allStu[i + 1] == 1) {
						allStu[i]++;
						allStu[i + 1]--;
					}else
						answer--;
				}else if (i == 0) {
					if(allStu[i + 1] == 1){
						allStu[i]++;
						allStu[i + 1]--;
					}else
						answer--;
				}else if(i == n-1) {
					if(allStu[i - 1] == 1){
						allStu[i]++;
						allStu[i - 1]--;
					}else
						answer--;
				}
			}
		}
		return answer;
		
	}
}
*/
}
