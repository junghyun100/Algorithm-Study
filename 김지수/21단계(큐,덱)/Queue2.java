import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.util.LinkedList;

public class Queue2 {
	static Queue<Integer> queue = new LinkedList<>();
	static int front = -1;
	static int rear = -1;	
	static BufferedWriter bw;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int rear = -1;
		for(int i = 0; i < N; i++) {
			String[] command = br.readLine().split(" ");

			switch(command[0]) {
			case "push":
				int n = Integer.parseInt(command[1]);
				queue.offer(n);
				rear = n;
				break;
				
			case "pop":
				if(queue.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(queue.poll());
				}
				break;
				
			case "size":
				System.out.println(queue.size());
				break;
				
			case "empty":
				if(queue.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				
				break;
				
			case "front":
				if(queue.isEmpty()){
					System.out.println(-1);
				}else {
					System.out.println(queue.peek());
				}
				
				break;
				
			case "back":
				if(queue.isEmpty()){
					System.out.println(-1);
				}else {
					System.out.println(rear);
				}
				break;

			default:
				break;
			}
			
		}
		
		br.close();
	}
}
