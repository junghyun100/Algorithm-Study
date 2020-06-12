import java.util.*;
import java.io.*;

class Iceberg {
    static int N;
    static int M;
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };

    static int[][] map;
    static int[][] visited;
    static int[][] melt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new int[N][M];
        melt = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution();
    }

    static void solution() {
        int year = 0;

        while (true) {
            // dfs 로 빙산 덩어리 세기
            int count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (visited[i][j] == 0 && map[i][j] != 0) {
                        dfs(i, j);
                        count++;
                    }
                }
            }

            if (count == 0) {
                System.out.println(0);
                break;
            } else if (count >= 2) {
                System.out.println(year);
                break;
            }

            melting();
            year++;
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = 1;

        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (0 <= nextX && nextX < N && 0 <= nextY && nextY < M) {
                // 1년 후에 녹는 빙산의 양 구하기
                if (map[nextX][nextY] == 0)
                    melt[x][y]++;

                // dfs 재귀
                if (visited[nextX][nextY] == 0 && map[nextX][nextY] != 0)
                    dfs(nextX, nextY);
            }
        }
    }

    static void melting() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] -= melt[i][j];// 1. 빙산 녹이기

                if (map[i][j] < 0)//2. 만약 녹인 높이가 음수가 되면 0으로 바꿔주기
                    map[i][j] = 0;

                visited[i][j] = 0;//3. visited 초기화
                melt[i][j] = 0;//4. melt 초기화
            }
        }
    }
}