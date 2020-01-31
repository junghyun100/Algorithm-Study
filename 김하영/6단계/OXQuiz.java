package Step6;

import java.util.Scanner;

public class OXQuiz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		scanner.nextLine();

		for (int i = 0; i < T; i++) {
			String quiz = scanner.nextLine();
			int result = 0;
			int count = 0;
			for (int j = 0; j < quiz.length(); j++) {
				if (quiz.charAt(j) == 'O') {
					count++;
					result += count;
				} else {
					count = 0;
				}
			}
			System.out.println(result);
		}
	}
}
