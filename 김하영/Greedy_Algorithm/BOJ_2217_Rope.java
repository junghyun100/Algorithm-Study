package Step16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2217_Rope {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int rope[] = new int[N];
		int max = 0;

		for (int i = 0; i < N; i++) {
			rope[i] = scanner.nextInt();
		}
		Arrays.sort(rope);
		
		for (int i = N - 1; i >= 0; i--) {
			max = Math.max(max, rope[i] * (N - i));
		}
		System.out.println(max);
	}

}
