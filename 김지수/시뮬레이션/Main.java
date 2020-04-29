import java.util.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	static int map[][]; // ��
	static int N; // ���� ũ��
	static int K; // ����� ����
	static int L; // ���� ���� ��ȯ Ƚ��
	static char[] direction = new char[10001]; // ���� ��ȯ ����
	static Queue<Position> snake = new LinkedList<>();
	static int head_r; // ���� �Ӹ��� row ��ǥ
	static int head_c; // �� �Ӹ��� column ��ǥ
	static int time = 0; // �ð�

	// ����
	/*
	  		0
	   	  3	  1
		    2
	*/
	// ���������� ȸ���ϸ� cur_direction�� 1�� �þ�ϴ�.
	// �������� ȸ���ϸ� cur_direction�� 1�� �پ��ϴ�.
	static int dr[] = { -1, 0, 1, 0 };
    static int dc[] = { 0, 1, 0, -1 };
    static int cur_direction = 1; // ���� ���� (������)

	// ���� ������ ���� Queue�� �����ϰڽ��ϴ�.
	// ����� ������ ���� �� ���̰� �þ���� ��ĭ���� �̵��ϸ� �������ִ� �κ��� ��ĭ���θ����
	// ����ĭ���� �̵��ϰԵ˴ϴ�. �׷������� ���� ������ ��ǥ�� poll ���ָ� �˴ϴ�.
	public static void main(String[] args){
		N = sc.nextInt(); // ���� ũ��
		map = new int[N+2][N+2]; // ���� ũ�� �����ؼ�
		setMap();

		K = sc.nextInt(); // ����� ����
		setApple();

		L = sc.nextInt();
		setDirection();

		// �ʱ� �� ��ǥ ����
		head_r = 1;
		head_c = 1;
		snake.offer(new Position(head_r,head_c));
		map[head_r][head_c] = 3;

		move();

		System.out.println(time);
	}

	static void move(){

		// ���̳� �ڽ��� ���� �ε��������� ��� �ݺ�
		while(true){
			time++; // 1�ʸ��� �̵�

			head_r += dr[cur_direction]; // ������ġ
			head_c += dc[cur_direction]; // ������ġ

			// ������ġ�� ���� ���̳� ���̸�
			// ���� 3���� ǥ���ϰڽ��ϴ�.
			// �̺κп��� break �ǳ׿�
			if(map[head_r][head_c] == 2 || map[head_r][head_c] == 3){
				//map[head_r][head_c] == 3
				break;
			}

			// ������ġ�� ��ĭ�̸�
			// ��ĭ = 0
			// ���� �̵��� ĭ�� ����� ���ٸ�, �����̸� �ٿ��� ������ ��ġ�� ĭ�� ����ش�.
			// ��, �����̴� ������ �ʴ´�.
			if(map[head_r][head_c] == 0){
				Position tail = snake.poll(); // ����
				map[tail.r][tail.c] = 0; // 3�̾��� �κ��� �ٽ� ��ĭ����
			}

			// �̵��� ��ġ�� queue�� �ֽ��ϴ�.
			snake.offer(new Position(head_r, head_c));
			map[head_r][head_c] = 3; // �̵��� ��ġ�� ���� �Ӹ��� �ֽ��ϴ�. 3

			// �̵� �� ���� ��ȯ������ Ȯ���Ͽ� �ش�� �ð��� ������ ��ȯ�մϴ�.
			if(direction[time] == 'D'){ // ������
				cur_direction++;
				if(cur_direction > 3)
					cur_direction = 0;
			}else if(direction[time] == 'L'){ // ����
				cur_direction--;
				if(cur_direction < 0)
					cur_direction = 3;
			}

			//print();
		}
	}

	// ��� ����
	// ����� �ִºκ��� 1�� ǥ���ϰڽ��ϴ�.
	static void setApple(){
		for(int i = 0; i < K; i++){
			int r = sc.nextInt(); // row
			int c = sc.nextInt(); // column

			map[r][c] = 1;
		}
	}

	// ���� ���� �������ְڽ��ϴ�.
	// ���� 2�� �������ְڽ��ϴ�.
	static void setMap(){
		for(int i = 0; i < N+2; i++){
			for(int j = 0; j < N+2; j++){
				if(i == 0 || i == N+1 || j == 0 || j == N+1){
					map[i][j] = 2;
				}
			}
		}
	}

	// �ش� �ε����� ���⺯ȯ ������ ��
	static void setDirection(){
		for(int i = 0; i < L; i++){
			int X = sc.nextInt();
			char C = sc.next().charAt(0);

			direction[X] = C;
		}
	}


	// ������� ��������� ����� ����
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

// ��ǥ�� ������ Ŭ����
class Position{
	int r;
	int c;

	Position(int r, int c){
		this.r = r;
		this.c = c;
	}
}
