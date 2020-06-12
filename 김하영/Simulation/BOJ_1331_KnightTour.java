package Simulation;

import java.util.Scanner;

public class BOJ_1331_KnightTour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String visit[] = new String[37];

		for (int i = 0; i < 36; i++) {
			visit[i] = sc.next();
		}

		visit[36] = visit[0];
		int index = 0;
		boolean chessBoard[][] = new boolean[6][6];
		boolean valid = true;

		while (index < 36) {
			String current = visit[index];
			String next = visit[index + 1];

			char currentX = current.charAt(0);
			char currentY = current.charAt(1);

			chessBoard[currentX - 'A'][currentY - '1'] = true;

			char nextX = next.charAt(0);
			char nextY = next.charAt(1);

			int distanceX = Math.abs(currentX - nextX);
			int distanceY = Math.abs(currentY - nextY);
			boolean Knight = false;
			for (int i = 0; i < 2; i++) {
				if ((distanceX == 1 && distanceY == 2) || (distanceX == 2 && distanceY == 1)) {
					Knight = true;
					break;
				}
			}
			if (!Knight) {
				valid = false;
				System.out.println("Invalid");
				return;
			}
			if (chessBoard[nextX - 'A'][nextY - '1'] && index != 35) {
				valid = false;
				System.out.println("Invalid");
				return;
			}
			index++;
		}
		if (valid) {
			System.out.println("Valid");
		}
	}
}
