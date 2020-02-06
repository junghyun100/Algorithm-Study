package Step10;

import java.util.Scanner;

public class Find_PrimeNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int pn = 0;

		for (int i = 0; i < N; i++) {
			int a = scanner.nextInt();
			int count = 0;

			for (int j = 1; j <= a; j++) {
				if (a % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				pn++;
			}
		}
		System.out.println(pn);
		scanner.close();
	}
}
