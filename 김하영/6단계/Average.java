package Step6;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int score[] = new int[N];
		double score2[] = new double[N];
		int max = 0;
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			score[i] = scanner.nextInt();
			if (max < score[i]) {
				max = score[i];
			}
		}
		for (int i = 0; i < N; i++) {
			score2[i] = (double)score[i]/max*100;
			sum += score2[i];
		}
		sum -= 100-max;

		double average = (double)sum/N;
		System.out.println(average);

	}

}
