import java.io.*;
import java.util.*;

public class BOJ_5430_AC {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<>();

		while (T != 0) {
			deque.clear();
			boolean isReverse = false;
			String[] p = br.readLine().split("");
			int n = Integer.parseInt(br.readLine());
			String inputStr = br.readLine();
			String[] inputArr = inputStr.substring(1, inputStr.length() - 1).split(",");

			for (int i = 0; i < n; i++) {
				deque.add(Integer.parseInt(inputArr[i]));
			}

			for (int i = 0; i < p.length; i++) {
				if (p[i].equals("R")) {
					isReverse = !isReverse;
				} else {
					if (!deque.isEmpty()) {
						if (isReverse) {
							deque.pollLast();
						} else {
							deque.pollFirst();

						}
					} else {
						sb.append("error");
						break;
					}
				}

				int dequeSize = deque.size();

				if (i == p.length - 1) {
					sb.append("[");
					if (isReverse) {
						for (int j = 0; j < dequeSize; j++) {
							sb.append(deque.pollLast() + ",");
						}
					} else {
						for (int j = 0; j < dequeSize; j++) {
							sb.append(deque.pollFirst() + ",");
						}
					}
					if (dequeSize != 0) {
						sb.delete(sb.length() - 1, sb.length());
					}
					sb.append("]");
				}
			}
			if (T != 1) {
				sb.append("\n");
			}
			T--;
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();

	}

}