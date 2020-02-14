package Step10;

import java.util.Scanner;

public class Taxi_Geometry {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int R = scanner.nextInt();

		System.out.printf("%6f\n", (double) R * R * Math.PI);
		System.out.printf("%6f\n", (double) 2 * R * R);
	}

}
