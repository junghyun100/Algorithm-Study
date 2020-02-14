package Step13;

import java.util.Scanner;

public class DecompositionSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int digit = 1;
		int tmp = N;
		int sum = 0;
		int result = 0;
		
		while (tmp / 10 != 0) {
			tmp /= 10;
			digit++;
		}

		int tmp2 = 0;
		
		for (int i = N - 9 * digit; i < N; i++) {
			tmp2 = i;
			while (tmp2 != 0) {
				sum += tmp2 % 10;
				tmp2 /= 10;
			}
			if (i + sum == N) {
				result = i;
				break;
			} else {
				sum = 0;
			}
		}
		System.out.println(result);

	}

}
