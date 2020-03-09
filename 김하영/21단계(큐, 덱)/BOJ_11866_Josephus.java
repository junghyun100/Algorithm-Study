import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_11866_Josephus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		System.out.print("<");
		while (true) {
			if(queue.size() == 1) {
				System.out.println(queue.poll() + ">");
				break;
			}
			for (int i = 1; i < K; i++) {
				queue.add(queue.poll());
			}
			System.out.print(queue.poll() + ", ");
		}
	}
}
