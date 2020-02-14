package Step11;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		System.out.println(factorial(N));

	}

	static int factorial(int a) {
		int result = 0;

		if (a == 0 || a == 1) {
			result = 1;
		} else {
			result = a * factorial(a - 1);
		}
		return result;
	}

}
