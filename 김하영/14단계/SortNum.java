package Step14;

import java.util.Arrays;
import java.util.Scanner;

public class SortNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
