import java.io.*;
import java.util.*;

public class BOJ_10866_Deque {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int pushValue = 0;

		Deque<Integer> deque = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			String command = br.readLine();
			int result = 0;

			if (command.contains("push_front")) {
				String[] commandPush = command.split(" ");
				pushValue = Integer.parseInt(commandPush[1]);
				deque.addFirst(pushValue);
			} else if (command.contains("push_back")) {
				String[] commandPush = command.split(" ");
				pushValue = Integer.parseInt(commandPush[1]);
				deque.addLast(pushValue);
			} else {
				switch (command) {
				case "pop_front":
					if (deque.isEmpty()) {
						result = -1;
					} else {
						result = deque.pop();
					}
					bw.write(result + "\n");
					break;
				case "pop_back":
					if (deque.isEmpty()) {
						result = -1;
					} else {
						result = deque.removeLast();
					}
					bw.write(result + "\n");
					break;
				case "size":
					bw.write(deque.size() + "\n");
					break;
				case "empty":
					if (deque.isEmpty()) {
						result = 1;
					} else {
						result = 0;
					}
					bw.write(result + "\n");
					break;
				case "front":
					if (!deque.isEmpty()) {
						result = deque.peekFirst();
					} else {
						result = -1;
					}
					bw.write(result + "\n");
					break;
				case "back":
					if (!deque.isEmpty()) {
						result = deque.peekLast();
					} else {
						result = -1;
					}
					bw.write(result + "\n");
					break;
				}
			}
		}
        bw.flush();
        br.close();
        bw.close();

	}
}
