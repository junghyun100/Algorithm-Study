package Step16;

import java.util.*;

public class BOJ_12865_OrdinaryBag {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int K = scanner.nextInt();

		int dp[][] = new int[N + 1][K + 1];

		int W[] = new int[N + 1];
		int V[] = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			W[i] = scanner.nextInt();
			V[i] = scanner.nextInt();

		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= K; j++) {
				dp[i][j] = dp[i - 1][j];
				if (j - W[i] >= 0) {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - W[i]] + V[i]);

				}
			}
		}

		System.out.println(dp[N][K]);
	}
}