import java.util.ArrayList;
import java.util.Scanner;

public class Virus {
	static boolean[][] connect;
	static boolean[] visited;
	static int N;
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int M = sc.nextInt();
		
		connect = new boolean[N+1][N+1];
		visited = new boolean[N+1];
		
		for (int i = 0; i < M; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			connect[start][end] = true;
			connect[end][start] = true;
		}
		
		dfs(1);
		System.out.println(count);
	}
	static void dfs(int index) {

		visited[index] = true;
		
		for (int i = 1; i < N+1; i++) {
			if(connect[index][i]&& !visited[i]) {
				dfs(i);
				count++;
			}
		}
	}

}
