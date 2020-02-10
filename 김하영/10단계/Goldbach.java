package Step10;

import java.util.Scanner;

public class Goldbach {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();
		for (int j = 0; j < T; j++) {
			int n = scanner.nextInt();
			for (int a = n / 2, b = n / 2; ; a++, b--) {
				n = a + b;
				if (primenum(a) && primenum(b)) {
					System.out.println(b + " " + a);
					break;
				}
			}
		}
	}

	public static boolean primenum(int n) {

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}