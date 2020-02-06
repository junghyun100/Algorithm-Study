package Step10;

import java.util.Scanner;

public class Print_PrimeNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		int arr[] = new int[N + 1];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		arr[1] = 1;

		for (int j = 2; j <= N; j++) {
			for (int k = 2; j * k <= N; k++) {
				arr[j * k] = 1;
			}
		}
		for (int l = M; l <= N; l++) {
			if (arr[l] != 1) {
				System.out.println(l);
			}
		}
		scanner.close();
	}
}
