package Step14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Coordinate_alignment_2 {// 11650번 좌표 정렬하기
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		int arr[][] = new int[N][2];

		for (int i = 0; i < N; i++) {
			arr[i][0] = scanner.nextInt();
			arr[i][1] = scanner.nextInt();
		}

		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] x, int[] y) {
				if (x[1] > y[1]) {
					return 1;
				} else if (x[1] < y[1]) {
					return -1;
				} else {
					return Integer.compare(x[0], y[0]);
				}
			}
		});

		for (int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}