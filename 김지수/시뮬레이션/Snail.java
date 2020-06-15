import java.util.Scanner;

public class Snail{
	static int M;
	static int N;
	static boolean[][] visited;
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		M = sc.nextInt(); // 세로
		N = sc.nextInt(); // 가로

		visited = new boolean[M][N];

		System.out.println(getCount());
	}

	static int getCount(){
		int cnt = 0;
		int x = 0; // 초기 위치
		int y = 0; // 초기 위치 (0,0)
		int dir = 0; // 초기에 오른쪽으로

		while(true){
			if(visited[y][x]) // 끝까지 돌고난 후 방문했던곳을 방문하게되면 종료
				break;

			visited[y][x] = true;

			int nx = x + dx[dir];
			int ny = y + dy[dir];

			if(nx < 0 || nx >= N || ny < 0 || ny >= M || visited[ny][nx]) // 범위 밖으로 나가거나 방문한 위치일때
			{
				// 방향 회전
				if(dir == 3)
					dir = 0;
				else
					dir++;
				cnt++; // 방향 회전 카운팅
			}

			x += dx[dir]; // 다음 위치로 이동
			y += dy[dir]; // 다음 위치로 이동

		}


		return cnt - 1; // 마지막에 방문했던곳을 다시 방문 후 종료가 됨
	}
}