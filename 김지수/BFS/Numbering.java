import java.util.*;

public class Numbering{
	static int N;
	static int[][] map;
	static boolean[][] visited;
	static int apartNum; // ���� ����
	static int[] aparts;
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		visited = new boolean[N][N];
		map = new int[N][N];
		aparts = new int[N*N];

		// �Է� �ޱ�
		for(int i = 0; i < N; i++){
			String input = sc.next();
			for(int j = 0; j < N; j++){
				map[i][j] = input.charAt(j) - '0';
			}
		}

		// ù��° �ε������� Ž��
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				// ���� �ִ°��϶�, �湮���� ������ �϶�
				if(map[i][j] == 1 && !visited[i][j]){
					apartNum++;
					bfs(i,j);
				}
			}
		}

		System.out.println(apartNum);

		Arrays.sort(aparts); // �������� ����

		// aprats ������ N*N�� �����Ƿ� N*N���� arpatNum�� �� ��ġ���� N*N���� �ݺ�
		int start = N*N - apartNum;
		int end = N*N;

		for(int i = start; i < end; i++){
			System.out.println(aparts[i]);
		}
	}

	public static void bfs(int x, int y){
		Queue<Point> queue = new LinkedList<>();
		queue.add(new Point(x,y)); // ������ ù��° ��ǥ
		visited[x][y] = true; // �湮
		aparts[apartNum]++;

		while(!queue.isEmpty()){
			Point p = queue.poll();

			for(int i = 0; i < 4; i++){
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];

				if(nx < 0 || ny < 0 || nx >= N || ny >= N) // ������
					continue;

				// �����Ȱ��� 1�̸� , �湮���� �������̸�
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