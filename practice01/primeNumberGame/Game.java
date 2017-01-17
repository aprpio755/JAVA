package primeNumberGame;

import java.util.Scanner;

/*
 * 369������ ���� ������� ���� �������� ������ �ѷ��ɾƼ� ������� 1 ���� ���ڸ� �θ��鼭 3 �� ���� ����(�ٸ� ������� 3�� ���)�� �θ� ��� ���� ��� �ڼ��� �ľ��ϴ� �����̴�.

����� ������ �л����� ��ǳ�� ���� 369������ �Ϸ��� �Ѵ�. ������ 369 ������ �ʹ� �Ļ��ϴ� �����ϴ� ���� �ڼ��� ġ�� ���� �Ҽ�(1�̿ܿ� �ڱ� �ڽ����θ� �������� 2�̻��� ����)�� �ٲ㼭 ������ �ϰ��� �Ѵ�.

������ �л����� ���� �������� �θ� ��ȣ�� �־����� �� Ư�� ����� �ڼ��� �� �� �ƴ��� �˾ƺ��� ���α׷��� �ۼ��϶�.
 */

public class Game {

	static int studentNumber, lastNumber, wantNumber;
	
	public static void main(String[] args) {		
		getUserInput();
		Rule rule = new Rule();
		rule.startGame(studentNumber, lastNumber);
		rule.getPersonNumber(wantNumber);
	}
	
	public static void getUserInput(){
		System.out.println("Game Start!");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input student number : ");
		studentNumber = sc.nextInt();
		System.out.print("Please input last number : ");
		lastNumber = sc.nextInt();
		System.out.print("What student number do you want to know : ");
		wantNumber = sc.nextInt();
	}
	
}
