import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockPrice {
	/**
	 * �ʴ����� �ֽİ��� ������ ����� �迭 prices�� ���� �ð��� ���Կ� ���� ���ݺ������θ� �����ϴ� �迭 ��ȯ
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param prices
	 * @return
	 */
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		for(int i = 0; i < prices.length - 1; i++) {
			if(prices[i] == 1) {
				answer[i] = prices.length - 1 - i;
			}else {
				for(int j = i + 1; j < prices.length; j++) {
					answer[i]++;
					if(prices[i] > prices[j]) {
						break;
					}
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		StockPrice sp = new StockPrice();
		int [] prices = {1, 2, 3, 2, 3};
		int [] arr = sp.solution(prices);
		for(int i : arr) {
			System.out.println(i);
		}
	}
}