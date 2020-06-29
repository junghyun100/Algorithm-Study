package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_11724_CC {
	static int N;
	static int M;
	static int[][] map;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N][N];
		visited = new boolean[N];
		int count = 0;
		
		for (int i = 0; i < M; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();

			map[u - 1][v - 1] = 1;
			map[v - 1][u - 1] = 1;
		}

		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				bfs(i);
				count++;
			}
		}

		System.out.println(count);

	}

	public static void bfs(int vertex) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(vertex);
		visited[vertex] = true;

		while (!q.isEmpty()) {
			int v = q.poll();

			for (int i = 0; i < N; i++) {
				if (map[v][i] == 1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}
}