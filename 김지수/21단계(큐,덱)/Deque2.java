import java.util.LinkedList;
import java.util.Deque;
import java.util.Scanner;

public class Deque2 {
		
	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			String command = sc.next();
			
			switch(command) {
			case "push_front":
				deque.addFirst(sc.nextInt());
				break;
			case "push_back":
				deque.addLast(sc.nextInt());
				break;
			case "pop_front":
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.pollFirst());	
				}
				
				break;
			case "pop_back":
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.pollLast());	
				}
				break;
			case "size":
				System.out.println(deque.size());
				break;
			case "empty":
				if(deque.isEmpty()) {
					System.out.println(1);	
				}else {
					System.out.println(0);
				}
				
				break;
			case "front":
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.peekFirst());	
				}
				break;
			case "back":
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.peekLast());	
				}
				break;

			default:
				break;
			}
		}

	}

}
