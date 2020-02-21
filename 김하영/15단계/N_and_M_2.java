import java.util.*;

public class N_and_M_2 {
	static boolean check[] = new boolean[10];
	static int arr[] = new int[10];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		scanner.close();

		dfs(0, N, M);
	}

	static void dfs(int index, int n, int m) {
		if (index == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(arr[i]);
				if (i != m) {
					System.out.print(' ');
				}
			}
			System.out.println();
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (check[i]) {
				continue;
			}
			check[i] = true;
			arr[index] = i;
			if(index == 0) {
				dfs(index + 1, n, m);
			} else if(index > 0 && arr[index] > arr[index -1]) {
				dfs(index + 1, n, m);
			}
			check[i] = false;
		}
	}
}