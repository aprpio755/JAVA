package crazySequence;

import java.util.Scanner;

/* 
 * 다음과 같은 수열이 있다. 
 * 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5 ... (숫자 k가 연달아 k번 나오는 수열).
 * 정수 n이 주어졌을 때 해당 수열에서 n번째 나오는 숫자를 출력하는 프로그램을 작성하라. 수열의 첫 번째 원소는 1이다.
 */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Sequence sq = new Sequence();
		int number = sc.nextInt();
		sq.createSeq(number);
		
	}
}
