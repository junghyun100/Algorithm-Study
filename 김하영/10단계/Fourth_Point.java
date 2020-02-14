package Step10;

import java.util.Scanner;

public class Fourth_Point {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int x3 = scanner.nextInt();
		int y3 = scanner.nextInt();

		int x4 = 0, y4 = 0;

		if (x1 == x2) {
			x4 = x3;
		} else if (x2 == x3) {
			x4 = x1;
		} else if (x1 == x3) {
			x4 = x2;
		}

		if (y1 == y2) {
			y4 = y3;
		} else if (y2 == y3) {
			y4 = y1;
		} else if (y1 == y3) {
			y4 = y2;
		}

		System.out.println(x4 + " " + y4);
	}

}
