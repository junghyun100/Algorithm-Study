import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tomato {
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	static int[][] arr;
	static int M;
	static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		M = sc.nextInt();
		N = sc.nextInt();
		
		arr = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		bfs();
		
		
		sc.close();
	}
	static void bfs() {
		Queue<Point> queue = new LinkedList<>();
		
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(arr[i][j] == 1) {
					Point p = new Point(i,j);
					queue.add(p);
				}
			}
		}
		
		while(!queue.isEmpty()) {
			Point p = queue.poll();
			
			for (int i = 0; i < 4; i++) {
				int nextX = p.x + dx[i];
				int nextY = p.y + dy[i];
				if (nextX < 0 || nextY < 0 || N <= nextX || M <= nextY)
					continue;
				
				if(arr[nextX][nextY] == 0) {
					queue.add(new Point(nextX, nextY));
					arr[nextX][nextY] = arr[p.x][p.y] + 1;	
				}
				
			}
		}
		
		int max = 0;
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(arr[i][j] == 0) {
					System.out.println(-1);
					return;
				}
				
				if(max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		if(max == 1) {
			System.out.println(0);
		}else {
			System.out.println(max-1);
		}
	}

}
class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
