import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static int Box[][];
	static int visited[][];
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		Box = new int[M][N];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < N; j++) {
				Box[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		bfs();
	}

	static void bfs() {
		Queue<point> queue = new LinkedList<point>();
		int day = 0;

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (Box[i][j] == 1) {
					queue.add(new point(i, j, day));
				}
			}
		}
		while (!queue.isEmpty()) {
			point temp = queue.poll();
			day = temp.day;
			for (int i = 0; i < 4; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];

				if (0 <= nx && nx < M && 0 <= ny && ny < N) {
					if (Box[nx][ny] == 0) {
						Box[nx][ny] = 1;
						queue.add(new point(nx, ny, day + 1));
					}
				}
			}
		}
		if (checkAllTomato())
			System.out.println(day);
		else
			System.out.println("-1");
	}

	static boolean checkAllTomato() {
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (Box[i][j] == 0)
					return false;
			}
		}
		return true;
	}
}

class point {
	int x;
	int y;
	int day;

	point(int x, int y, int day) {
		this.x = x;
		this.y = y;
		this.day = day;
	}
}