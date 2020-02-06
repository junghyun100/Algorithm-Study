package Step9;

import java.util.Scanner;

public class Sugar_Delivery {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		int count = 0;

		while (true) {
			if (N % 5 == 0) {
				count += N/5;
				break;
			} else if (N < 0) {
				count = -1;
				break;
			}
			N -= 3;
			count++;
		}
		System.out.println(count);
	}

}
