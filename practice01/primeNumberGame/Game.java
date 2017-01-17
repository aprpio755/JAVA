package primeNumberGame;

import java.util.Scanner;

/*
 * 369게임은 많은 사람들이 즐기는 게임으로 원으로 둘러앉아서 순서대로 1 부터 숫자를 부르면서 3 이 들어가는 숫자(다른 방법으론 3의 배수)를 부를 경우 숫자 대신 박수를 쳐야하는 게임이다.

어느날 정올의 학생들이 소풍을 가서 369게임을 하려고 한다. 하지만 369 게임은 너무 식상하다 생각하던 차라 박수를 치는 수를 소수(1이외에 자기 자신으로만 나눠지는 2이상의 숫자)로 바꿔서 게임을 하고자 한다.

게임을 학생들의 수와 마지막에 부른 번호가 주어졌을 때 특정 사람이 박수를 몇 번 쳤는지 알아보는 프로그램을 작성하라.
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
