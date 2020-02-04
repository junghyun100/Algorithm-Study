package Step9;

import java.util.Scanner;

public class Snail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int V = scanner.nextInt();
		int length = 0;
		int day = 1;

		while (true) {
			length += A;
			if (length >= V) {
				System.out.println(day);
				break;
			} 
			length -= B;
			day++;
			
		}
	}
}
