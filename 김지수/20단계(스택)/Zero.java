import java.util.Scanner;

public class Zero {
	static int top = -1;
	static int[] stack;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		stack = new int[N];

		for(int i = 0; i<N; i++) {
			 push(sc.nextInt());
		}
		int sum = 0;
		for(int i = 0; i<N; i++) {
			sum+= pop();
		}
		System.out.println(sum);
		sc.close();

	}
	public static void push(int num) {
		if(num == 0) {
			stack[top] = 0;
			top--;
		}else {
			stack[++top] = num;
		}
	}
	public static int pop() {
		if(top == -1) {
			return -1;
		}else {
			return stack[top--];
		}
	}

}
