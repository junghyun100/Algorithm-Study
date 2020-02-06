package Step8;

import java.util.Scanner;

public class Group_Word_Checker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		boolean checker;
		int count = 0;

		for (int i = 0; i < N; i++) {
			String str = scanner.next();
			checker = true;
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < j; k++) {
					if (str.charAt(j) != str.charAt(j - 1) && str.charAt(j) == str.charAt(k)) {
						checker = false;
						break;
					}
				}
			}
			if (checker) {
				count++;
			}
		}
		System.out.println(count);
	}

}
