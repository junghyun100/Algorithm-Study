package Step28;

import java.util.*;

public class BOJ_1697_HideAndSeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] check = new int[100001];

		bfs(N, K, check);
		sc.close();
	}

	static void bfs(int N, int K, int[] check) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(N);
		check[N] = 1;
		while (!queue.isEmpty()) {
			int n = queue.poll();
			if (n == K) {
				System.out.println(check[n] - 1);
				break;
			} else {
				if ((n - 1 >= 0) && (check[n - 1] == 0)) {
					queue.add(n - 1);
					check[n - 1] = check[n] + 1;
				}
				if ((n + 1 <= 100000) && (check[n + 1] == 0)) {
					queue.add(n + 1);
					check[n + 1] = check[n] + 1;
				}
				if ((n * 2 <= 100000) && (check[n * 2] == 0)) {
					queue.add(n * 2);
					check[n * 2] = check[n] + 1;
				}
			}
		}
	}
}