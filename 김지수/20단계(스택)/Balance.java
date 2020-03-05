import java.util.Scanner;

public class Balance {
	static char[] stack;
	static int top;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check;
		
		while(true) {
			String str = sc.nextLine();
			if(str.equals(".")) {
				break;
			}else if(str.length()>100) {
				continue;
			}
			
			stack = new char[str.length()];
			top = -1;
			check = true;
			
			
			
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == '[' || str.charAt(i) == '(') {
					push(str.charAt(i));
				}
				else if((str.charAt(i) == ']' || str.charAt(i) == ')') && top == -1){
					check = false;
					break;
				}else if((str.charAt(i) == ']' && stack[top] != '[') ||
						(str.charAt(i) == ')' && stack[top] != '(')) {
					check = false;
					break;
				}
				else if(str.charAt(i) == ']' && stack[top] == '[') {
					pop();
				}else if(str.charAt(i) == ')' && stack[top] == '(') {
					pop();
				}
				
				else {
					
				}
			}
			
			if(top != -1) {
				check = false;
			}
			
			if(check) {
				System.out.println("yes");
			}else {
				System.out.println("no");
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
