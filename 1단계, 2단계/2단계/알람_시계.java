import java.util.Scanner;

public class 알람_시계 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int M = scanner.nextInt();

		if (H == 0 && M < 45) {
			H = 23;
			M += 15;
		} else if (H != 0 && M < 45) {
			H -= 1;
			M += 15;
		} else {
			M -= 45;
		}

		System.out.printf("%d %d", H, M);
	}

}
