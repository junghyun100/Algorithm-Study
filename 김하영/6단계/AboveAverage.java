package Step6;

import java.util.Scanner;

public class AboveAverage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int C = scanner.nextInt();
		
		int score[] = new int[100];
		
		for (int i = 0; i < C; i++) {
			int N = scanner.nextInt();
			
			for (int j = 1; j <= N; j++) {
				score[0] = N;
				score[j] = scanner.nextInt();
			}
		}
		for(int i = 0; i<10; i++) {
			System.out.println(score[i]);
		}
	}

}
