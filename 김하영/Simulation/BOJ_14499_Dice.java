package Simulation;

import java.util.Scanner;

public class BOJ_14499_Dice {
	static int[] dice = new int[7];
	static int[][] map = new int[20][20];
	// 동쪽은 1, 서쪽은 2, 북쪽은 3, 남쪽은 4
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();	// 지도의 세로 크기
		int M = scanner.nextInt();	// 지도의 가로 크기
		int y = scanner.nextInt();	// 주사위 좌표 y
		int x = scanner.nextInt();	// 주사위 좌표 x
		int K = scanner.nextInt();	// 명령의 개수
		
		// 지도 초기화
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < K; i++) {
			int command = scanner.nextInt();
			int nx = dx[command - 1] + x;
			int ny = dy[command - 1] + y;

			if (0 <= nx && nx < M && 0 <= ny && ny < N) {
				changeDice(command);

				if (map[ny][nx] == 0) {
					map[ny][nx] = dice[6];
				} else {
					dice[6] = map[ny][nx];
					map[ny][nx] = 0;
				}

				x = nx;
				y = ny;
				System.out.println(dice[1]);
			}
		}
	}

	public static void changeDice(int command) {
		int[] temp = dice.clone();
		// 6 밑면, 1 윗면
		// 동쪽은 1, 서쪽은 2, 북쪽은 3, 남쪽은 4
		switch(command) {
		case 1 :
			dice[1] = temp[4];
			dice[3] = temp[1];
			dice[4] = temp[6];
			dice[6] = temp[3];
			break;
		case 2 :
			dice[1] = temp[3];
			dice[3] = temp[6];
			dice[4] = temp[1];
			dice[6] = temp[4];
			break;
		case 3 :
			dice[1] = temp[5];
			dice[2] = temp[1];
			dice[5] = temp[6];
			dice[6] = temp[2];
			break;
		default :
			dice[1] = temp[2];
			dice[2] = temp[6];
			dice[5] = temp[1];
			dice[6] = temp[5];
		}
	}
}
