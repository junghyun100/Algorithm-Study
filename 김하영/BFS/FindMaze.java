package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindMaze {
	static int[] nx = { -1, 0, 1, 0 };
	static int[] ny = { 0, -1, 0, 1 };
	static int N, M;
	static int map[][];
	static boolean visited[][];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		M = scanner.nextInt();
		map = new int[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			String maze = scanner.next();
			for (int j = 0; j < M; j++) {
				map[i][j] = maze.charAt(j) - '0';
			}
		}
		visited[0][0] = true;
		bfs(0, 0);
		System.out.println(map[N - 1][M - 1]);
	}

	public static void bfs(int x, int y) {
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(x, y));

		while (!q.isEmpty()) {
			Point p = q.poll();
			for (int i = 0; i < 4; i++) {
				int nextX = p.x + nx[i];
				int nextY = p.y + ny[i];

				// 다음 좌표가 map의 범위에 벗어나면
				if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
					continue;
				}
				// 이미 방문 했거나 못가는 길(0)인 경우
				if (visited[nextX][nextY] == true || map[nextX][nextY] == 0) {
					continue;
				}
				q.add(new Point(nextX, nextY));
				map[nextX][nextY] = map[p.x][p.y] + 1;
				visited[nextX][nextY] = true;

			}
		}
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
