package minimumSpanningTree;

import java.util.Scanner;
/*
 * 올림피아드 공부를 더욱 효율적으로 할 수 있도록 전국에 흩어져 있는 정올 학원들을 네트워크로 연결하려고 한다.
 * 그러나 모든 학원들을 네트워크로 연결하려면 너무 많은 비용이 필요하기 때문에 정올에서는 학원들을 연결하는 비용을 최소가 되게 하려고 한다. 
 * 학원들은연결되어 있는 다른 학원의 회선을 공유할 수 있다.
 * 아래 그림과 같이 학원 사이를 연결하기 위한 비용이 주어지면 모든 학원을 연결하기 위한 최소의 비용을 구하는 프로그램을 작성하라.
 */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("학원의 수 입력 : ");
		int number = sc.nextInt();
		Tree academyTree = new Tree(number);
		academyTree.getWeight(academyTree.tree);
	}

}
