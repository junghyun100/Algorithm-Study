package Step10;

import java.util.Scanner;

public class Prime_Num {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		int[] pn = new int[N - M + 1];
		int sum = 0;
		int npn = 0;
		int index = 0;

		for (int i = M; i <= N; i++) {
			int count = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				pn[index] = i;
				sum += i;
				index++;
			} else {
				npn++;
			}
		}
		if (pn[0] != 0) {
			System.out.println(sum);
			System.out.println(pn[0]);
		} else {
			System.out.println(-1);
		}
		scanner.close();
	}
}
