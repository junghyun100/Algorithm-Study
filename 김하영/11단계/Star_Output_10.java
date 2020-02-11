package Step11;

import java.util.Arrays;
import java.util.Scanner;

public class Star_Output_10 {
	static char arr[][];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		arr = new char[N][N];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = ' ';
			}
		}
		star(N, 0, 0);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	public static void star(int n, int x, int y) {
		if (n == 1) {
			arr[y][x] = '*';
			return;
		}
		star(n / 3, x, y);
		star(n / 3, x + n / 3, y);
		star(n / 3, x + n / 3 * 2, y);

		star(n / 3, x, y + n / 3);
		star(n / 3, x + n / 3 * 2, y + n / 3);

		star(n / 3, x, y + n / 3 * 2);
		star(n / 3, x + n / 3, y + n / 3 * 2);
		star(n / 3, x + n / 3 * 2, y + n / 3 * 2);

	}

}
