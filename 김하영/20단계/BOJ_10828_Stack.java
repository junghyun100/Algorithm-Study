import java.util.Scanner;
import java.util.Stack;

public class BOJ_10828_Stack {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		Stack<Integer> st = new Stack<>();

		
		for(int i = 0; i < N; i++) {
			String[] command = scanner.nextLine().split(" ");
			int result = 0;

			switch (command[0]) {
				case "push":
					st.push(Integer.parseInt(command[1]));
					break;
				case "pop":
					if (st.empty()) {
						result = -1;
					} else {
						result = st.pop();
					}
					System.out.println(result);
					break;
				case "size":
					System.out.println(st.size());
					break;
				case "empty":
					if (st.empty()) {
						result = 1;
					} else {
						result = 0;
					}
					System.out.println(result);
					break;
				case "top":
					if (st.empty()) {
						result = -1;
					} else {
						result = st.peek();
					}
					System.out.println(result);
					break;
				}
			System.out.println(i);
		}
	}
}