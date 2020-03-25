package Step16;

import java.io.*;

public class BOJ_2748_FibonacciNum2 {
	static long fibo1 = 0;
	static long fibo2 = 1;
	static long tmp = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		System.out.println(fibonacci(n));
	}

	static long fibonacci(long n) {
		long result;
		if (n == 0) {
			result = 0;
		} else if (n == 1) {
			result = 1;
		} else {
			for(int i = 1; i<n; i++) {
				tmp = fibo1 + fibo2;
				fibo1 = fibo2;
				fibo2 = tmp;
			}
			result = tmp;
		}
		return result;
	}
}
