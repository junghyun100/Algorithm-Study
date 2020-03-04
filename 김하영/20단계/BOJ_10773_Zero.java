import java.util.Scanner;
import java.util.Stack;

public class BOJ_10773_Zero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		Stack<Integer> st = new Stack<>();
		int sum = 0;
		
		for(int i = 0; i < K; i++) {
			int num = scanner.nextInt();
			if(num == 0) {
				st.pop();
			}else {
				st.push(num);
			}
		}
		while(!st.empty()) {
			sum += st.pop();
		}
		System.out.println(sum);
		scanner.close();
		
	}
}
