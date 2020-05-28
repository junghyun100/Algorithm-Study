package �ùķ��̼�;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PuyoPuyo {
	static char[][] map = new char[12][6];
	static int dx[] = { -1, 0, 1, 0 };
	static int dy[] = { 0, 1, 0, -1 };
	static ArrayList<Position> deleteList; // �������� ��ġ�� ����� ����Ʈ
	static boolean[][] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		// map�� �Է¹ޱ�
		for(int i = 0; i < 12; i++) {
			map[i] = sc.next().toCharArray();
		}

		while(true) {
			deleteList = new ArrayList<>();
			visited = new boolean[12][6];
			
			for(int i = 11; i>=0; i--) {
				for(int j = 0; j<6; j++) {
					// ���� �� �ѿ䰡 4���̻��̸� ����
					if(map[i][j] != '.' && !visited[i][j] && check(i,j) >=4) {
						deleteList.add(new Position(j,i)); // ���� ��ġ�� deleteList�� �߰�
					}
				}
			}
			
			// ������ ������ break;
			if(deleteList.size() == 0)
				break;
			
			
			for(int i = 0; i<deleteList.size(); i++) {
				delete(deleteList.get(i).y, deleteList.get(i).x);
			}
			down();
			result++;
		}
		System.out.println(result);
		
		sc.close();
	}

	static void down() {
		for(int i = 10; i>=0; i--) {
			for(int j = 0; j<6; j++) {
				int next = i;
				boolean isTrue = false; // ������ �ϴ��� üũ
				
				while(next<11 && map[next+1][j] == '.' && map[i][j] != '.') { // �Ʒ�ĭ�� ��ĭ�̸�
					next++;
					isTrue = true;
				}
				if(isTrue) {
					map[next][j] = map[i][j]; // ��ĭ �Ʒ��� ������
					map[i][j] = '.'; // ��ĭ���� ����
				}
			}
		}
	}
	
	static void delete(int i, int j) {
		char ch = map[i][j];
		Queue<Position> queue = new LinkedList<>();
		queue.add(new Position(j,i));
		
		while(!queue.isEmpty()) {
			Position p = queue.poll();
			int x = p.x;
			int y = p.y;
			map[y][x] = '.'; // ������ ��ĭ����
			
			for(int d=0; d<4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				// �������̸� continue
				if(nx < 0 || ny < 0 || nx >=6 || ny >= 12)
					continue;
				
				// 
				if(map[ny][nx] == ch)
					queue.add(new Position(nx,ny));
			}
		}
	}
	
	static int check(int i, int j) {
		char ch = map[i][j];
		int cnt=0;
		Queue<Position> queue = new LinkedList<>();
		queue.add(new Position(j,i));
		
		while(!queue.isEmpty()) {
			Position p = queue.poll();
			visited[p.y][p.x]= true;
			cnt++;
			
			for(int d = 0; d<4; d++) {
				int nx = p.x + dx[d];
				int ny = p.y + dy[d];
				
				if(nx < 0 || ny < 0 || nx >=6 || ny >= 12 || visited[ny][nx])
					continue;
				if(map[ny][nx] == ch)
					queue.add(new Position(nx,ny));
			}
		}
		
		return cnt;
	}

	
}
class Position {
	int x;
	int y;

	Position(int x, int y){
		this.x = x;
		this.y = y;
	}
}