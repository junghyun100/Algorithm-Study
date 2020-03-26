package Step16;

import java.util.Scanner;

public class BOJ_1904_01tile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		long P[] = new long[N + 1];
		P[0] = 0;
		P[1] = 1;
		P[2] = 2;

		for (int i = 3; i <= N; i++) {
			P[i] = P[i - 2] + P[i - 1];
		}
		System.out.println(P[N] % 15746);
	}
}
