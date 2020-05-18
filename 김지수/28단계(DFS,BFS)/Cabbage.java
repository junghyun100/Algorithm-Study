import java.util.PriorityQueue;
import java.util.Scanner;

public class Cabbage {
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	static boolean[][] visited;
	static int[][] arr;
	static int count=0;

	static int N;
	static int M;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		for(int i = 0; i < T; i++) {

			N = sc.nextInt();
			M = sc.nextInt();
			int K = sc.nextInt();
			arr = new int[N][M];
			visited = new boolean[N][M];
			
			int apartmentFlex = 0;
			PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
			
			for(int j = 0; j < K; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				arr[x][y] = 1;
			}
			
			
			for(int j = 0; j< N; j++) {
				for(int k = 0; k<M; k++) {
					if(arr[j][k] == 1) {
						count= 0;
						dfs(j,k);
						if(count != 0) {
							apartmentFlex++;
							priorityQueue.add(count);
						}
					}
				}
			}

			System.out.println(apartmentFlex);
		}
		sc.close();
	}
	public static void dfs(int x, int y) {
		if(visited[x][y] == true)
			return;
		
		visited[x][y] = true;
		count++;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (0 <= nx && nx < N && ny < M && 0 <= ny) {
				if (arr[nx][ny] == 1) {
					dfs(nx, ny);
				}
			}
		}
	}

}
