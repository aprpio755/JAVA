package minimumSpanningTree;

import java.util.Scanner;
/*
 * �ø��ǾƵ� ���θ� ���� ȿ�������� �� �� �ֵ��� ������ ����� �ִ� ���� �п����� ��Ʈ��ũ�� �����Ϸ��� �Ѵ�.
 * �׷��� ��� �п����� ��Ʈ��ũ�� �����Ϸ��� �ʹ� ���� ����� �ʿ��ϱ� ������ ���ÿ����� �п����� �����ϴ� ����� �ּҰ� �ǰ� �Ϸ��� �Ѵ�. 
 * �п���������Ǿ� �ִ� �ٸ� �п��� ȸ���� ������ �� �ִ�.
 * �Ʒ� �׸��� ���� �п� ���̸� �����ϱ� ���� ����� �־����� ��� �п��� �����ϱ� ���� �ּ��� ����� ���ϴ� ���α׷��� �ۼ��϶�.
 */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("�п��� �� �Է� : ");
		int number = sc.nextInt();
		Tree academyTree = new Tree(number);
		academyTree.getWeight(academyTree.tree);
	}

}
