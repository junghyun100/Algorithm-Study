package Step9;
import java.util.Scanner;

public class Find_Fraction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int line = 1;
		int position;
		int up, down;

		while (X > line) {
			X -= line;
			line++;
		}
		position = X;

		if (line % 2 == 0) {
			up = position;
			down = line - position + 1;
		} else {
			up = line - position + 1;
			down = position;
		}

		System.out.printf("%d/%d\n", up, down);

	}

}
