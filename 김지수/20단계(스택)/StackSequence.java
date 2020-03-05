import java.util.Scanner;
import java.util.ArrayList;

public class StackSequence {
	static int[] stack;
	static int top = -1;
	static ArrayList<Character> list = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];
		stack = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int index = 0;
		for (int i = 1; i <= N; i++) {
			if(arr[index] >= i) {
				push(i);
			}
			while(top != -1&&stack[top] == arr[index]) {
				pop();
				index++;
			}
		}
		if(top != -1) {
			System.out.println("NO");
		}else {
			for(int i =0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
		sc.close();
	}
	static void push(int n) {
		stack[++top] = n;
		list.add('+');
	}
	static void pop() {
		top--;
		list.add('-');
	}
}
