import java.util.Scanner;

public class 더하기_사이클 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int tmp = N;
		int count = 0;
		
		while(true) {
			int a = tmp/10;
			int b = tmp%10;
			int sum = a+b;
			tmp = b*10 + sum%10;
			count++;
			if (tmp == N) {
				System.out.println(count);
				break;
			}
		}
	}

}
