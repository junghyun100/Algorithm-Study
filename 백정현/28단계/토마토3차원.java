import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = { 1, -1, 0, 0, 0, 0 };
	static int[] dy = { 0, 0, 1, -1, 0, 0 };
	static int[] dz = { 0, 0, 0, 0, 1, -1 };
	static int[][][] arr;
	static int count = 0;

	static int N;
	static int M;
	static int L;
	static Queue<Point> Box = new LinkedList<Point>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		arr = new int[L][M][N];

		for (int i = 0; i < L; i++) {
			for (int j = 0; j < M; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < N; k++) {
					arr[i][j][k] = Integer.parseInt(st.nextToken());
					if (arr[i][j][k] == 1) {
						Box.add(new Point(i, j, k, 0));
					}
				}
			}
		}
		dfs();
	}

	public static void dfs() {
		int day = 0;
		while (!Box.isEmpty()) {
			Point temp = Box.poll();
			day = temp.day;
			for (int i = 0; i < 6; i++) {
				int nextX = temp.x + dx[i];
				int nextY = temp.y + dy[i];
				int nextZ = temp.z + dz[i];

				if (0 <= nextX && nextX < L && 0 <= nextY && nextY < M && 0 <= nextZ && nextZ < N) {
					if (arr[nextX][nextY][nextZ] == 0) {
						arr[nextX][nextY][nextZ] = 1;
						Box.add(new Point(nextX, nextY, nextZ, day + 1));
					}
				}
			}
		}

		if (checkAllTomato())
			System.out.println(day);
		else
			System.out.println("-1");
	}

	public static boolean checkAllTomato() {
		for (int i = 0; i < L; i++) {
			for (int j = 0; j < M; j++) {
				for (int k = 0; k < N; k++) {
					if (arr[i][j][k] == 0) {
						return false;
					}
				}
			}
		}
		return true;
	}
}

class Point {
	int x;
	int y;
	int z;
	int day;

	Point(int x, int y, int z, int day) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.day = day;
	}
}