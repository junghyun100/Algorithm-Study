import java.util.Scanner;

public class Robot {
    static int[][] map;
    static int[][] visited;
    static int answer = 0;
    static int dx[] = { -1, 0, 1, 0 };
    static int dy[] = { 0, 1, 0, -1 };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        map = new int[N][M];
        visited = new int[N][M];

        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = scanner.nextInt();
            }
        }
        map[r][c] = 2;
        answer++;
        solve(r, c, d);
    }

    static void solve(int r, int c, int d) {
        int direction = d;
        for (int i = 0; i < 4; i++) {
            direction--;
            if (direction < 0)
                direction = 3;
            int nextx = r + dx[direction];
            int nexty = c + dy[direction];
            if (map[nextx][nexty] != 0)
                continue;
            map[nextx][nexty] = 2;
            answer++;
            solve(nextx, nexty, direction);
            break;
        }
        if (direction == 0 || direction == 2)
            direction = 2 - d;
        else
            direction = 4 - d;
        int nextx = r + dx[direction];
        int nexty = c + dy[direction];
        if (map[nextx][nexty] == 1) {
            System.out.println(answer);
            System.exit(0);
        }
        solve(nextx, nexty, d);
    }
}