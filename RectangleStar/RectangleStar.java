import java.util.Arrays;
import java.util.Scanner;
public class RectangleStar {
	/**
	 * �Է����� ���� 2���� �޾Ƽ� �� a �� b��ŭ ũ���� ���簢�� �����
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i= 0; i < b; i++) {
			for(int j = 0; j < a; j++ ) {
				builder.append('*');
			}
			builder.append("\n");
		}
		System.out.println(builder.toString());
	}
}
