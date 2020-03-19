import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tomato2 {
	static int[] dx = {1,0,-1,0,0,0};
	static int[] dy = {0,1,0,-1,0,0};
	static int[] dz = {0,0,0,0,1,-1};
	static int[][][] arr;
	static int M;
	static int N;
	static int H;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		M = sc.nextInt();
		N = sc.nextInt();
		H = sc.nextInt();
		
		arr = new int[H][N][M];
				
		for(int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					arr[i][j][k] = sc.nextInt();	
				}
			}
		}
		
		bfs();
		
		
		sc.close();
	}
	static void bfs() {
		Queue<Point> queue = new LinkedList<>();
		
		for(int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if(arr[i][j][k] == 1) {
						Point p = new Point(i,j, k);
						queue.add(p);
					}	
				}
			}
		}
		
		while(!queue.isEmpty()) {
			Point p = queue.poll();
			
			for (int i = 0; i < 6; i++) {
				int nextX = p.x + dx[i];
				int nextY = p.y + dy[i];
				int nextZ = p.z + dz[i];
				if (nextX < 0 || nextY < 0 || N <= nextX || M <= nextY
						|| nextZ < 0 || H <= nextZ)
					continue;
				
				if(arr[nextZ][nextX][nextY] == 0) {
					queue.add(new Point(nextZ, nextX, nextY));
					arr[nextZ][nextX][nextY] = arr[p.z][p.x][p.y] + 1;	
				}
				
			}
		}
		
		int max = 0;
		for(int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if(arr[i][j][k] == 0) {
						System.out.println(-1);
						return;
					}	

					if(max < arr[i][j][k]) {
						max = arr[i][j][k];
					}
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
	int z;
	
	Point(int z, int x, int y){
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
