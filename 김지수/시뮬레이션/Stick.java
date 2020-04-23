package �ùķ��̼�;

import java.util.Scanner;
import java.util.Stack;

public class Stick {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt(); // ���ϴ� ����
		int stick = 64; // ó�� ����
		int currentLength = 0; // ������� ������ ����
		Stack<Integer> stack = new Stack<>(); // �ʿ��� ���밡 ����� stack
		stack.add(stick); // 64¥�� ����� �Ѱ�
		
		while(stick + currentLength != X) { // ���ϴ� ���븦 ����� ���� ���븦 �����ش�.
			stick = stack.pop() / 2; // ������ �ִ� ���� �� ���̰� ���� ª�� ���� �������� �ڸ���.
			if(stick + currentLength < X) { // ������ �ڸ� ������ ���� �� �ϳ��� ������ �����ִ� ������ ������ ���� X���� ������, �� ���븦 ����Ѵ�.
				stack.add(stick); // ���� �߰�
				currentLength += stick; // �������
			}
			stack.add(stick);
		}
		
		System.out.println(stack.size());
		
		sc.close();
	}

}
