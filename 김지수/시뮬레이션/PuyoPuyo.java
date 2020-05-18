package 시뮬레이션;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PuyoPuyo {
	static char[][] map = new char[12][6];
	static int dx[] = { -1, 0, 1, 0 };
	static int dy[] = { 0, 1, 0, -1 };
	static ArrayList<Position> deleteList; // 지워야할 위치가 저장된 리스트
	static boolean[][] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		// map에 입력받기
		for(int i = 0; i < 12; i++) {
			map[i] = sc.next().toCharArray();
		}

		while(true) {
			deleteList = new ArrayList<>();
			visited = new boolean[12][6];
			
			for(int i = 11; i>=0; i--) {
				for(int j = 0; j<6; j++) {
					// 같은 색 뿌요가 4개이상이면 터짐
					if(map[i][j] != '.' && !visited[i][j] && check(i,j) >=4) {
						deleteList.add(new Position(j,i)); // 터진 위치를 deleteList에 추가
					}
				}
			}
			
			// 터질게 없으면 break;
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
				boolean isTrue = false; // 내려야 하는지 체크
				
				while(next<11 && map[next+1][j] == '.' && map[i][j] != '.') { // 아래칸이 빈칸이면
					next++;
					isTrue = true;
				}
				if(isTrue) {
					map[next][j] = map[i][j]; // 한칸 아래에 덮어씌우고
					map[i][j] = '.'; // 빈칸으로 만듬
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
			map[y][x] = '.'; // 터진곳 빈칸으로
			
			for(int d=0; d<4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				// 범위밖이면 continue
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