package ½Ã¹Ä·¹ÀÌ¼Ç;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Escape {
	static Scanner sc = new Scanner(System.in);
	static int R;
	static int C;
	static char[][] map;
	static Queue<Position> water = new LinkedList<>();
	static Queue<Position> hedgehog = new LinkedList<>();
	static boolean[][] visited;
	static boolean[][] visited_water;
	static int beaver_x;
	static int beaver_y;
	static int dx[] = { -1, 0, 1, 0 };
    static int dy[] = { 0, 1, 0, -1 };
	
	public static void main(String[] args) throws Exception {
		R = sc.nextInt();
		C = sc.nextInt();
		
		map = new char[R][C];
		visited = new boolean[R][C];
		visited_water = new boolean[R][C];
		
		setMap();
		
		move();
		
	}
	
	static void move() {
		
		int cnt = 0;
		boolean ok = false;
		
		loop : while(!hedgehog.isEmpty()) {
			int size = water.size();
			for(int i = 0; i < size; i++) {
				Position pos = water.poll();
				int x = pos.x;
				int y = pos.y;

				for (int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    
                    if(nx < 0 || ny < 0 || nx >= R || ny >= C || visited_water[nx][ny] ||map[nx][ny] == 'X' || map[nx][ny] == 'D') {
                            continue;
                    }

                    map[nx][ny] = '*';
                    visited_water[nx][ny] = true;
                    water.add(new Position(nx, ny));
                }
			}
			
			size = hedgehog.size();
			for(int i = 0; i < size; i++) {
				Position pos = hedgehog.poll();
				int x = pos.x;
				int y = pos.y;
				
				if(x == beaver_x && y == beaver_y) {
					ok = true;
					break loop;
				}
				
				for(int j = 0; j< 4; j++) {
					int nx = x + dx[j];
                    int ny = y + dy[j];
                    
                    if(nx < 0 || ny < 0 || nx >= R || ny >= C || visited[nx][ny] || map[nx][ny] == '*' || map[nx][ny] == 'X' ) {
                    		continue;
                    }
                    
                    map[nx][ny] = 'S';
                    visited[nx][ny] = true;
                    hedgehog.add(new Position(nx, ny));
				}
				if(map[x][y] == '*')
					map[x][y] = '*';
				else
					map[x][y] = '.';
			}
			cnt++;
		}
		if(ok) {
			System.out.println(cnt);
		}else {
			System.out.println("KAKTUS");
		}
	}
	
	static void setMap() throws Exception {
		for(int i = 0; i < R; i++) {
			char[] c = sc.next().toCharArray();
			for(int j = 0; j < C; j++) {
				map[i][j] = c[j];
				
				if(c[j] == '*') {
					water.add(new Position(i,j));
					visited_water[i][j] = true;
				}else if(c[j] == 'S') {
					hedgehog.add(new Position(i,j));
					visited[i][j] = true;
				}else if(c[j] == 'D') {
					beaver_x = i;
					beaver_y = j;
				}else {}
			}
		}
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