package Step8;

import java.util.Scanner;

public class Sangsu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String A = scanner.next();
		String B = scanner.next();

		String tmp = "";
		for (int i = A.length() - 1; i >= 0; i--) {
			tmp += A.charAt(i);
		}
		A = tmp;
		tmp = "";

		for (int i = B.length() - 1; i >= 0; i--) {
			tmp += B.charAt(i);
		}
		B = tmp;

		int SangsuA = Integer.parseInt(A);
		int SangsuB = Integer.parseInt(B);

		if (SangsuA > SangsuB) {
			System.out.println(SangsuA);
		} else {
			System.out.println(SangsuB);
		}
	}

}
