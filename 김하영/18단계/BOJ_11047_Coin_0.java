import java.util.Scanner;

public class BOJ_11047_Coin_0 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int[] coin = new int[N];
		int count = 0;

		for (int i = 0; i < N; i++) {
			coin[i] = scanner.nextInt();
		}

		for (int i = coin.length - 1; i >= 0; i--) {
			if (K / coin[i] != 0) {
				count += K / coin[i];
				K %= coin[i];
			} else {
				continue;
			}
			if(K == 0) {
				break;
			}
		}
		System.out.println(count);
	}
}
