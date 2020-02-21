import java.io.*;
import java.util.Scanner;

public class N_and_M_4 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int arr[] = new int[10];

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();

		dfs(0, N, M);
		scanner.close();
		bw.close();
	}

	static void dfs(int index, int n, int m) throws IOException {
		if (index == m) {
			for (int i = 0; i < m; i++) {
				bw.write(String.valueOf(arr[i]));
				if (i != m - 1) {
					bw.write(' ');
				}
			}
			bw.write("\n");
			return;
		}
		for (int i = 1; i <= n; i++) {
			arr[index] = i;
			if(index == 0) {
				dfs(index + 1, n, m);
			} else if(index > 0 && arr[index] >= arr[index-1]) {
				dfs(index + 1, n, m);
			}
		}
	}
}