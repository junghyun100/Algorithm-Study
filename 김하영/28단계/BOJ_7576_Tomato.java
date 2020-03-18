package Step28;

import java.io.*;
import java.util.*;

public class BOJ_7576_Tomato {
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int M = Integer.parseInt(str[0]);
		int N = Integer.parseInt(str[1]);

		int[][] box = new int[N][M];

		for (int i = 0; i < N; i++) {
			str = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				box[i][j] = Integer.parseInt(str[j]);

			}
		}
		BFS(box, N, M);
	}

	public static void BFS(int[][] box, int N, int M) {
		Queue<Point> queue = new LinkedList<Point>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (box[i][j] == 1)
					queue.add(new Point(i, j));
			}
		}

		while (!queue.isEmpty()) {
			Point Point = queue.poll();
			for (int i = 0; i < 4; i++) {
				int nextX = Point.x + dx[i];
				int nextY = Point.y + dy[i];

				if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
					continue;
				}
				if (box[nextX][nextY] != 0) {
					continue;
				}
				box[nextX][nextY] = box[Point.x][Point.y] + 1;
				queue.add(new Point(nextX, nextY));
			}
		}
		int max = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (box[i][j] == 0) {
					System.out.println(-1);
					return;
				}
				max = Math.max(max, box[i][j]);
			}
		}
		System.out.println(max - 1);

	}
}

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}