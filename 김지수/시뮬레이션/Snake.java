import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Snake {
	static Scanner sc = new Scanner(System.in);
	static int N; // 보드 크기
	static int board[][]; // NxN 보드
	static int K; // 사과 개수
	static int L; // 방향 변환 정보 개수
	static char rotate[] = new char[10001];
	static int time = 0; // 시간
	static int dr[] = { -1, 0, 1, 0 };
    static int dc[] = { 0, 1, 0, -1 };
    static Queue<Position> snake = new LinkedList<>(); // 뱀 좌표
    static int r;
    static int c;
    static int direct = 1; // 방향
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

		L = sc.nextInt(); // 방향 변환 정보 개수
		setDirection();

		// 초기 위치 설정
		r = 1;
		c = 1;
		snake.offer(new Position(r,c));
		board[r][c] = 2;

		move();

		//show();
		System.out.println(time);

		/*
		 * 먼저 뱀은 몸길이를 늘려 머리를 다음칸에 위치시킨다.
		 * 약 이동한 칸에 사과가 있다면, 그 칸에 있던 사과가 없어지고 꼬리는 움직이지 않는다.
		 * 만약 이동한 칸에 사과가 없다면, 몸길이를 줄여서 꼬리가 위치한 칸을 비워준다. 즉, 몸길이는 변하지 않는다.
		 */

		sc.close();
	}
	static void move() {
		while(true) {
			time++;

			//System.out.println(time);
			// 다음칸 이동
			r += dr[direct];
			c += dc[direct];

			// 벽이나 몸에 닿을시 break
			if(board[r][c] == 2) {
				break;
			}

			// 빈칸일 경우 몸길이를 줄여서 꼬리가 위치한 칸을 비워준다.
			if(board[r][c] == 0){
				Position tail = snake.poll();
				board[tail.r][tail.c] = 0;
			}

			snake.offer(new Position(r, c)); // 이동한 칸에 뱀의 머리를 위치시켜준다.
			board[r][c] = 2; // 2로 변경

			// 방향 전환
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

	// 보드 세팅
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

	// 사과위치 세팅
	static void setApple() {
		for(int i = 0; i < K; i++) { // 사과 위치
			int r = sc.nextInt();
			int c = sc.nextInt();

			board[r][c] = 1;
		}
	}

	// 방향 전환 정보 세팅
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

