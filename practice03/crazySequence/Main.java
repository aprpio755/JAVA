package crazySequence;

import java.util.Scanner;

/* 
 * ������ ���� ������ �ִ�. 
 * 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5 ... (���� k�� ���޾� k�� ������ ����).
 * ���� n�� �־����� �� �ش� �������� n��° ������ ���ڸ� ����ϴ� ���α׷��� �ۼ��϶�. ������ ù ��° ���Ҵ� 1�̴�.
 */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Sequence sq = new Sequence();
		int number = sc.nextInt();
		sq.createSeq(number);
		
	}
}
