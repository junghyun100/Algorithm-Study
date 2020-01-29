package Step3;
import java.util.Scanner;

public class N_OutputReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int i = N; i > 0; i--) {
			System.out.println(i);
		}
	}

}
