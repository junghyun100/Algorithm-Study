package Step16;

import java.util.Scanner;

public class BOJ_9461_PadovanSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		long[] P = new long[101];

		P[0] = 1;
		P[1] = 1;
		P[2] = 1;
		P[3] = 2;
		P[4] = 2;
		P[5] = 3;
		P[6] = 4;
		P[7] = 5;
		P[8] = 7;
		P[9] = 9;

		for (int i = 10; i < 101; i++) {
			P[i] = P[i - 1] + P[i - 5];
		}

		for (int i = 0; i < T; i++) {
			int N = scanner.nextInt();
			System.out.println(P[N - 1]);
		}
	}

}
