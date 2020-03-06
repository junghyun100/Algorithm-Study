import java.io.*;
import java.util.*;

public class BOJ_2164_Card2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			queue.add(i);
		}
		while (queue.size() != 1) {
			queue.poll();
			queue.add(queue.poll());
		}
		bw.write(queue.poll() + "\n");

		bw.flush();
		br.close();
		bw.close();
	}
}