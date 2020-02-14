package Step13;

import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int card[] = new int[N];
		int max = 0;
		int sum = 0;

		for (int i = 0; i < N; i++) {
			card[i] = scanner.nextInt();
		}
		// Card배열의 요소들을 하나씩 더하기
		for (int i = 0; i < N; i++) {
			for (int j = 1; j < N; j++) {
				for (int k = 2; k < N; k++) {
					sum = card[i] + card[j] + card[k];
					if (i == j || i == k || j == k) {	// 같은 숫자끼리 더하는 경우의 수 없애기
						sum = 0;
					} else {
						if (sum == M) {	// sum == M이면 바로 종료
							max = sum;
							break;
						} else if (sum < M && sum > max) {
							max = sum;
						}
					}
				}
			}
		}
		System.out.println(max);
	}
}
