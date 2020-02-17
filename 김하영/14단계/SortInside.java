package Step14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortInside {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int tmp = N;
		int digit = 1;
		
		while (tmp / 10 != 0) {
			tmp /= 10;
			digit++;
		}
		
		int arr[] = new int[digit];

		for (int i = 0;; i++) {
			if (N / 10 == 0) {
				arr[i] = N;
				break;
			}
			arr[i] = N % 10;
			N /= 10;
		}
		Arrays.sort(arr);
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

}
