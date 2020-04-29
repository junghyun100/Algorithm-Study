import java.util.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	static int map[][]; // 맵
	static int N; // 맵의 크기
	static int K; // 사과의 개수
	static int L; // 뱀의 방향 변환 횟수
	static char[] direction = new char[10001]; // 방향 변환 정보
	static Queue<Position> snake = new LinkedList<>();
	static int head_r; // 뱀의 머리의 row 좌표
	static int head_c; // 뱀 머리의 column 좌표
	static int time = 0; // 시간

	// 방향
	/*
	  		0
	   	  3	  1
		    2
	*/
	// 오른쪽으로 회전하면 cur_direction는 1씩 늘어납니다.
	// 왼쪽으로 회전하면 cur_direction는 1씩 줄어듭니다.
	static int dr[] = { -1, 0, 1, 0 };
    static int dc[] = { 0, 1, 0, -1 };
    static int cur_direction = 1; // 현재 방향 (오른쪽)

	// 뱀의 정보를 담을 Queue를 선언하겠습니다.
	// 사과를 먹으면 뱀의 몸 길이가 늘어나지만 빈칸으로 이동하면 이전에있던 부분을 빈칸으로만들고
	// 다음칸으로 이동하게됩니다. 그러기위해 가장 먼저들어간 죄표를 poll 해주면 됩니다.
	public static void main(String[] args){
		N = sc.nextInt(); // 맵의 크기
		map = new int[N+2][N+2]; // 벽의 크기 포함해서
		setMap();

		K = sc.nextInt(); // 사과의 개수
		setApple();

		L = sc.nextInt();
		setDirection();

		// 초기 뱀 좌표 설정
		head_r = 1;
		head_c = 1;
		snake.offer(new Position(head_r,head_c));
		map[head_r][head_c] = 3;

		move();

		System.out.println(time);
	}

	static void move(){

		// 벽이나 자신의 몸에 부딪힐때까지 계속 반복
		while(true){
			time++; // 1초마다 이동

			head_r += dr[cur_direction]; // 다음위치
			head_c += dc[cur_direction]; // 다음위치

			// 다음위치가 만약 벽이나 몸이면
			// 몸을 3으로 표현하겠습니다.
			// 이부분에서 break 되네요
			if(map[head_r][head_c] == 2 || map[head_r][head_c] == 3){
				//map[head_r][head_c] == 3
				break;
			}

			// 다음위치가 빈칸이면
			// 빈칸 = 0
			// 만약 이동한 칸에 사과가 없다면, 몸길이를 줄여서 꼬리가 위치한 칸을 비워준다.
			// 즉, 몸길이는 변하지 않는다.
			if(map[head_r][head_c] == 0){
				Position tail = snake.poll(); // 꼬리
				map[tail.r][tail.c] = 0; // 3이었던 부분을 다시 빈칸으로
			}

			// 이동한 위치를 queue에 넣습니다.
			snake.offer(new Position(head_r, head_c));
			map[head_r][head_c] = 3; // 이동한 위치에 뱀의 머리를 넣습니다. 3

			// 이동 후 방향 전환정보를 확인하여 해당된 시간에 방향을 변환합니다.
			if(direction[time] == 'D'){ // 오른쪽
				cur_direction++;
				if(cur_direction > 3)
					cur_direction = 0;
			}else if(direction[time] == 'L'){ // 왼쪽
				cur_direction--;
				if(cur_direction < 0)
					cur_direction = 3;
			}

			//print();
		}
	}

	// 사과 세팅
	// 사과가 있는부분을 1로 표현하겠습니다.
	static void setApple(){
		for(int i = 0; i < K; i++){
			int r = sc.nextInt(); // row
			int c = sc.nextInt(); // column

			map[r][c] = 1;
		}
	}

	// 맵의 벽을 설정해주겠습니다.
	// 벽은 2로 설정해주겠습니다.
	static void setMap(){
		for(int i = 0; i < N+2; i++){
			for(int j = 0; j < N+2; j++){
				if(i == 0 || i == N+1 || j == 0 || j == N+1){
					map[i][j] = 2;
				}
			}
		}
	}

	// 해당 인덱스에 방향변환 정보가 들어감
	static void setDirection(){
		for(int i = 0; i < L; i++){
			int X = sc.nextInt();
			char C = sc.next().charAt(0);

			direction[X] = C;
		}
	}


	// 정답과는 상관없지만 출력을 위해
	static void print(){
		for(int i = 0; i < N+2; i++){
			for(int j = 0; j < N+2; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}

// 좌표를 저장할 클래스
class Position{
	int r;
	int c;

	Position(int r, int c){
		this.r = r;
		this.c = c;
	}
}
