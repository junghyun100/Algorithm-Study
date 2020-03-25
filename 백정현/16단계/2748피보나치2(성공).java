import java.util.Scanner;

public class Main{
	static long[] visited = new long[91];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		System.out.println(fibonach(N));
	}
	private static long fibonach(int index)
	{
		if(index <= 1) return index;
		else if(visited[index] !=0) return visited[index];
		visited[index] = fibonach(index-2)+ fibonach(index-1);
		return visited[index];
	}
}