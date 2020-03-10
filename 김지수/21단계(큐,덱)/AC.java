import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class AC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isReverse;
		boolean isError;
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			String strAC = sc.next();
			int N = sc.nextInt();
			String strElement = sc.next();
			isReverse = false;
			isError = false;
			strElement = strElement.replace("[", "");
			strElement = strElement.replace("]", "");
			Deque<String> deque = new LinkedList<>();
			String[] element = strElement.split(",");
			
			for (int j = 0; j < element.length; j++) {
				deque.add(element[j]);
			}
			for (int j = 0; j < strAC.length(); j++) {
				if(strAC.charAt(j) == 'R') {
					isReverse = !isReverse;
				}else if(strAC.charAt(j) == 'D') {
					if(deque.isEmpty()) {
						isError = true;
						break;
					}else {
						if(isReverse) {
							deque.pollLast();
						}else {
							deque.pollFirst();
						}
					}
						
				}
			}
			if(isError) {
				System.out.println("error");
			}else {
				System.out.print("[");
				if(isReverse) {
					for(int j = 0; j<deque.size() -1; j++) {
						System.out.print(deque.pollFirst() + ",");
					}
				}else {
					for(int j = 0; j<deque.size()-1; j++) {
						System.out.print(deque.pollLast() + ",");
					}
				}
				System.out.println(deque.poll() + "]");
			}
			
			
		}
		
		sc.close();
	}

}
