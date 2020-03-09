import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Josephus {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();	
		Queue<Integer> queueResult = new LinkedList<>();	
		int N = sc.nextInt();
		int K = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			queue.offer(i);
		}

		int i =0;
		int cnt = 0;
		while(i != N) {
			int pollNum = queue.poll();
			
			cnt++;
			if(cnt == K) {
				queueResult.offer(pollNum);
				cnt=0;
				i++;
			}else {
				queue.offer(pollNum);
			}
		}

		System.out.print("<");
		for(int j = 0; j<N; j++) {
			if(j == N-1) {
				System.out.print(queueResult.poll() + ">");
			}else {
				System.out.print(queueResult.poll() + ", ");
			}
		}
		sc.close();
	}
}
