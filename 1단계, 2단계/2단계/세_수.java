import java.util.Scanner;

public class ¼¼_¼ö {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		if ((A >= B && A <= C) || (A >= C && A <= B)) {
			System.out.println(A);
		} else if ((A <= B && B <= C) || (C <= B && B <= A)) {
			System.out.print(B);
		} else {
			System.out.print(C);
		}
	}

}
