package Step14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);

		System.out.println(average(arr));
		System.out.println(median(arr));
		System.out.println(mode(arr));
		System.out.println(range(arr));

	}

	static double average(int arr[]) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return Math.round(sum / arr.length);
	}

	static int median(int arr[]) {
		int result = 0;

		if (arr.length % 2 == 0) {
			result = (arr[arr.length / 2] + arr[arr.length / 2 + 1]) / 2;
		} else {
			result = arr[(arr.length + 1) / 2];
		}
		return result;
	}

	static int mode(int arr[]) {
		int result = 0;
		int maxindex = 0;
		int index[] = new int[8000];
		ArrayList <Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			index[arr[i] + 4000]++;
		}
		return arr[result];
	}

	static int range(int arr[]) {
		return arr[arr.length - 1] - arr[0];
	}
}
