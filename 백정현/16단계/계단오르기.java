import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] totalScore = new int[n + 1];
		int[] stairsPoint = new int[n + 1];
		int max = 0;
		for (int i = 1; i <= n; i++) {
			stairsPoint[i] = scanner.nextInt();
		}
		totalScore[1] = stairsPoint[1];
		if (n > 1) {
			totalScore[2] = totalScore[1] + stairsPoint[2];
			for (int i = 3; i <= n; i++) {
				totalScore[i] = Math.max(totalScore[i - 2] + stairsPoint[i],
						totalScore[i - 3] + stairsPoint[i - 1] + stairsPoint[i]);
			}
		}

		System.out.println(totalScore[n]);
	}
}