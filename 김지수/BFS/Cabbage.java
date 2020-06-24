import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cabbage {
	static int[][] map;
	static boolean[][] visited;
	static int M, N, K;
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			M = sc.nextInt();
			N = sc.nextInt();
			K = sc.nextInt();
			
			map = new int[M][N];
			visited = new boolean[M][N];
			int worm = 0;
			
			// 배추가 심어진 좌표 입력
			for(int j = 0; j < K; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				map[x][y] = 1;
			}
			
			for(int j = 0; j < M; j++) {
				for(int k = 0; k < N; k++) {
					if(map[j][k] == 1 && !visited[j][k]) {
						worm++;
						bfs(j,k);
					}
				}
			}
			
			System.out.println(worm);
		}
		
		sc.close();
	}
	static void bfs(int x, int y) {
		Queue<Point> queue = new LinkedList<>();
		queue.add(new Point(x,y));
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			Point p = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				
				if(nx < 0 || ny < 0 || nx >= M || ny >= N)
					continue;
				
				if(map[nx][ny] == 1 && !visited[nx][ny]) {
					queue.add(new Point(nx,ny));
					visited[nx][ny] = true;
				}
			}
		}
		
	}
	
	static class Point{
		int x, y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
