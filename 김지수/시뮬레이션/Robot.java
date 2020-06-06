package �ùķ��̼�;

import java.util.Scanner;

public class Robot {
	static RobotData[] robot;
	static int dx[] = { 0, 1, 0, -1 };
    static int dy[] = { 1, 0, -1, 0 };
    static int A;
	static int B;
	static int[][] map;
	static boolean isEnd = false;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt(); // ����
		B = sc.nextInt(); // ����
		int N = sc.nextInt(); // ��ǥ ����
		int M = sc.nextInt(); // ��� ����
		
		map = new int[B+1][A+1];
		robot = new RobotData[N+1];

		for(int i = 1; i <= N; i++) { // �κ� ��ǥ
			int x = sc.nextInt();
			int y = sc.nextInt();
			char dir = sc.next().charAt(0);
			
			map[y][x] = i; // x,y��ǥ�� i��° �κ�
			robot[i] = new RobotData(x,y,getDirection(dir));  // ��ǥ�� ������ �ִ� �κ� ����
		}

		//print();
		
		for(int i = 1; i <= M; i++) { // ���
			int robotIndex = sc.nextInt();
			char move = sc.next().charAt(0);
			int n = sc.nextInt();
			
			solve(robotIndex, move, n);
			
			if(isEnd)
				break;
		}
		if(!isEnd)
			System.out.println("OK");
		
		sc.close();
	}
	static void solve(int robotIndex, char move, int n) {
		for(int i =0; i < n; i++) {
			RobotData rb = robot[robotIndex];
			if(move == 'R' || move == 'L') { // ȸ��
				int newDir = rotation(rb.dir, move);
				robot[robotIndex] = new RobotData(rb.x, rb.y, newDir);
			}else if(move == 'F') { // �̵�
				int nx = rb.x + dx[rb.dir]; // ���� x��ǥ
				int ny = rb.y + dy[rb.dir]; // ���� y��ǥ
				
				if(1<=nx && nx<=A && 1<=ny && ny<=B) { // ���� ����� ������
					if(map[ny][nx] != 0) { // �κ��� �ִ� ��ǥ
						System.out.println("Robot "+robotIndex +" crashes into robot " + map[ny][nx]);
						isEnd = true;
						return;
					}else { // �浹���� ������ �̵�
						map[rb.y][rb.x] = 0;
						map[ny][nx] = robotIndex;
						robot[robotIndex] = new RobotData(nx,ny,rb.dir);
						//print();
					}
				}else { // ���� �����
					System.out.println("Robot "+robotIndex+" crashes into the wall");
					isEnd = true;
					return;
				}
			}
		}
	}
	
	static void print() {
		System.out.println();
		for(int i =1; i <= B; i++) {
			for(int j = 1; j <= A; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	static int rotation(int dir, char move) { // ȸ��
		if(move == 'L') {
            if(dir == 0){
                dir = 3;
            }else {
                dir--;
            }
            
        }else if(move == 'R') {
            if(dir==3) {
                dir = 0;
            }else {
                dir++;
            }
        }
        return dir;
	}
	
	static int getDirection(char dir) { // �������� ����
		switch(dir) {
		case 'N':
			return 0;
		case 'E':
			return 1;
		case 'S':
			return 2;
		case 'W':
			return 3;

		}
		return 0;
	}

}
class RobotData{
	int x,y;
	int dir;
	
	public RobotData(int x, int y, int dir) {
		this.x = x;
		this.y = y;
		this.dir = dir;
	}	
}
