package Step6;

import java.util.Scanner;

public class NumOfNums {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int result = A * B * C;
		int count[] = new int[10];
		
		while(result !=0) {
			int num = result % 10;
			result = result / 10;
			count[num]++;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(count[i]);
		}
	}

}