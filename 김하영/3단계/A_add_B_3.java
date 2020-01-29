package Step3;
import java.util.Scanner;

public class A_add_B_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		for (int i = 0; i < T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			System.out.println(A + B);
		}
	}

}
