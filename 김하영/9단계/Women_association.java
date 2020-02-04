package Step9;

import java.util.Scanner;

public class Women_association {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		for (int i = 0; i < T; i++) {
			int k = scanner.nextInt();
			int n = scanner.nextInt();

			int[] ZeroFloor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

			for (int j = 0; j < k; j++) {
				int sum = 0;
				for (int l = 0; l < n; l++) {
					sum += ZeroFloor[l];
					ZeroFloor[l] = sum;
				}
			}
			System.out.println(ZeroFloor[n - 1]);
		}
	}

}
