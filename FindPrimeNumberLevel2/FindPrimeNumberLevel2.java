import java.util.HashSet;
import java.util.Set;

public class FindPrimeNumberLevel2 {
	public int solution(String numbers) {
		Set<Integer> set = new HashSet<Integer>();
		char [] chArr = numbers.toCharArray();
		boolean[] using = new boolean[chArr.length];
		int number = 0;
		
		//
		for(int count = 0; count < chArr.length; count++) {
			System.out.println(count +"��°");
			findNumber(chArr, using, set, count, number);
		}
		return findPrime(set);
	}
	
	public void findNumber(char[] chArr, boolean[] using, Set<Integer> set, int count, int number) {
		for(int i = 0; i < chArr.length; i++) {
			if(!using[i]) {
				System.out.println(chArr[i] - '0');
				using[i] = true;
				number += chArr[i] - '0';
				
				if(count == 0) {
					set.add(number);
					System.out.println("�߰�");
				}else {
					System.out.println("�Ѿ��");
					findNumber(chArr, using, set, count - 1, number * 10);
				}
				//���� �ݺ����� �� �� ������� ���� ������ �ʱ�ȭ ����
				using[i] = false;
				//���� �ݺ����� �� �� �������� �������� �ʵ��� ����
				number -= chArr[i] - '0';
			}
		}
		System.out.println("������");
	}
	
	public int findPrime(Set<Integer> set) {
		boolean isPrime = true;
		int result = 0;
		
		for(int i : set) {
			if(i < 2) {
				continue;
			}
			for(int j = 2; j*j <= i; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				result++;
			}
			isPrime = true;
		}
		return result;
	}
	
	public static void main(String[] args) {
		FindPrimeNumberLevel2 fp = new FindPrimeNumberLevel2();
		System.out.println(fp.solution("1234567"));
	}
}
