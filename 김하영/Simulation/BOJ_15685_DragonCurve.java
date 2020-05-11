package Simulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_15685_DragonCurve {
	static int[][] map = new int[101][101];
	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			List<Integer> curve = new ArrayList<>();
			int x = scanner.nextInt(); // x좌표
			int y = scanner.nextInt(); // y좌표
			int d = scanner.nextInt(); // 방향
			int g = scanner.nextInt(); // 세대

			curve.add(d);
			for (int j = 0; j < g; j++) {
				for (int k = curve.size() - 1; k >= 0; k--) {
					curve.add((curve.get(k) + 1) % 4);
				}
			}
			map[x][y] = 1;
			for (int dir : curve) {
				x += dx[dir];
				y += dy[dir];
				map[x][y] = 1;
			}
		}
		System.out.println(squareCount());
	}

	static int squareCount() {
		int count = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if(map[i][j] == 1 && map[i][j+1] == 1 && map[i+1][j] == 1 && map[i+1][j+1] == 1) {
					count++; 
				}
			}
		}
		return count;
	}
}
