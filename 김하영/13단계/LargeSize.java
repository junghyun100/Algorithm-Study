package Step13;

import java.util.Scanner;

public class LargeSize {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int weightArr[] = new int[N];
		int heightArr[] = new int[N];
		int rank[] = new int[N];

		for (int i = 0; i < N; i++) {
			rank[i] = 1;
			weightArr[i] = scanner.nextInt();
			heightArr[i] = scanner.nextInt();
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (weightArr[i] > weightArr[j] && heightArr[i] > heightArr[j]) {
					rank[j]++;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(rank[i] + " ");
		}
	}
}
