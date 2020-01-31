package Step6;

import java.util.Scanner;

public class Remaider {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Arr[] = new int[10];
		int Remainder[] = new int[10];
		int count = 0;

		for (int i = 0; i < 10; i++) {
			Arr[i] = scanner.nextInt();
			Remainder[i] = Arr[i] % 42;
			count++;
		}
		for (int i = 1; i < 10; i++) {
			if (Remainder[i] == Remainder[i - 1]) {
				count--;
			}

		}
		System.out.println(count);
	}

}
