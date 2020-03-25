import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		System.out.println(fibonacci(n));
		
		sc.close();
	}

	static long fibonacci(long n) {
		if(n == 0) {
			return 0;
		}else {
			long first = 0;
			long second = 1;
			long result = 0;
			for(int i = 1; i<n; i++) {
				result = first + second;
				first = second;
				second = result;
			}
			return result;
		} 
	}
}
