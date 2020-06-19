import java.util.*;

public class Numbering{
	static int N;
	static int[][] map;
	static boolean[][] visited;
	static int apartNum; // 단지 개수
	static int[] aparts;
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		visited = new boolean[N][N];
		map = new int[N][N];
		aparts = new int[N*N];

		// 입력 받기
		for(int i = 0; i < N; i++){
			String input = sc.next();
			for(int j = 0; j < N; j++){
				map[i][j] = input.charAt(j) - '0';
			}
		}

		// 첫번째 인덱스부터 탐색
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				// 집이 있는곳일때, 방문하지 않은곳 일때
				if(map[i][j] == 1 && !visited[i][j]){
					apartNum++;
					bfs(i,j);
				}
			}
		}

		System.out.println(apartNum);

		Arrays.sort(aparts); // 오름차순 정렬

		// aprats 개수가 N*N개 있으므로 N*N에서 arpatNum을 뺀 위치부터 N*N까지 반복
		int start = N*N - apartNum;
		int end = N*N;

		for(int i = start; i < end; i++){
			System.out.println(aparts[i]);
		}
	}

	public static void bfs(int x, int y){
		Queue<Point> queue = new LinkedList<>();
		queue.add(new Point(x,y)); // 단지의 첫번째 좌표
		visited[x][y] = true; // 방문
		aparts[apartNum]++;

		while(!queue.isEmpty()){
			Point p = queue.poll();

			for(int i = 0; i < 4; i++){
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];

				if(nx < 0 || ny < 0 || nx >= N || ny >= N) // 범위밖
					continue;

				// 인접된곳이 1이면 , 방문하지 않은곳이면
				if(map[nx][ny] == 1 && !visited[nx][ny]){
					queue.add(new Point(nx,ny));
					visited[nx][ny] = true;
					aparts[apartNum]++;
				}
			}
		}
	}

	public static class Point{
		int x,y;

		public Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}