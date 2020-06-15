import java.util.Scanner;

public class Snail{
	static int M;
	static int N;
	static boolean[][] visited;
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		M = sc.nextInt(); // ����
		N = sc.nextInt(); // ����

		visited = new boolean[M][N];

		System.out.println(getCount());
	}

	static int getCount(){
		int cnt = 0;
		int x = 0; // �ʱ� ��ġ
		int y = 0; // �ʱ� ��ġ (0,0)
		int dir = 0; // �ʱ⿡ ����������

		while(true){
			if(visited[y][x]) // ������ ���� �� �湮�ߴ����� �湮�ϰԵǸ� ����
				break;

			visited[y][x] = true;

			int nx = x + dx[dir];
			int ny = y + dy[dir];

			if(nx < 0 || nx >= N || ny < 0 || ny >= M || visited[ny][nx]) // ���� ������ �����ų� �湮�� ��ġ�϶�
			{
				// ���� ȸ��
				if(dir == 3)
					dir = 0;
				else
					dir++;
				cnt++; // ���� ȸ�� ī����
			}

			x += dx[dir]; // ���� ��ġ�� �̵�
			y += dy[dir]; // ���� ��ġ�� �̵�

		}


		return cnt - 1; // �������� �湮�ߴ����� �ٽ� �湮 �� ���ᰡ ��
	}
}