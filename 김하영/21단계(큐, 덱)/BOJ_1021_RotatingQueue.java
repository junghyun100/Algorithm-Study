import java.io.*;
import java.util.*;

class BOJ_1021_RotatingQueue {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[] position = new int[M];
		int count = 0;
		
		for (int i = 0; i < M; i++) {
			position[i] = scanner.nextInt();
		}
		
		Deque<Integer> deque = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			deque.addLast(i);
		}

		for (int i = 0; i < M; i++) {
			if(((LinkedList<Integer>) deque).indexOf(position[i]) <= deque.size()/2) {
				while(position[i] != deque.peek()) {
					deque.addLast(deque.pop());
					count++;
				}
				deque.removeFirst();
			} else {
				while(position[i] != deque.peek()) {
					deque.addFirst(deque.peekLast());
					deque.removeLast();
					count++;
				}
				deque.removeFirst();
			}
		}
		System.out.println(count);
	}
}
