package Simulation;

import java.util.Scanner;

public class BOJ_1063_King {
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String kingPos = sc.next();
		String stonePos = sc.next();
		int N = sc.nextInt();

		// 입력받은 킹과 돌의 X, Y 좌표
		int kingX = kingPos.charAt(0) - 'A' + 1;
		int kingY = kingPos.charAt(1) - '0';
		int stoneX = stonePos.charAt(0) - 'A' + 1;
		int stoneY = stonePos.charAt(1) - '0';

		for (int i = 0; i < N; i++) {
			String direction = sc.next();
			int moveX = dx[setDirection(direction.charAt(0))];
			int moveY = dy[setDirection(direction.charAt(0))];
			if (direction.length() == 2) { // 방향이 대각선일 경우
				moveX += dx[setDirection(direction.charAt(1))];
				moveY += dy[setDirection(direction.charAt(1))];
			}
			// 움직이고 난 뒤의 킹 위치
			int tempkingX = kingX + moveX;
			int tempkingY = kingY + moveY;

			if ((tempkingX == stoneX) && (tempkingY == stoneY)) { // 킹 위치 == 돌 위치
				if ((stoneX + moveX) >= 1 && (stoneX + moveX) <= 8 && (stoneY + moveY) >= 1 && (stoneY + moveY) <= 8) {
					kingX = tempkingX;
					kingY = tempkingY;
					stoneX += moveX;
					stoneY += moveY;
				}
			} else { // 킹 위치 != 돌 위치
				if ((kingX + moveX) >= 1 && (kingX + moveX) <= 8 && (kingY + moveY) >= 1 && (kingY + moveY) <= 8) {
					kingX = tempkingX;
					kingY = tempkingY;
				}
			}
		}
		
		System.out.println((char) (kingX + 64) + "" + kingY);
		System.out.println((char) (stoneX + 64) + "" + stoneY);
	}
//	R : 한 칸 오른쪽으로
//	L : 한 칸 왼쪽으로
//	B : 한 칸 아래로
//	T : 한 칸 위로
	// 방향 설정 메소드
	public static int setDirection(char d) {
		int direction = 0;
		switch (d) {
		case 'R':
			direction = 0;
			break;
		case 'L':
			direction = 1;
			break;
		case 'B':
			direction = 2;
			break;
		case 'T':
			direction = 3;
			break;
		}
		return direction;

	}
}
