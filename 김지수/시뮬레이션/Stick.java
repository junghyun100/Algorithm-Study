package 시뮬레이션;

import java.util.Scanner;
import java.util.Stack;

public class Stick {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt(); // 원하는 길이
		int stick = 64; // 처음 길이
		int currentLength = 0; // 현재까지 더해진 길이
		Stack<Integer> stack = new Stack<>(); // 필요한 막대가 담아질 stack
		stack.add(stick); // 64짜리 막대기 한개
		
		while(stick + currentLength != X) { // 원하는 막대를 만들기 위해 막대를 더해준다.
			stick = stack.pop() / 2; // 가지고 있는 막대 중 길이가 가장 짧은 것을 절반으로 자른다.
			if(stick + currentLength < X) { // 위에서 자른 막대의 절반 중 하나를 버리고 남아있는 막대의 길이의 합이 X보다 작으면, 그 막대를 사용한다.
				stack.add(stick); // 막대 추가
				currentLength += stick; // 현재길이
			}
			stack.add(stick);
		}
		
		System.out.println(stack.size());
		
		sc.close();
	}

}
