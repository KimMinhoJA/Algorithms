import java.util.Arrays;
public class SortString {
	/**
	 * ���ڿ�s�� �ƽ�Ű�ڵ� ū������ ����
	 * @param s
	 * @return
	 */
	public String solution(String s) {
	      StringBuilder builder = new StringBuilder();
	      char [] arr = s.toCharArray();
	      Arrays.sort(arr);
	      builder.append(arr);
	      builder.reverse();
	      return builder.toString();
	  }
}
