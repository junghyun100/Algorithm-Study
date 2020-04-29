import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Snake {
	static Scanner sc = new Scanner(System.in);
	static int N; // ���� ũ��
	static int board[][]; // NxN ����
	static int K; // ��� ����
	static int L; // ���� ��ȯ ���� ����
	static char rotate[] = new char[10001];
	static int time = 0; // �ð�
	static int dr[] = { -1, 0, 1, 0 };
    static int dc[] = { 0, 1, 0, -1 };
    static Queue<Position> snake = new LinkedList<>(); // �� ��ǥ
    static int r;
    static int c;
    static int direct = 1; // ����
	/*
	 *     0
	 *   3   1
	 *     2
	 */


	public static void main(String[] args) {

		N = sc.nextInt();
		setBoard();

		K = sc.nextInt();
		setApple();

		L = sc.nextInt(); // ���� ��ȯ ���� ����
		setDirection();

		// �ʱ� ��ġ ����
		r = 1;
		c = 1;
		snake.offer(new Position(r,c));
		board[r][c] = 2;

		show();

		move();

		System.out.println(time);

		/*
		 * ���� ���� �����̸� �÷� �Ӹ��� ����ĭ�� ��ġ��Ų��.
		 * �� �̵��� ĭ�� ����� �ִٸ�, �� ĭ�� �ִ� ����� �������� ������ �������� �ʴ´�.
		 * ���� �̵��� ĭ�� ����� ���ٸ�, �����̸� �ٿ��� ������ ��ġ�� ĭ�� ����ش�. ��, �����̴� ������ �ʴ´�.
		 */

		sc.close();
	}
	static void move() {
		while(true) {
			time++;

			//System.out.println(time);
			// ����ĭ �̵�
			r += dr[direct];
			c += dc[direct];

			// ���̳� ���� ������ break
			if(board[r][c] == 2) {
				break;
			}

			// ��ĭ�� ��� �����̸� �ٿ��� ������ ��ġ�� ĭ�� ����ش�.
			if(board[r][c] == 0){
				Position tail = snake.poll();
				board[tail.r][tail.c] = 0;
			}

			snake.offer(new Position(r, c)); // �̵��� ĭ�� ���� �Ӹ��� ��ġ�����ش�.
			board[r][c] = 2; // 2�� ����

			// ���� ��ȯ
			if(rotate[time] == 'D')
			{
				direct++;
				if(direct > 3) {
					direct = 0;
				}
			}else if(rotate[time] == 'L') {
				direct--;
				if(direct < 0)
					direct = 3;
			}
			//show();
		}
	}

	// print
	static void show() {
		for(int i = 0; i<N+2; i++) {
			for(int j = 0; j<N+2; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println();
	}

	// ���� ����
	static void setBoard() {
		board = new int[N+2][N+2];
		for(int i = 0; i <N+2; i++) {
			for(int j = 0; j < N+2; j++) {
				if(i == 0 || j == 0 || i == N+1 || j == N+1) {
					board[i][j] = 2;
				}
			}
		}
	}

	// �����ġ ����
	static void setApple() {
		for(int i = 0; i < K; i++) { // ��� ��ġ
			int r = sc.nextInt();
			int c = sc.nextInt();

			board[r][c] = 1;
		}
	}

	// ���� ��ȯ ���� ����
	static void setDirection() {
		for(int i = 0; i < L; i++) {
			int X = sc.nextInt();
			char C = sc.next().charAt(0);

			rotate[X] = C;
		}
	}

}
class Position {
	int r;
	int c;

	Position(int r, int c){
		this.r = r;
		this.c = c;
	}
}

