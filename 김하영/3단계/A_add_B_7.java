import java.util.Scanner;

public class A_add_B_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		for (int i = 1; i <= 5; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			System.out.printf("Case #%d: %d\n", i, A + B);
		}
	}

}
