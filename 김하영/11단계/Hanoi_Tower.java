package Step11;

import java.util.Scanner;

public class Hanoi_Tower {
	static int cnt = 0;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		hanoi(n, 1, 2, 3);
		System.out.println(cnt);
		System.out.println(sb);

	}

	static void hanoi(int n, int from, int by, int to) {
		cnt += 1;
		if (n == 1) {
			sb.append(from + " " + to + "\n");
			return;
		} else {
			hanoi(n - 1, from, to, by); // 1->3->2
			sb.append(from + " " + to + "\n");
			hanoi(n - 1, by, from, to); // 2->1->3
		}
	}

}
