package Step3;
import java.util.Scanner;

public class LessThanX {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		int[] A = new int[N];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = scanner.nextInt();
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] < X) {
				System.out.print(A[i] + " ");
			}
		}
	}

}
