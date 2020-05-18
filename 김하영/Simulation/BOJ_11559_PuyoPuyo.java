package Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_11559_PuyoPuyo {
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, -1, 0, 1 };
	static char[][] map = new char[12][6];
	static boolean[][] visited;
	static ArrayList<Point> list;

	public static void main(String[] args) throws IOException {
		int answer = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 12; i++) {
            String str = br.readLine();
            for (int j = 0; j < 6; j++) {
                map[i][j] = str.charAt(j);
            }
        }

		while (true) {
			boolean puyo = false;
			visited = new boolean[12][6];

			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 6; j++) {
					if (!visited[i][j] && map[i][j] != '.') {
						list = new ArrayList<>();
						dfs(i, j, map[i][j]);
						if (list.size() >= 4) {
							puyo = true;
							for (Point p : list) {
								map[p.y][p.x] = '.';
							}
						}
					}
				}
			}

			if (!puyo) {
				break;
			} else {
				answer++;
			}

			reMap();
		}
		System.out.println(answer);
	}

	public static void reMap() {
		for (int i = 0; i < 6; i++) {
			for (int j = 10; j >= 0; j--) {
				for (int k = 11; k > j; k--) {
					if (map[j][i] != '.' && map[k][i] == '.') {
						map[k][i] = map[j][i];
						map[j][i] = '.';
						break;
					}
				}
			}
		}
	}

	public static void dfs(int y, int x, char ch) {
		for (int i = 0; i < 4; i++) {
			int nx = dx[i] + x;
			int ny = dy[i] + y;

			if (0 <= nx && nx < 6 && 0 <= ny && ny < 12) {
				if (!visited[ny][nx] && map[ny][nx] == ch) {
					list.add(new Point(ny, nx));
					visited[ny][nx] = true;
					dfs(ny, nx, ch);
				}
			}
		}
	}

	public static class Point {
		int y, x;

		Point(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}
}
