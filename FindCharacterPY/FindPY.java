class FindPY {
	/**
	 * ���ڿ� s������ p���ڿ� y���ڸ� ���Ͽ� ������ ���θ� ���
	 * @param s �־��� ���ڿ�
	 * @return p�� y�� ������ true �ٸ��� false ��ȯ
	 */
    boolean solution(String s) {
        boolean answer = true;
        int cur = 0;
        int count = 0;

        s = s.toLowerCase();

        //'p'���� ã��
        while((cur = s.indexOf("p", cur)) != -1){
            count++;
            cur++;
        }
        
        cur = 0;
        //'y'���� ã��
        while((cur = s.indexOf("y", cur)) != -1){
            count--;
            cur++;
        }

        if(count != 0)
            answer = false;
        return answer;
    }
}