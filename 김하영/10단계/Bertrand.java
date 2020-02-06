package Step10;

import java.util.Scanner;

public class Bertrand {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int count = 0;
			int arr[] = new int[2 * n + 1];

			if (n == 0) {
				break;
			}
			for (int i = 0; i < arr.length; i++) {
				arr[i] = 0;
			}
			arr[1] = 1;

			for (int j = 2; j <= 2 * n; j++) {
				for (int k = 2; j * k <= 2 * n; k++) {
					arr[j * k] = 1;
				}
			}
			for (int l = n; l <= 2 * n; l++) {
				if (arr[l] != 1) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
