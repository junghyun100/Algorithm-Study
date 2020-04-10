package Step16;

import java.util.*;

public class BOJ_2565_ElectricWire {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int dp[] = new int[n];
		int wire[][] = new int[n][2];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				wire[i][j] = scanner.nextInt();
			} 
		}

		Arrays.sort(wire, new Comparator<int[]>() {

			@Override
			public int compare(int[] a, int[] b) {
				if (a[0] < b[0])
					return -1;
				else if (a[0] > b[0])
					return 1;
				return 0;
			}

		});

		dp[1] = 1;

		for (int i = 0; i < n; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if (wire[j][1] < wire[i][1] && dp[i] <= dp[j])
					dp[i] = dp[j] + 1;
			}
		}
		Arrays.sort(dp);
		System.out.println(n - dp[n - 1]);
	}
}