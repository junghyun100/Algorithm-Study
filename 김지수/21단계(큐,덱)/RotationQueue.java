import java.util.ArrayList;
import java.util.Scanner;

public class RotationQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> deque = new ArrayList<>();
		int N = sc.nextInt();
		int M = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= N; i++) {
			deque.add(i);
		}
		for(int i = 0; i < M; i++) {
			int num = sc.nextInt();
			
			while(true) {
				if(num == deque.get(0)) {
					deque.remove(0);
					break;
				}else if((deque.size()/2) >= deque.indexOf(num)) {
					deque.add(deque.size()-1, deque.remove(0));
					count++;	
				}else {
					deque.add(0, deque.remove(deque.size()-1));
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}

}
