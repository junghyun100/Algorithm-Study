package Step8;

import java.util.Scanner;

public class Dial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();

		int time = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= 'A' && input.charAt(i) <= 'C') {
				time += 3;
			} else if (input.charAt(i) >= 'D' && input.charAt(i) <= 'F') {
				time += 4;
			} else if (input.charAt(i) >= 'G' && input.charAt(i) <= 'I') {
				time += 5;
			} else if (input.charAt(i) >= 'J' && input.charAt(i) <= 'L') {
				time += 6;
			} else if (input.charAt(i) >= 'M' && input.charAt(i) <= 'O') {
				time += 7;
			} else if (input.charAt(i) >= 'P' && input.charAt(i) <= 'S') {
				time += 8;
			} else if (input.charAt(i) >= 'T' && input.charAt(i) <= 'V') {
				time += 9;
			} else if (input.charAt(i) >= 'W' && input.charAt(i) <= 'Z') {
				time += 10;
			}
		}
		System.out.println(time);
	}
}
