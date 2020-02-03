package Step8;

import java.util.Scanner;

public class Croatian_Alphabet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		int word = input.length();

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '=' || input.charAt(i) == '-') {
				word -= 1;
			}
		}
		if (input.indexOf("dz=") != -1) {
			word -= 1;
		}
		if (input.indexOf("lj") != -1) {
			word -= 1;
		}
		if (input.indexOf("nj") != -1) {
			word -= 1;
		}
		System.out.println(word);
	}
}
