import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
	static int N, K;
	static int visited[] = new int[100001];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		K = scanner.nextInt();
		bfs();
	}
	public static void bfs()
	{
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(N);
		visited[N]=1;
		while(!queue.isEmpty())
		{
			N = queue.poll();
			
			if(N == K)
				break;
			if(N+1 < 100001 && visited[N+1]==0)
			{
				queue.add(N+1);
				visited[N+1]=visited[N]+1;
			}
			if(0 < N-1 && visited[N-1]==0)
			{
				queue.add(N-1);
				visited[N-1]=visited[N]+1;
			}
			if(N*2 < 100001 && visited[N*2]==0)
			{
				queue.add(N*2);
				visited[N*2]=visited[N]+1;
			}
		}
		System.out.println(visited[K]-1);
	}
}