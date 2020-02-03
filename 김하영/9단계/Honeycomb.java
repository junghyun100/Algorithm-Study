package Step9;

import java.util.Scanner;

public class Honeycomb {

	public static void main(String[] args) {
		// 1 6 12 18 24
		// 1---------------1
		// 2~7--------------2
		// 8~19-------------3 13 = 12/6
		// 20~37------------4
		// 38~61------------5 58 = 57/51/39/21/
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int count = 1;

		if (N == 1) {
			System.out.println(count);
		} else if (N <= 7) {
			System.out.println(count + 1);
		}
		N -= 1;

		while (N > count * 6) {
			N -= count * 6;
			count++;
		}
		System.out.println(count + 1);
	}

}
