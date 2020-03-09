import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card {
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			queue.offer(i);
		}
		int pollNum = 0;
		while(!queue.isEmpty()) {
			pollNum = queue.poll();
			
			if(queue.isEmpty()) {
				break;
			}else {
				pollNum = queue.poll();
				queue.offer(pollNum);
			}
		}
		System.out.println(pollNum);
		sc.close();
	}
}
