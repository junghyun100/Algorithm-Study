package Step11;

import java.util.Scanner;

public class Fibonacci_Num {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		System.out.println(fibonacci(n));
	}

	static int fibonacci(int n) {
		int result;
		if (n == 0) {
			result = 0;
		} else if (n == 1) {
			result = 1;
		} else {
			result = fibonacci(n - 1) + fibonacci(n - 2);
		}
		return result;
	}

}
