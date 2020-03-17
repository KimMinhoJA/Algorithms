import java.util.Arrays;

public class PhoneNumberList {
	/**
	 * phone_book�� ����ִ� ��ȭ��ȣ���� ���� ���� �� ���� �ٸ� ���� ���ξ �ش��ϴ� ���� �ִٸ� true�� �ƴϸ� false�� ��ȯ�Ѵ�.
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param phone_book
	 * @return
	 */
	public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        int i = 0;
        int len = phone_book.length;
        for(i = 0; i < len - 1; i++ ){
            if(phone_book[i].length() > phone_book[i + 1].length())
                continue;
            else{
                if(phone_book[i].equals(phone_book[i+1].substring(0,phone_book[i].length())))
                    return false;
            }
        }
        return true;
    }
}
