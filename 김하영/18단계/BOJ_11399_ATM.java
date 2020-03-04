import java.util.Arrays;
import java.util.Scanner;

public class BOJ_11399_ATM {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] P = new int[N];
		int sum = 0;
		int result = 0;
		
		for(int i = 0; i < N; i++) {
			P[i] = scanner.nextInt();
		}
		
		Arrays.sort(P);
		
		for(int i = 0; i < N; i++) {
			sum += P[i];
			result += sum;
		}
		
		scanner.close();
		System.out.println(result);
	}
}
