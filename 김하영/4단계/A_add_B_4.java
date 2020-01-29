import java.util.Scanner;

public class A_add_B_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			System.out.println(A + B);
		}
	}

}
