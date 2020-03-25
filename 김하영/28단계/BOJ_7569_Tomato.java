
import java.io.*;
import java.util.*;

public class BOJ_7569_Tomato {
	static int[] dx = { -1, 1, 0, 0, 0, 0 };
	static int[] dy = { 0, 0, -1, 1, 0, 0 };
	static int[] dz = { 0, 0, 0, 0, -1, 1 };

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int M = Integer.parseInt(str[0]);
		int N = Integer.parseInt(str[1]);
		int H = Integer.parseInt(str[2]);

		int[][][] box = new int[H][N][M];

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				str = br.readLine().split(" ");
				for (int k = 0; k < M; k++) {
					box[i][j][k] = Integer.parseInt(str[k]);
				}
			}
		}
		BFS(box, N, M, H);
	}

	public static void BFS(int[][][] box, int N, int M, int H) {
		Queue<Point> queue = new LinkedList<Point>();
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if (box[i][j][k] == 1)
						queue.add(new Point(i, j, k));
				}
			}
		}

		while (!queue.isEmpty()) {
			Point Point = queue.poll();
			for (int i = 0; i < 6; i++) {
				int nextX = Point.x + dx[i];
				int nextY = Point.y + dy[i];
				int nextZ = Point.z + dz[i];

				if (nextX < 0 || nextY < 0 || nextZ < 0 || nextX >= N || nextY >= M || nextZ >= H) {
					continue;
				}
				if (box[nextZ][nextX][nextY] != 0) {
					continue;
				}
				box[nextZ][nextX][nextY] = box[Point.z][Point.x][Point.y] + 1;
				queue.add(new Point(nextZ, nextX, nextY));
			}
		}
		int max = 0;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if (box[i][j][k] == 0) {
						System.out.println(-1);
						return;
					}
					max = Math.max(max, box[i][j][k]);
				}
			}
		}
		System.out.println(max - 1);

	}
}

class Point {
	int x;
	int y;
	int z;

	Point(int z, int x, int y) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}