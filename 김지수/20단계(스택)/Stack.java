import java.util.Scanner;

public class Stack {
	static int[] stack;
	static int top = -1; // 비어있을 경우 -1
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		stack = new int[N];
		
		for (int i = 0; i < N; i++) {
			String command = sc.next();
			
			switch(command) {
			case "push":
				push(sc.nextInt());
				break;
				
			case "pop": 
				pop();
				break;
				
			case "size":
				size();
				break;
				
			case "empty":
				empty();
				break;
				
			case "top":
				top();
				break;
				
			default:
				break;
			}
		}
		sc.close();
	}
	public static void push(int num) {
		stack[++top] = num;
	}
	public static void pop() {
		if(top == -1) {
			System.out.println(-1);
		}else {
			System.out.println(stack[top--]);
		}
	}
	public static void size() {
		System.out.println(top+1);
	}
	public static void empty() {
		if(top == -1) {
			System.out.println(1);	
		}else {
			System.out.println(0);					
		}
	}
	public static void top() {
		if(top == -1) {
			System.out.println(-1);
		}else {
			System.out.println(stack[top]);	
		}
	}


}
