import java.util.Scanner;

public class ParenthesisString {
	static char[] stack;
	static int top;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean check;
		
		for(int i = 0; i<N; i++) {
			top = -1;
			check = true;
			String str = sc.next();
			stack = new char[str.length()];
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == '(' ) {
					push(str.charAt(j));
				}else if(str.charAt(j) == ')') {
					if(top != -1) {
						pop();	
					}else {
						check = false;
						break;
					}
				}else {
					
				}
			}
			if(top != -1) {
				check = false;
			}
			
			if(check) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		
		sc.close();
	}
	static void push(char c) {
		stack[++top] = c;
	}
	static void pop() {
		top--;	
	}
}
