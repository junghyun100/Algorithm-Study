package Step9;

import java.util.Scanner;

public class Break_Even_Point {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int bep = 0;

		if (B >= C) {
			bep = -1;
		} else {
			bep = A / (C - B) + 1;
		}
		System.out.println(bep);
	}

}
